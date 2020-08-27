package com.softwarehut.mobile.kotlin_koans.i_coroutines._1_cancellation_timeout

import kotlinx.coroutines.*

private val todo = """
    Task 1b. Timeout
    
    Last lesson, the one about coroutine cancellation was important however solution wasn't optimal for
    the task you was given. Today you'll learn that to cancel job after 1 second delay could be done 
    in more expressive fashion using withTimeout {} builder.
    
    So go wild and make task1b() below use withTimeout do cancel job for you after 1s same as you 
    have done it in Coroutine Cancellation task. 
    
    Refs.
        - https://kotlinlang.org/docs/reference/coroutines/cancellation-and-timeouts.html#timeout
    
"""

// MARK template to adjust
fun task1b(): Job {
    return GlobalScope.launch {
        launch {
            anotherLongRunningWork()
        }
    }
}

suspend fun anotherLongRunningWork() {
    withContext(Dispatchers.IO) {
        var counter = 0L
        for (i in 0..100_000_000_000) {
            if (isActive.not()) { return@withContext }
            counter++
        }
    }
}