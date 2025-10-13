package org.example.utils.lesson_5

const val NUMBER_ONE = 15
const val NUMBER_TWO = 25

fun main() {

    print("Введите первое число от 0 до 42:")
    val userNumberOne = readln().toInt()

    print("Введите второе число от 0 до 42:")
    val userNumberTwo = readln().toInt()

    val userNumbers = setOf(userNumberOne, userNumberTwo)
    val winningNumbers = setOf(NUMBER_ONE, NUMBER_TWO)

    val result = userNumbers.count { it in winningNumbers }

    println("Выигрышные числа: $NUMBER_ONE и $NUMBER_TWO")

    when (result) {
        2 -> println("Поздравляем! Вы выйграли главный приз!")
        1 -> println("Вы выйграли утешительный приз!")
        else -> println("Неудача!")
    }
}