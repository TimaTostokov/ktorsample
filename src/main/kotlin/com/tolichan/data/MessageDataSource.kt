package com.tolichan.data

import com.tolichan.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages(): List<Message>

    suspend fun insertMessage(message: Message)
 }