package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.*

private val todo = """
    Task 0c Parent child relation | Structured concurrency
    
    Well to allow parent child relation or structured concurrency Kotlin Coroutines are using Job interface.
    Do you remember that Deferred from previous lesson? It's just just a Job that produces result other than 
    completed.

    If fact all coroutine builders will return object of type Job. And when you'll use coroutine builder 
    inside coroutine builder then Kotlin Coroutines is clever enough to create parent child relation
    between those two for you. This have quite a few advantages e.g. parent job could cancel all it's 
    children.
    
    Now let's talk about your job. Your job is to make function task0c return Job that has at least one child.
    Utilize your knowledge about GlobalScope and coroutine builders.
    
    Oh, before you wonder away to the work... Down there in refs sections are useful links for ya.
    
    Refs.
        - https://kotlinlang.org/docs/reference/coroutines/coroutine-context-and-dispatchers.html#children-of-a-coroutine
        - https://kotlinlang.org/docs/reference/coroutines/basics.html#structured-concurrency
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-job/index.html
    
"""

// MARK template to adjust
fun task0c(): Job = TODO()