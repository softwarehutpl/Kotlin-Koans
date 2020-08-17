package com.softwarehut.mobile.kotlin_koans.i_coroutines._3_error_handling

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N03cHandlerTest {
    @Test
    fun testOk() {
        runBlocking {
            task3c()
            delay(1_000)
            assertEquals("OK", valueToTest)
        }
    }
}