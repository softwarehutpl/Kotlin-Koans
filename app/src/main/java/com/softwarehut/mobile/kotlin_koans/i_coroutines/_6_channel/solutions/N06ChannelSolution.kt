package com.softwarehut.mobile.kotlin_koans.i_coroutines._6_channel.solutions

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// MARK solution
fun task6(table: Channel<String>) {
    GlobalScope.launch {
        for (ball in table) {
            delay(256)
            table.send("Pong")
        }
    }
}