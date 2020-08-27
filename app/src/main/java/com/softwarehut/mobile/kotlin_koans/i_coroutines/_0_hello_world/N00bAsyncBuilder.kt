package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

private val todo = """
    Task 0b Builders.
    
    You know how to wrote a suspending function but such function can be only invoked within coroutine.
     
    Easiest way to create coroutine is to use builder to do it. Kotlin Coroutine provides bunch of them.
    async(), launch() or runBlocking() are just few examples of them. All of them take suspending lambda
    as one of the arguments.
    
    All of those builders can be accessed via Coroutine Scope. It'll be discussed in upcoming lessons.
    For now just know that there is GlobalScope which could be used as Coroutine Scope matching lifecycle
    of the App.
    
    Right now let's focus on async() builder. It allows to deffer work to another worker thread and return
    some result. Returned value is packed inside Deferred object which represents future or a promise. 
    Neat thing about deferred is that you could .await() on it to get returned value in code looking 
    like same as blocking code.
    
    Anyway your job here is to fill in function task0b so that it'll return Deferred that results with "HelloWorld" string 
   
    For more in depth info checkout refs section.
   
    Refs.
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/async.html
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-deferred/index.html
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-global-scope/
        - https://kotlinlang.org/docs/reference/coroutines/composing-suspending-functions.html#concurrent-using-async

"""

// MARK template to adjust
fun task0b(): Deferred<String> = TODO()