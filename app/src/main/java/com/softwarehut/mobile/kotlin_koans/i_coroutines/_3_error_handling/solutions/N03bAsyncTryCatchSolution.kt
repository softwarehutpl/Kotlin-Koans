package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling.solutions

import kotlinx.coroutines.*

// MARK solution
suspend fun task3b(): String {
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