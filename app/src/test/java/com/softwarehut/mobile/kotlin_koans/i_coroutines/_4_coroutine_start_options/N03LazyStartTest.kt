package com.softwarehut.mobile.kotlin_koans.i_coroutines._4_coroutine_start_options

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N03LazyStartTest {
    @Test
    fun testOk() {
        runBlocking {
            val deferred = task4()
            Assertions.assertEquals(true, deferred.isActive.not() && deferred.isCompleted.not())
            val result = deferred.await()
            Assertions.assertEquals(true, deferred.isCompleted)
        }
    }
}