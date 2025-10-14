package org.example.utils.lesson_5

const val NUMBER_TO_CALCULATE = 100

fun main() {

    print("Введите растояние поездки (в километрах):")
    val distance = readln().toFloat()

    print("Введите расход топлива на 100 км (в литрах):")
    val fuelconsuption = readln().toFloat()

    print("Введите текущую цену за литр:")
    val pricePerLiter = readln().toFloat()

    val fuel = (distance * fuelconsuption) / NUMBER_TO_CALCULATE
    val totalAmountFuel = fuel * pricePerLiter

    println("Общее количество необходимого топлива: $fuel \nИтоговая стоимость поздки: %.2f".format(totalAmountFuel))
}