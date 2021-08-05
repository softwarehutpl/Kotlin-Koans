package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency.solutions

import com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency.CustomerCount
import kotlinx.coroutines.*

// MARK solution
val counterContext = newSingleThreadContext("ClientCounterContext")

suspend fun task7a(): CustomerCount {
    var customersCounter = 0
    withContext(Dispatchers.Default) {
        countTotalCustomers {
            withContext(counterContext) {
                customersCounter++
            }
        }
    }
    return CustomerCount(customersCounter)
}

private suspend fun countTotalCustomers(action: suspend () -> Unit) {
    coroutineScope {
        val shops = 10
        val customersPerShop = 1_000
        repeat(shops) {
            launch {
                repeat(customersPerShop) {
                    action()
                }
            }
        }
    }
}