@file:Suppress("UNREACHABLE_CODE")

package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.*

private val todo = """
    Task 2b.
    
    TODO
    
    task2b expected result is "OK"
    
    Refs
    - https://github.com/Kotlin/kotlinx.coroutines/issues/1157

"""

suspend fun task2b(): String {
//    return coroutineScope {
//        val result = alwaysThrows(this)
//        throw UnexpectedException("Would you expect it?") // Could be removed after first run
//        result.await()
//    }
    return try {
        coroutineScope {
            val result = alwaysThrows(this)
            result.await()
        }
    } catch (e: Exception) {
        "OK"
    }
}

@Throws(Exception::class)
private fun alwaysThrows(coroutineScope: CoroutineScope): Deferred<String> {
    return coroutineScope.async {
        delay(1_000)
        throw Exception("Always throwing so you could learn")
        "ThrowsBeforeIt"
    }
}

private class UnexpectedException(message: String): Exception(message)