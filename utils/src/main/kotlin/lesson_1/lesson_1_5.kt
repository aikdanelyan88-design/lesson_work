package org.example.utils.lesson_1

fun main(){
    val totalSeconds = 6480
    var hours = totalSeconds / 3600
    val formattedHours = String.format("%02d",hours)
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    var seconds = remainingSecondsAfterHours % 60
    val formattedSeconds = String.format("%02d",seconds)
    println("${formattedHours}:$minutes:${formattedSeconds}")

}