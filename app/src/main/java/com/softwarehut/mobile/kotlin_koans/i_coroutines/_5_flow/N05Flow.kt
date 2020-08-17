package com.softwarehut.mobile.kotlin_koans.i_coroutines._5_flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

private val todo = """
    Task 5.
    
    
"""

fun task5(): Flow<Int> {
    return (0 .. 100).asFlow().onEach { delay(100) }
}