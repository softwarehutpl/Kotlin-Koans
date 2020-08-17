package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.*

private val todo = """
    Task 3c.
    
    TODO

    task3c expected result is "OK"
    
    Refs
    - https://github.com/Kotlin/kotlinx.coroutines/issues/1157

"""

internal var valueToTest = "NotOk"

private val coroutineExceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
    valueToTest = "OK"
}

suspend fun task3c(): Job {
//    return coroutineScope { launch { alwaysThrows() } }
    return CoroutineScope(coroutineExceptionHandler).launch {
        alwaysThrows()
    }
}

@Suppress("UNREACHABLE_CODE")
@Throws(Exception::class)
private suspend fun alwaysThrows(): String {
    throw Exception("Always throwing so you could learn")
    return "ThrowsBeforeIt"
}