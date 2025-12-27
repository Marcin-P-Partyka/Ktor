package dev.martin.taskflow.api

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

fun Route.healthRoutes() {
    get("/health") {
        call.respond(HealthResponse(status = "ok"))
    }
    get("/boom") {
        throw BadRequestException("Example validation error", details = mapOf("field" to "must not be empty"))
    }
}

@Serializable
data class HealthResponse(val status: String)
