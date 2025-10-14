package org.example.utils.lesson_5

const val NUMBER_ONE = 3
const val NUMBER_TWO = 4

fun main() {

    print("Пройдите капчу: $NUMBER_ONE + $NUMBER_TWO = ")
    val userNumber = readln().toInt()
    val result = NUMBER_ONE + NUMBER_TWO

    val resultText = if (userNumber == result) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен!"
    }
    println(resultText)
}