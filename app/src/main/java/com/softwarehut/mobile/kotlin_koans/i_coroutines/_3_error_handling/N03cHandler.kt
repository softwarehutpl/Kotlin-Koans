package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.*

private val todo = """
    Task 3c CoroutineExceptionHandler.
    
    CoroutineExceptionHandler was briefly mention early in context of CoroutineContext as one of the 
    elements along the Dispatcher and Job. It's similar to Thread.uncaughtExceptionHandler because every 
    Exception raised within root coroutine or any of the children that isn't handled will be passed into it.

    Using CoroutineExceptionHandler change valueToTest to "OK" when handling exception. 
    
    Refs. 
        - https://kotlinlang.org/docs/reference/coroutines/exception-handling.html#coroutineexceptionhandler
        - https://kotlinlang.org/docs/reference/coroutines/exception-handling.html
        - https://github.com/Kotlin/kotlinx.coroutines/issues/1157

"""

internal var valueToTest = "Unknown"

// MARK template to adjust
suspend fun task3c(): Job {
    return coroutineScope { launch { alwaysThrows() } }
}

@Suppress("UNREACHABLE_CODE")
@Throws(Exception::class)
private suspend fun alwaysThrows(): String {
    throw Exception("Always throwing so you could learn")
    valueToTest = "NotOk"
    return "ThrowsBeforeIt"
}

// MARK solution
// TODO move to another file?
//private val coroutineExceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
//    valueToTest = "OK"
//}

//suspend fun task3c(): Job {
//    return CoroutineScope(coroutineExceptionHandler).launch {
//        alwaysThrows()
//    }
//}