package org.example.utils.lesson_4

fun main() {
    val sunnyWeather: Boolean = true
    val awningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "winter"
    val favorableConditions = sunnyWeather && awningOpen && airHumidity == 20 && timeOfYear != "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}