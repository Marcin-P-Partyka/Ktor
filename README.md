# TaskFlow — Kotlin Backend (Ktor)

TaskFlow is a backend service written in **Kotlin** using **Ktor**, developed as a production-style learning project.
The goal of this repository is to build a **clean, scalable, coroutine-based backend**, following real-world backend practices.

This project is not a tutorial clone — it is designed as a **portfolio-quality backend**, developed step by step with attention to architecture, correctness, and maintainability.

---

## ✨ Current Features

- Ktor server running on Netty
- JSON API using kotlinx.serialization
- Health check endpoint (`/health`)
- Centralized error handling (StatusPages)
- Consistent API error contract (JSON)
- Clean package structure (API / domain / application / infrastructure)
- Environment-based configuration (dev / test / prod ready)
- External configuration via environment variables

---

## 🧱 Tech Stack

- **Language:** Kotlin
- **Framework:** Ktor
- **Concurrency:** Kotlin Coroutines
- **Serialization:** kotlinx.serialization
- **Build Tool:** Gradle (Kotlin DSL)
- **Logging:** SLF4J + Logback
- **Runtime:** JVM (Netty)