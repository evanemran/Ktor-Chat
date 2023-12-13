package com.evanemran.plugins

import com.evanemran.room.RoomController
import com.evanemran.routes.chatSocket
import com.evanemran.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
