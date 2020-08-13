package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N00bAsyncBuilderTest {
    @Test
    fun testOk() {
        runBlocking {
            Assertions.assertEquals("HelloWorld", task0b().await())
        }
    }
}