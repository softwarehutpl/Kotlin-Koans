package com.softwarehut.mobile.kotlin_koans.i_coroutines._2_dispatchers

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private val todo = """
    Task 2. Dispatchers
    
    By now you're probably aware that coroutine context contains Job as one of the three components.
    Other two are Dispatcher and CoroutineExceptionHandler. We'll cover exception handling shortly.
    Now let's focus on dispatchers. It defines in which thread and executor should coroutine be executed.
    And by using special builder called withContext {} you could move your work to another dispatcher
    e.g. from UI thread to IO for network or Default to CPU heavy calculations. But others builders 
    also allow you to provide dispatcher.
    
    Give that information make tast2() return current thread name but don't forget to switch dispatcher
    before doing so.

    Refs.
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-dispatcher/index.html
        - https://kotlinlang.org/docs/reference/coroutines/coroutine-context-and-dispatchers.html#dispatchers-and-threads

"""

// MARK template to adjust
suspend fun task2(): String {
    TODO()
}