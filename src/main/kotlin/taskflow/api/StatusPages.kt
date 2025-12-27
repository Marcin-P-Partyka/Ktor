package dev.martin.taskflow.api

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureStatusPages() {
    install(StatusPages) {

        exception<BadRequestException> { call, cause ->
            call.respond(
                HttpStatusCode.BadRequest,
                ApiError(code = "BAD_REQUEST", message = cause.message ?: "Bad request", details = cause.details)
            )
        }

        exception<NotFoundException> { call, cause ->
            call.respond(
                HttpStatusCode.NotFound,
                ApiError(code = "NOT_FOUND", message = cause.message ?: "Not found")
            )
        }

        exception<Throwable> { call, cause ->
            // Na razie prosto: 500 z ogólnym komunikatem
            // (Nie wyciekamy stacktrace do klienta)
            call.application.log.error("Unhandled error", cause)
            call.respond(
                HttpStatusCode.InternalServerError,
                ApiError(code = "INTERNAL_ERROR", message = "Unexpected error")
            )
        }
    }
}
