package org.example.utils.lesson_2

import java.time.temporal.TemporalAmount

const val ONE_HOURS = 60
fun main() {
    val hours = 9
    val minutes = 39
    val minutesRoad = 457
    val totalHoursRoad = minutesRoad / ONE_HOURS
    val totalMinutesRoad = minutesRoad % ONE_HOURS
    val sumMinutes = minutes + totalMinutesRoad
    val totalminutes = sumMinutes % ONE_HOURS
    val wholeHours = sumMinutes / ONE_HOURS
    val totalhours = hours + totalHoursRoad + wholeHours
    println("$totalhours:$totalminutes")
}