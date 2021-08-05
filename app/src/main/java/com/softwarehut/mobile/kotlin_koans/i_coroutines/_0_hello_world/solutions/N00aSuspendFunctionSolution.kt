package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world.solutions

import kotlinx.coroutines.delay

// MARK solution
suspend fun task0a(): String {
    delay(1_000)
    return "HelloWorld"
}