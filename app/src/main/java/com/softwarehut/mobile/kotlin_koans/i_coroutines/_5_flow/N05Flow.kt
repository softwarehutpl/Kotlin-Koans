package com.softwarehut.mobile.kotlin_koans.i_coroutines._5_flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

private val todo = """
    Task 5 Flow introduction.
    
    Flow is an implementation of the Reactive Stream build on top of Kotlin Coroutines. It's useful
    if you want to represent stream of values that are being computed asynchronously and use all of 
    the benefits provided by coroutines along the way. To create one could use flow builder or extension
    function asFlow() defined for collection, ranges and such. Since Flow is implementation of  Reactive Stream
    it also have cool transformation operators e.g. map, reduce, filter, onEach.
    
    Task for today is to fill in task5() function and make it return flow of integers. Let's say starting
    from 0 and up to 100 with numbers being emitted 100ms after previous one.
    
    Refs.
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/flow.html
        - https://kotlinlang.org/docs/reference/coroutines/flow.html
        - https://www.raywenderlich.com/9799571-kotlin-flow-for-android-getting-started?fbclid=IwAR1kOzVr_7sv-q_1gn4kz2r97mJ1yovz8OYMvYv0VCwqUINwtkmWgRUIJMk
    
"""

// MARK template to adjust
fun task5(): Flow<Int> {
    TODO()
}