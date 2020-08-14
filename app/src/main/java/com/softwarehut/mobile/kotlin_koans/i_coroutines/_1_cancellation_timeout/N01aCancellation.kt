package com.softwarehut.mobile.kotlin_koans.i_coroutines._1_cancellation_timeout

import kotlinx.coroutines.*

fun task1a(): Job {
    return GlobalScope.launch {
        launch {
            longRunningWork()
        }
        delay(1_000)
        cancel()
    }
}

suspend fun longRunningWork() {
    withContext(Dispatchers.IO) {
        var counter = 0L
        for (i in 0..100_000_000_000) {
            if (isActive.not()) { return@withContext }
            counter++
        }
    }
}