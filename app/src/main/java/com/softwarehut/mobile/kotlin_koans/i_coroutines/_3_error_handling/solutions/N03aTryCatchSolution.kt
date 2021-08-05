package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling.solutions

import kotlinx.coroutines.delay

// MARK solution
suspend fun task3a(): String {
    return try {
        alwaysThrows()
    } catch (e: Exception) {
        "OK"
    }
}

@Suppress("UNREACHABLE_CODE")
@Throws(Exception::class)
private suspend fun alwaysThrows(): String {
    delay(1_000)
    throw Exception("Always throwing so you could learn")
    return "ThrowsBeforeIt"
}