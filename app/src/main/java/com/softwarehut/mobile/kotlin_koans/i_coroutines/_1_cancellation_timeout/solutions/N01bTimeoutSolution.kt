package com.softwarehut.mobile.kotlin_koans.i_coroutines._1_cancellation_timeout.solutions

import com.softwarehut.mobile.kotlin_koans.i_coroutines._1_cancellation_timeout.anotherLongRunningWork
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout

// MARK solution
fun task1b(): Job {
    return GlobalScope.launch {
        withTimeout(1_000) {
            launch {
                anotherLongRunningWork()
            }
        }
    }
}