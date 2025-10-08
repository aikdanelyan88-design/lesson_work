package org.example.utils.lesson_2

import kotlin.math.pow

const val P = 70_000

fun main(){
    val r = 0.167
    val n = 1
    val t = 20
    val a = (1 + r/n)
    val z = a.pow(t)
    val x = P * z
    println( String.format("%.3f",x))

}