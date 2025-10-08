package org.example.utils.lesson_1

const val z = 60

fun main(){
    val totalSeconds = 6480
    var hours = totalSeconds / (z*z)
    val formattedHours = String.format("%02d",hours)
    val remainingSecondsAfterHours = totalSeconds % (z*z)
    val minutes = remainingSecondsAfterHours / z
    var seconds = remainingSecondsAfterHours % z
    val formattedSeconds = String.format("%02d",seconds)
    println("$formattedHours:$minutes:$formattedSeconds")

}