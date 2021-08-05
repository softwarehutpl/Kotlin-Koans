@file:Suppress("UNREACHABLE_CODE")

package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.*

private val todo = """
    Task 3b Try-catching deferred work.
    
    In "Try-Catching errors" lesson you learned that suspend functions can be wrapped with try-catch
    but now you will see that function returning Job or Deferred are no different to that. You'll
    just need to try-catch call to join() or await().
    
    Same as before please make task3b() returning "OK" without errors.
    
    Refs. 
        - https://kotlinlang.org/docs/reference/coroutines/exception-handling.html
        - https://github.com/Kotlin/kotlinx.coroutines/issues/1157

"""

// MARK template to adjust
suspend fun task3b(): String {
    return coroutineScope {
        val result = alwaysThrows(this)
        throw UnexpectedException("Would you expect it?") // Could be removed after first run
        result.await()
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