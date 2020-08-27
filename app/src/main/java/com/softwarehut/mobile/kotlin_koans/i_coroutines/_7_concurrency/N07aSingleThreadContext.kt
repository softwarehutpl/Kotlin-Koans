package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.*

private val todo = """
    Task 7a SingleThreadContext.
    
    Coroutines are multi-threaded so all of the problems related to concurrency could be encountered
    while using them. As Kotlin docs points out most common problem is synchronization of access to 
    shared mutable state. 
    Documentation presents following problem: launch a hundred coroutines all doing the same action
    thousand times.
    While it serve the purpose for learning well I personally like to thing in terms of potential
    production use case. So if you're like me think about above as different shops that contribute to 
    one common counter representing customers that entered shop over one day.
    
    There are few possible solutions for such problem. Couple of them will be presented in this and
    few following lessons.
    
    One of the those options is to make sure all of the access to shared state is done on the same thread.
    Kotlin Coroutines have SingleThreadContext which could come handy.
    
    Your job here is to use SingleThreadContext for modification of the counter. Please name this
    context "ClientCounterContext".
    
    Ref.
        - https://kotlinlang.org/docs/reference/coroutines/shared-mutable-state-and-concurrency.html
        
"""

inline class CustomerCount(val count: Int)

// MARK template to adjust
suspend fun task7a(): CustomerCount {
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