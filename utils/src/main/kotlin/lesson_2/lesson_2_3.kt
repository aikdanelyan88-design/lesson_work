package org.example.utils.lesson_2

import java.time.temporal.TemporalAmount

fun  main(){
    val hours1 = 9
    val minutes1 = 39
    val minutesRoad = 457
    val totalHours = minutesRoad / 60
    val totalMinutes = minutesRoad % 60
    val totalminutes2 = (minutes1 + totalMinutes) % 60
    val wholeHours = (minutes1 + totalMinutes) / 60
    val totalhours2 = (hours1 + totalHours + wholeHours )
    println("$totalhours2:$totalminutes2")
}