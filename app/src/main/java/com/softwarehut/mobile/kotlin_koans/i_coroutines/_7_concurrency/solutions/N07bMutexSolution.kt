package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency.solutions

import com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency.CustomerCount
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

// MARK solution
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