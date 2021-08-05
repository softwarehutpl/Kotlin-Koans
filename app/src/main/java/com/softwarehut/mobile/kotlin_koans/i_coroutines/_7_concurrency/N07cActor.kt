package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.actor

private val todo = """
    Task 7a Actor.
    
    Another one from the series related to concurrency problems started by Task 7a SingleThreadContext.
    In this one you should use Actor to mitigate problem described in the Task 7a.
    
    Ref.
        - https://kotlinlang.org/docs/reference/coroutines/shared-mutable-state-and-concurrency.html
        
"""

// MARK template to adjust
suspend fun task7c(): CustomerCount {
    var customersCounter = 0
    return coroutineScope {
        withContext(Dispatchers.Default) {
            countTotalCustomers {
                customersCounter++
            }
        }
        return@coroutineScope CustomerCount(customersCounter)
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