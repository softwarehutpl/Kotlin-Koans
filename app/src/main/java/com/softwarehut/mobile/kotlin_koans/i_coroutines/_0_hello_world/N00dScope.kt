package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.*

private val todo = """
    Task 0d Coroutine Scope
    
    We need to talk about another useful thing in Kotlin Coroutine is Coroutine Scope. 
    Imagine that you have some object with lifecycle that isn't coroutine. First thing that comes to mind? 
    Yeah, Android Activity. 
    You'd like to launch() or async() some work from such object with lifecycle & have some simple
    way of invalidating all running task if they are no longer valid. Once again, look at Android
    Activity and onDestroy :wink: :wink:
    Well Coroutine Scope got you covered. Do you remember GlobalScope? It's Coroutine Scope that's 
    automatically created for you App and it's tight with its lifecycle. Yeah, so use with care. 
    It allows to use all of coroutine builders, run switch threads 
    and much more. It even allow to invalidate all its children when they are no longer needed to free memory.
    
    
    Are you hyped?
    If so off to work you go, make task0d return CoroutineScope object that's named LearningScopes. 
    
    O yeah, don't forget to checkout refs section as always there are useful links in there.
    
    Refs.
        - https://kotlinlang.org/docs/reference/coroutines/coroutine-context-and-dispatchers.html#coroutine-scope
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/index.html
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-name/index.html
        - https://kotlinlang.org/docs/reference/coroutines/basics.html#scope-builder
    
"""

// MARK template to adjust
fun task0d(): CoroutineScope = TODO()

// MARK solution
// TODO move to another file?
//fun task0d(): CoroutineScope {
//    return CoroutineScope(CoroutineName("LearningScopes"))
//}