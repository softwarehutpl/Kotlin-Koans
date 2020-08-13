package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.delay

private val todo = """
    Task 0a.
    
    Fill in function task0a so that it'll wait for 1 second and then return "HelloWorld" string as a result 
   
    Checkout suspend functions documentation - https://kotlinlang.org/docs/reference/coroutines/composing-suspending-functions.html

"""

//fun task0: String {
//    TODO()
//}

suspend fun task0a(): String {
    delay(1_000)
    return "HelloWorld"
}