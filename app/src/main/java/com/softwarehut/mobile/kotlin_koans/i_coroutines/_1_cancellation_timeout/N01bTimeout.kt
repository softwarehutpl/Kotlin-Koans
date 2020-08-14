package com.softwarehut.mobile.kotlin_koans.i_coroutines._1_cancellation_timeout

import kotlinx.coroutines.*

fun task1b(): Job {
    return GlobalScope.launch {
        withTimeout(1_000) {
            launch {
                anotherLongRunningWork()
            }
        }
    }
}

suspend fun anotherLongRunningWork() {
    withContext(Dispatchers.IO) {
        var counter = 0L
        for (i in 0..100_000_000_000) {
            if (isActive.not()) { return@withContext }
            counter++
        }
    }
}