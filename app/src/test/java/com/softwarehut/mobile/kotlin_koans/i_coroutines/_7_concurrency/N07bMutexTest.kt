package com.softwarehut.mobile.kotlin_koans.i_coroutines._7_concurrency

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N07bMutexTest {

    @Test
    fun testOk() {
        runBlocking {
            val counter = task7b()
            Assertions.assertEquals(256 * 1_024, counter.count)
        }
    }
}