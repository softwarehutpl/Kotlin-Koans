package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N00ASuspendFunctionTest {
    @Test
    fun testOk() {
        runBlocking {
            assertEquals("HelloWorld", task0a())
        }
    }
}