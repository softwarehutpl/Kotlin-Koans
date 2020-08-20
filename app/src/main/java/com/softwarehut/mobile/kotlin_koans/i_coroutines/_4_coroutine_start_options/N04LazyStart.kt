package com.softwarehut.mobile.kotlin_koans.i_coroutines._4_coroutine_start_options

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

private val todo = """
    Task 4 Start options.
    
    You should be aware that all of the coroutines builders can take context as one of the parameter
    but there is also a second one - CoroutineStart. By default coroutine is scheduled for execution
    right after creation and by providing appropriate coroutine start option you could postpone it until
    later. Besides that there are few other options, you can check them out in the docs (see refs. 
    section at the bottom)
    
    Please make async job that would postpone execution until it's awaited on and will return "I am lazy as heck" as a result.
    
    Refs.
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-start/
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-start/-l-a-z-y.html
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/async.html
    
"""

// MARK template to adjust
fun task4(): Deferred<String> {
    TODO()
}

// MARK solution
// TODO move to another file?
//fun task4(): Deferred<String> {
//    return GlobalScope.async(start = CoroutineStart.LAZY) { "I am lazy as heck" }
//}