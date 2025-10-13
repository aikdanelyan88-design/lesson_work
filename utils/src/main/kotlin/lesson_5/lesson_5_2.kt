package org.example.utils.lesson_5

const val AGE_OF_MAJORITY = 18
const val THIS_YEAR = 2025

fun main() {

    val userYearOfBirth = readln().toInt()

    val userAge = THIS_YEAR - userYearOfBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show special content"
    } else {
        "Back to main screen"
    }
    println(resultText)
}