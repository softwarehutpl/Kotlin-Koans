package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling.solutions

import com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling.valueToTest
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

// MARK solution
private val coroutineExceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
    valueToTest = "OK"
}

suspend fun task3c(): Job {
    return CoroutineScope(coroutineExceptionHandler).launch {
        alwaysThrows()
    }
}

@Suppress("UNREACHABLE_CODE")
@Throws(Exception::class)
private suspend fun alwaysThrows(): String {
    throw Exception("Always throwing so you could learn")
    valueToTest = "NotOk"
    return "ThrowsBeforeIt"
}