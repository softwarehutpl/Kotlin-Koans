package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

private val todo = """
    
"""

val mutex = Mutex()

suspend fun task7b(): CustomerCount {
    var customersCounter = 0
    withContext(Dispatchers.Default) {
        countTotalCustomers {
            mutex.withLock {
                customersCounter++
            }
        }
    }
    return CustomerCount(customersCounter)
}

private suspend fun countTotalCustomers(action: suspend () -> Unit) {
    coroutineScope {
        val shops = 256
        val customersPerShop = 1_024
        repeat(shops) {
            launch {
                repeat(customersPerShop) {
                    action()
                }
            }
        }
    }
}