package org.example.utils.lesson_4

fun main() {
    val allTables = 13
    val bookedToday = 13
    val bookedTomorrow = 9
    val checkToday = bookedToday < allTables
    val checkTomorrow = bookedTomorrow < allTables
    println("Доступность столиков на сегодня:$checkToday \nДоступность столиков на завтра:$checkTomorrow")
}