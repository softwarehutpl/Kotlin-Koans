package com.softwarehut.mobile.kotlin_koans.i_coroutines._4_coroutine_start_options

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

private val todo = """
    Task 3a.
    
    
"""

fun task3a(): Deferred<String> {
    return GlobalScope.async(start = CoroutineStart.LAZY) { "HelloWorld" }
}