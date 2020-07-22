package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.delay

private val todo = """
    Task 0.
    
    Fill in function task0 so that it'll wait for 1 second and then return "OK" string as a result 
   
    Checkout suspend functions documentation - https://kotlinlang.org/docs/reference/coroutines/composing-suspending-functions.html

"""

//fun task0: String {
//    TODO()
//}

suspend fun task0(): String {
    delay(1_000)
    return "OK"
}