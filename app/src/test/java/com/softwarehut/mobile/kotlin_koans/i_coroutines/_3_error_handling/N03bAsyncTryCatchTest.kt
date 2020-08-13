package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N03bAsyncTryCatchTest {
    @Test
    fun testOk() {
        runBlocking {
            assertEquals("OK", task2b())
        }
    }
}