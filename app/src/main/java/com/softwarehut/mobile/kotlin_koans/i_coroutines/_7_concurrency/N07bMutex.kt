package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

private val todo = """
    Task 7a Mutex.
    
    It's follow up to Task 7a SingleThreadContext. Problem is the same but you'll use Mutex
    instead of SingleThreadContext to solve it.
    
    So please adjust code to make use of Mutex for accessing shared mutable state.
    
    Ref.
        - https://kotlinlang.org/docs/reference/coroutines/shared-mutable-state-and-concurrency.html

"""

// MARK template to adjust
suspend fun task7b(): CustomerCount {
    var customersCounter = 0
    withContext(Dispatchers.Default) {
        countTotalCustomers {
            customersCounter++
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

// MARK solution
// TODO move to another file?
//val mutex = Mutex()

//suspend fun task7b(): CustomerCount {
//    var customersCounter = 0
//    withContext(Dispatchers.Default) {
//        countTotalCustomers {
//            mutex.withLock {
//                customersCounter++
//            }
//        }
//    }
//    return CustomerCount(customersCounter)
//}