package org.example.utils.lesson_3

fun main(){
    var откуда = "Е2"
    var куда = "Е4"
    var номерХода = "1"
    var ход =("[$откуда-$куда;$номерХода]")
    println(ход)
    откуда = "D2"
    куда = "D3"
    ход =("[$откуда-$куда;$номерХода]")
    println(ход)
}