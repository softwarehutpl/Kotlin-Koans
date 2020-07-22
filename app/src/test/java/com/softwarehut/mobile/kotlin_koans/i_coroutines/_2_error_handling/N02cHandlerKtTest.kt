package com.softwarehut.mobile.kotlin_koans.i_coroutines._2_error_handling

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N02cHandlerKtTest {
    @Test
    fun testOk() {
        GlobalScope.launch {
            task2c()
        }
        Thread.sleep(1_000)
        assertEquals("OK", valueToTest)
    }
}