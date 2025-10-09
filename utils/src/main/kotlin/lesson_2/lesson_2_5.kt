package org.example.utils.lesson_2

import kotlin.math.pow

fun main() {
    val capital = 70_000
    val percent = 16.7
    val maksPercent = 100
    val accrual = 1
    val years = 20
    val formulaVariable = 1
    val recalculationPercent = percent / maksPercent
    val calculation = (formulaVariable + recalculationPercent / accrual)
    val recalculation = calculation.pow(years)
    val totalAmount = capital * recalculation
    println(String.format("%.3f", totalAmount))

}