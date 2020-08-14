package com.softwarehut.mobile.kotlin_koans.i_coroutines._5_flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

fun task5(): Flow<Int> {
    return (0 .. 100).asFlow().onEach { delay(100) }
}