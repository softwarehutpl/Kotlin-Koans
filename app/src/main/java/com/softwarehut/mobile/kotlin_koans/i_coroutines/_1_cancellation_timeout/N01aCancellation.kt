package com.softwarehut.mobile.kotlin_koans.i_coroutines._1_cancellation_timeout

import kotlinx.coroutines.*

private val todo = """
    Task 1a. Coroutine Cancellation
    
    When talking about Coroutines Scope I briefly mentioned that it allows to invalidate all of the
    children to free memory. It's due to parent child relation na parent Job object. 
    Is as simple as call cancel() on the Job you wish to cancel.
    First example that comes to mind is that you have Android Activity that utilize Kotlin Coroutines 
    to download in the background data needed to display page. If user move away from such Activity 
    you surly want to cancel all running background work related to this activity since it's no longer
    needed.
    
    Your job here is to adjust code below so that all jobs will be canceled after 1s delay.
    
    You know the drill, refs for more in depth knowledge.
    
    Refs.
        - https://kotlinlang.org/docs/reference/coroutines/cancellation-and-timeouts.html
    
"""

// MARK template to adjust
fun task1a(): Job {
    return GlobalScope.launch {
        launch {
            longRunningWork()
        }
    }
}

suspend fun longRunningWork() {
    withContext(Dispatchers.IO) {
        var counter = 0L
        for (i in 0..100_000_000_000) {
            counter++
        }
    }
}