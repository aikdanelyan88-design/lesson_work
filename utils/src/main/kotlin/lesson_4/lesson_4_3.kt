package org.example.utils.lesson_4

const val WEATHER_SUNNY: Boolean = true
const val AWNING_POSITION: Boolean = true
const val HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "winter"

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "winter"
    val favorableConditions = (isSunny == WEATHER_SUNNY) &&
            (isAwningOpen == AWNING_POSITION) &&
            (airHumidity == HUMIDITY) &&
            (timeOfYear !== TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}