package org.example.utils.lesson_3

fun main() {
    val name = "Aik"
    val day = "Добрый день"
    val night = "Добрый вечер"
    val sign = ':'
    var greetingsDay = (day + sign + name)
    val greetingsNight = (night + sign + name)

    println(greetingsDay)
    println(greetingsNight)
}