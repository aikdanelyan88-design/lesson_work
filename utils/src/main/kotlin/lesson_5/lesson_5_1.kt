package org.example.utils.lesson_5

const val RESULT_TASK = 6

fun main() {

    val userAge = readln().toInt()

    val resultText = if (userAge == RESULT_TASK) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен!"
    }
    println(resultText)
}