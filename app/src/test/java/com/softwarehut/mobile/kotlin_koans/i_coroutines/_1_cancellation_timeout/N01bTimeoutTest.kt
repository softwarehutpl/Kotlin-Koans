package com.softwarehut.mobile.kotlin_koans.i_coroutines._1_cancellation_timeout

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N01bTimeoutTest {
    @Test
    fun testOk() {
        runBlocking {
            val timeBefore = System.currentTimeMillis()
            task1b().join()
            val timeAfter = System.currentTimeMillis()
            val isInRange = (950 .. 1_050).contains(timeAfter - timeBefore)
            Assertions.assertEquals(true, isInRange)
        }
    }
}