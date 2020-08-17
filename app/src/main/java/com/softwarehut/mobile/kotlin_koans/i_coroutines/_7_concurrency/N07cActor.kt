package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.actor

private val todo = """
    
"""

sealed class CustomerCounterMsg
object IncrementCustomersCount: CustomerCounterMsg()
class GetCustomerCount(val response: CompletableDeferred<Int>) : CustomerCounterMsg()

fun CoroutineScope.counterActor() = actor<CustomerCounterMsg> {
    var customersCounter = 0

    for (msg in channel) {
        when (msg) {
            is IncrementCustomersCount -> {
                customersCounter++
            }
            is GetCustomerCount -> {
                msg.response.complete(customersCounter)
            }
        }
    }
}

suspend fun task7c(): CustomerCount {
    return coroutineScope {
        val actor = counterActor() // create the actor
        withContext(Dispatchers.Default) {
            countTotalCustomers {
                actor.send(IncrementCustomersCount)
            }
        }
        val response = CompletableDeferred<Int>()
        actor.send(GetCustomerCount(response))
        val customersCount = response.await()
        actor.close()
        return@coroutineScope CustomerCount(customersCount)
    }
}

private suspend fun countTotalCustomers(action: suspend () -> Unit) {
    coroutineScope {
        val shops = 32
        val customersPerShop = 32
        repeat(shops) {
            launch {
                repeat(customersPerShop) {
                    action()
                }
            }
        }
    }
}