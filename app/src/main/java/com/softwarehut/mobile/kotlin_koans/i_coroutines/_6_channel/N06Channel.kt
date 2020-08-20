package com.softwarehut.mobile.kotlin_koans.i_coroutines._6_channel

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

private val todo = """
    Task 6 Chanel introduction.
    
    Channel is an ancestor of the Flow. You could think about those as about queue, pipe, bus or drawer 
    with implementation of FIFO principle. Flow being the more mature solution. 
    But I believe there could be situations where Channels could come handy. 
    There are few key differences between them. The most important one is that channel is a hot stream 
    in oppose to Flow being cold stream. If you want to more about it check out refs. section at the bottom.
    
    In the Kotlin Docs there is splendid example for Channel. I found it so cool that I've allow myself
    to use it in here. All the credits goes to whoever from JetBrains invented it. Without further ado
    let's play ping pong over a String Channel. Test will be "Ping" player so your job is to implement 
    task6 in such way that it'll be "Pong" player. Keep in mind that you need to wait 256 milliseconds
    before sending "Pong" over channel to simulate players reaction time.
    
    Refs.
        - https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.channels/-channel/index.html
        - https://kotlinlang.org/docs/reference/coroutines/channels.html
        - https://kotlin.christmas/2019/14
    
"""

// MARK template to adjust
fun task6(table: Channel<String>) {
    GlobalScope.launch {
        TODO()
    }
}

// MARK solution
// TODO move to another file?
//fun task6(table: Channel<String>) {
//    GlobalScope.launch {
//        for (ball in table) {
//            delay(256)
//            table.send("Pong")
//        }
//    }
//}