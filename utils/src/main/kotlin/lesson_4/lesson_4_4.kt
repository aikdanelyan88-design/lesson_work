package org.example.utils.lesson_4

fun main() {
    val day = 5
    val upperBodyDay = day % 2 != 0
    val lowerBodyDay = !upperBodyDay

    println("""
        Упражнения для рук: $upperBodyDay
        Упражнения для ног: $lowerBodyDay
        Упражнения для спины: $lowerBodyDay
        Упражнения для пресса: $upperBodyDay
    """.trimIndent()
    )
}
