package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N00dScopeTest {
    @Test
    fun testOk() {
        runBlocking {
            val coroutineScope = task0d()
            var scopeName = ""
            coroutineScope.launch {
                scopeName = Thread.currentThread().toString()
            }.join()
            Assertions.assertEquals(
                true,
                scopeName.contains("LearningScopes".toRegex())
            )
        }
    }
}