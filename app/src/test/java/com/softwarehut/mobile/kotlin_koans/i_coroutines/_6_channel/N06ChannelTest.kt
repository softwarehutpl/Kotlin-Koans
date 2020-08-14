package com.softwarehut.mobile.kotlin_koans.i_coroutines._6_channel

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class N06ChannelTest {
    @Test
    fun testOk() {
        GlobalScope.launch {
            val table = Channel<String>()
            launch {
                for (ball in table) {
                    Assertions.assertEquals("Pong", ball)
                    println(ball)
                    delay(256)
                    println("Ping")
                    table.send("Ping")
                }
            }
            task6(table)
            table.send("Pong")
        }
        Thread.sleep(4_096)
    }
}