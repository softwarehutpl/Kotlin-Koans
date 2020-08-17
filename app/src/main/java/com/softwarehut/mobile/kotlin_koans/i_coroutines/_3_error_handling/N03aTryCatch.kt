package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.delay

private val todo = """
    Task 3a.
    
    TODO

    task3a expected result is "OK"

"""

suspend fun task3a(): String {
    // return alwaysThrows()
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