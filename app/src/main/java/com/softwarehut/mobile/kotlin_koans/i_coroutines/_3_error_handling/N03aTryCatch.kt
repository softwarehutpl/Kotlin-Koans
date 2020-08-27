package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.delay

private val todo = """
    Task 3a Try-Catching errors.
    
    From what I know one of the reasons that Kotlin Coroutines were to enable programmers to write
    asynchronous code in a synchronous fashion. I believe this assumption and the magic behind suspend
    functions lead to handling errors like we use to in Java by simply surrounding error prone code 
    with try-catch blocks. And if error occurs deep down in your coroutines hierarchy it'll be propagated
    until you either handle it using try-catch or it reaches global coroutine handler.

    Go ahead use the mighty try-catch to help you return "OK" as a result of task3a()
    
    Refs. 
        - https://kotlinlang.org/docs/reference/coroutines/exception-handling.html
        - https://github.com/Kotlin/kotlinx.coroutines/issues/1157

"""

// MARK template to adjust
suspend fun task3a(): String {
     return alwaysThrows()
}

@Suppress("UNREACHABLE_CODE")
@Throws(Exception::class)
private suspend fun alwaysThrows(): String {
    delay(1_000)
    throw Exception("Always throwing so you could learn")
    return "ThrowsBeforeIt"
}