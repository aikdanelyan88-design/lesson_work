package org.example.utils.lesson_5

const val CENTIMETERS_IN_A_METER = 100
const val MINIMUM_INDEX = 18.5
const val AVERAGE_INDEX = 25
const val MAKSIMUM_INDEX = 30

fun main() {

    print("Введите ваш вес в кг:")
    val userWeight = readln().toDouble()

    print("Введите ваш рост в см:")
    val userHeight = readln().toFloat()

    val userHeightMeters = userHeight / CENTIMETERS_IN_A_METER
    val bodyMassIndex = userWeight / (userHeightMeters * userHeightMeters)

    val category = when {
        bodyMassIndex < MINIMUM_INDEX -> "Недостаточная масса тела"
        bodyMassIndex < AVERAGE_INDEX -> "Нормальная масса тела"
        bodyMassIndex < MAKSIMUM_INDEX -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Ваш ИМТ: %.2f".format(bodyMassIndex))
    println("Категория: $category")
}