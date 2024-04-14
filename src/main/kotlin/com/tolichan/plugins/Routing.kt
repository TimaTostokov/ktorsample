package com.tolichan.plugins

import com.tolichan.room.RoomController
import com.tolichan.routes.chatSocket
import com.tolichan.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.java.KoinJavaComponent.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}