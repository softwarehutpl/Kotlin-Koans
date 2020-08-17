package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N07aSingleThreadContextTest {

    private val counterContextName = "ClientCounterContext".toRegex()

    @Test
    fun testOk() {
        runBlocking {
            withContext(counterContext) {
                assertEquals(
                    true,
                    Thread.currentThread().name.contains(counterContextName)
                )
            }
            val counter = task7a()
            assertEquals(10_000, counter.count)
        }
    }
}