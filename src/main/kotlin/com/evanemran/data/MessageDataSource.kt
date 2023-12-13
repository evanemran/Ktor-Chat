package com.evanemran.data

import com.evanemran.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages() : List<Message>

    suspend fun insertMessage(message: Message)
}