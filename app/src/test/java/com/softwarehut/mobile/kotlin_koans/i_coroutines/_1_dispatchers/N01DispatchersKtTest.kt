package com.softwarehut.mobile.kotlin_koans.i_coroutines._1_dispatchers

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class N01DispatchersKtTest {
    @Test
    fun testOk() {
        runBlocking(Dispatchers.Default) {
            val thread = Thread.currentThread().name
            assertNotEquals(thread, task1())
        }
    }
}