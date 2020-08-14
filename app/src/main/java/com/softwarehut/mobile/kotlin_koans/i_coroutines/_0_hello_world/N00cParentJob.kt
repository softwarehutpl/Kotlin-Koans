package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.*

private val todo = """
    
"""

fun task0c(): Job {
    return GlobalScope.launch {
        println("Just call me parent")
        launch {
            delay(1_000)
            println("I'm the child you know")
        }
    }
}