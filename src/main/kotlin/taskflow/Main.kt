package dev.martin.taskflow

import io.ktor.server.application.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

fun Application.module() {
    install(CallLogging)

    install(ContentNegotiation) {
        json(Json { prettyPrint = true; ignoreUnknownKeys = true })
    }

    routing {
        get("/health") {
            call.respond(Health("ok"))
        }
    }
}

@Serializable
data class Health(val status: String)

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}