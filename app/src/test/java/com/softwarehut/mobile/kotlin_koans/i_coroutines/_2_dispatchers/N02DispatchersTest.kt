package com.softwarehut.mobile.kotlin_koans.i_coroutines._2_dispatchers

import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class N02DispatchersTest {
    @Test
    fun testOk() {
        newSingleThreadContext("CustomContext").use { context ->
            runBlocking(context) {
                val thread = Thread.currentThread().name
                assertNotEquals(thread, task1())
            }
        }
    }
}