package com.softwarehut.mobile.kotlin_koans.i_coroutines._5_flow.solutions

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.onEach

// MARK solution
fun task5(): Flow<Int> {
    return (0 .. 100).asFlow().onEach { delay(100) }
}