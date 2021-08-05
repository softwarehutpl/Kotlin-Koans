package com.softwarehut.mobile.kotlin_koans

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N00HelloWorldKtTest {
    @Test
    fun testOk() {
        runBlocking {
            assertEquals("Fixed", task0(this))
        }
    }
}
