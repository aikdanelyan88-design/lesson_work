package org.example.utils.lesson_4

const val ALL_TABLES = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9
    val checkToday = bookedToday < ALL_TABLES
    val checkTomorrow = bookedTomorrow < ALL_TABLES

    println("Доступность столиков на сегодня:$checkToday \nДоступность столиков на завтра:$checkTomorrow")
}