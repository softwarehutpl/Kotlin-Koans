package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N07cActorTest {

    @Test
    fun testOk() {
        runBlocking {
            val counter = task7c()
            Assertions.assertEquals(32 * 32, counter.count)
        }
    }
}