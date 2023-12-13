package com.evanemran.room

import io.ktor.websocket.*

data class Member(
    val userName: String,
    val sessionId: String,
    val socket: WebSocketSession
)