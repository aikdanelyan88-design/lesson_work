package org.example.utils.lesson_1

const val DIVIDER = 60

fun main() {
    val totalSeconds = 6480
    var hours = totalSeconds / (DIVIDER * DIVIDER)
    val formattedHours = String.format("%02d", hours)
    val remainingSecondsAfterHours = totalSeconds % (DIVIDER * DIVIDER)
    val minutes = remainingSecondsAfterHours / DIVIDER
    var seconds = remainingSecondsAfterHours % DIVIDER
    val formattedSeconds = String.format("%02d", seconds)
    println("$formattedHours:$minutes:$formattedSeconds")

}