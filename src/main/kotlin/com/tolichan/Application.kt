package com.tolichan

import com.tolichan.di.mainModule
import com.tolichan.plugins.*
import io.ktor.server.application.*
import org.koin.ktor.ext.Koin
import org.koin.ktor.ext.modules

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    install(Koin){
        modules(mainModule)
    }
    configureSockets()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
}