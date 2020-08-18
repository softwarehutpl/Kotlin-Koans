package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

private val todo = """
    Task 0a Suspending functions.
    
    This task will introduce you to a suspending functions. Probably that one aspect of Kotlin Coroutines 
    you will be using the most.
    
    Suspending function it's that kind of function that can be, well, suspended without blocking thread on
    which it's run on. 

    Important note here is that suspend function when returning not only return value but also
    information about place from where it was suspended so it could be resumed when there are free 
    resources.
    
    Good example of such function is delay from standard Kotlin library.
    
    Your job here is to fill in function task0a so that it'll wait for 1 second and then 
    return "HelloWorld" string as a result.
     
    If you want to learn more checkout links from refs section.
   
    Refs. 
        - https://kotlinlang.org/docs/reference/coroutines/composing-suspending-functions.html
        - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/suspend.html
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/delay.html

"""

// MARK template to adjust
fun task0a(): String {
    TODO()
}

// MARK solution
// TODO move to another file?
//suspend fun task0a(): String {
//    delay(1_000)
//    return "HelloWorld"
//}