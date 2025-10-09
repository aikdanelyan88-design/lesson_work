package org.example.utils.lesson_3

fun main(){
    var where = "Е2"
    var step  = "Е4"
    var numberMove = "1"
    var move = ("[$where-$step;$numberMove]")
    println(move)
    where = "D2"
    step = "D3"
    move =("[$where-$step;$numberMove]")
    println(move)
}