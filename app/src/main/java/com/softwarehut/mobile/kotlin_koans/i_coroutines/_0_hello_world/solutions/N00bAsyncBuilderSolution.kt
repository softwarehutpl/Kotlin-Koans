package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world.solutions

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

// MARK solution
fun task0b(): Deferred<String> {
    return GlobalScope.async { "HelloWorld" }
}