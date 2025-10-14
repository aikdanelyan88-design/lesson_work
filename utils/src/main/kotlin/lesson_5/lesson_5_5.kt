package org.example.utils.lesson_5

import kotlin.random.Random

const val MINIMUM_NUMBER = 0
const val MAKSIMUM_NUMBER = 42

fun main() {

    val random = Random
    val randomNumbers = (MINIMUM_NUMBER..MAKSIMUM_NUMBER).shuffled().take(3)

    print("Введите первое число от 0 до 42:")
    val userNumberOne = readln().toInt()

    print("Введите второе число от 0 до 42:")
    val userNumberTwo = readln().toInt()

    print("Введите третье число от 0 до 42:")
    val userNumberThree = readln().toInt()

    val userNumbers = setOf(userNumberOne, userNumberTwo, userNumberThree)
    val winningNumbers = setOf(randomNumbers)

    val result = userNumbers.intersect(winningNumbers)

    when (result) {
        setOf(3) -> println("Вы угадали все числа и выйграли джекпот!")
        setOf(2) -> println("Вы угадали два числа и получаете крупный приз!")
        setOf(1) -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("ВЫ не угадали ни одного числа, неудача!")

    }
    println("Выигрышные числа: $winningNumbers")
}