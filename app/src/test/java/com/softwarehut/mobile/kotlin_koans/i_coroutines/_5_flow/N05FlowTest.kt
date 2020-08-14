package com.softwarehut.mobile.kotlin_koans.i_coroutines._5_flow

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N05FlowTest {
    @Test
    fun testOk() {
        runBlocking {
            val emittedItems = mutableListOf<Int>()
            try {
                withTimeout(1_024) {
                    task5().collect {
                        emittedItems.add(it)
                    }
                }
            } catch (t: Throwable) {
                // MARK do nothing it's here to prevent timeout of cancelling whole test. I know it's cheating :D
            }
            Assertions.assertEquals(10, emittedItems.size)
        }
    }
}