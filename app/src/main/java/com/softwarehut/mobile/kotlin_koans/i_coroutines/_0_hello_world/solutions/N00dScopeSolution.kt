package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world.solutions

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope

// MARK solution
fun task0d(): CoroutineScope {
    return CoroutineScope(CoroutineName("LearningScopes"))
}