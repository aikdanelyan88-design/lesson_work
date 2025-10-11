package org.example.utils.lesson_3

fun main() {
    val number = 5
    println((1..9).joinToString("\n") { "$number * $it = ${number * it}" })
}