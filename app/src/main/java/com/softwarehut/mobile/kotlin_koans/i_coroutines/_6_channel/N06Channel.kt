package com.softwarehut.mobile.kotlin_koans.i_coroutines._6_channel

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun task6(table: Channel<String>) {
    GlobalScope.launch {
        for (ball in table) {
            delay(256)
            table.send("Pong")
        }
    }
}