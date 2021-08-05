package com.softwarehut.mobile.kotlin_koans.i_coroutines._4_coroutine_start_options.solutions

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

// MARK solution
fun task4(): Deferred<String> {
    return GlobalScope.async(start = CoroutineStart.LAZY) { "I am lazy as heck" }
}