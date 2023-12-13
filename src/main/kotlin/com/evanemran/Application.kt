package com.evanemran

import com.evanemran.di.mainModule
import com.evanemran.plugins.*
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    install(Koin) {
        modules(mainModule)
    }
    configureSockets()
    configureRouting()
    configureSecurity()
    configureMonitoring()
    configureSerialization()
}
