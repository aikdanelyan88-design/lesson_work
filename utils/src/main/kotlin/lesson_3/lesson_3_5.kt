package org.example.utils.lesson_3

fun main() {
    val move: String = ("D2-D4;0")
    val data = move.split("-", ";")
    val where = data[0]
    val step = data[1]
    val number = data[2]
    val message = ("$where \n$step \n$number")
    println(message)
}