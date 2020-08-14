package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.*

private val todo = """
    
"""

fun task0d(): CoroutineScope {
    return CoroutineScope(CoroutineName("LearningScopes"))
}