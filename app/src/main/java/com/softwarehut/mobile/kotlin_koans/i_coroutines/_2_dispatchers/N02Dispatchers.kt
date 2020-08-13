package com.softwarehut.mobile.kotlin_koans.i_coroutines._2_dispatchers

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private val todo = """
    Task 1.
    
    Switch coroutine context to use Dispatcher.IO then return String that 
    contains current thread name.

    TODO add docs listing

"""

suspend fun task1(): String {
    return withContext(Dispatchers.IO) {
        Thread.currentThread().name
    }
}