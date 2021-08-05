package com.softwarehut.mobile.kotlin_koans.i_coroutines._0_hello_world

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N00cParentJobTest {
    @Test
    fun testOk() {
        runBlocking {
            val parentJob = task0c()
            Assertions.assertEquals(
                true,
                parentJob.children.toList().isNotEmpty()
            )
            parentJob.join()
        }
    }
}