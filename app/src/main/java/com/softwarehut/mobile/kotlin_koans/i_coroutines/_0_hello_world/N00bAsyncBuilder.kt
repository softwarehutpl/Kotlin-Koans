package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

private val todo = """
    Task 0b.
    
    Builders
    
    Fill in function task0b so that it'll return Deferred that results with "HelloWorld" string 
   
    TODO docs

"""

//fun task0: Deferred<String> {
//    TODO()
//}

fun task0b(): Deferred<String> {
    return GlobalScope.async { "HelloWorld" }
}