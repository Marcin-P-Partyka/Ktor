package dev.martin.taskflow.api

// Na start: proste wyjątki, potem zrobimy Result/Either w domain
class BadRequestException(message: String, val details: Map<String, String>? = null) : RuntimeException(message)
class NotFoundException(message: String) : RuntimeException(message)
