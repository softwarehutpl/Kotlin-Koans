package com.softwarehut.mobile.kotlin_koans.i_coroutines._2_dispatchers.solutions

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// MARK solution
suspend fun task2(): String {
    return withContext(Dispatchers.IO) {
        Thread.currentThread().name
    }
}