package com.evanemran.di

import com.evanemran.data.MessageDataSource
import com.evanemran.data.MessageDataSourceImpl
import com.evanemran.room.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mainModule = module {
    single {
        KMongo.createClient()
            .coroutine
            .getDatabase("message_db")
    }

    single<MessageDataSource> {
        MessageDataSourceImpl(get())
    }

    single {
        RoomController(get())
    }
}