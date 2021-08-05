package com.softwarehut.mobile.kotlin_koans

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun task0(coroutineScope: CoroutineScope): String {
    try {
        return alwaysThrows()
    } catch (e: Exception) {
        return "Fixed"
    }
}

@Throws(Exception::class)
private suspend fun alwaysThrows(): String {
    delay(1_000)
    throw Exception("Always throwing so you could learn")
}