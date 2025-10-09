package org.example.utils.lesson_2

fun main() {
    val crystal = 7
    val metal = 11
    val pecentageBuff = 20
    val possibleBuff = 100
    val buffCrystal = crystal * pecentageBuff / possibleBuff
    val buffMetal = metal * pecentageBuff / possibleBuff
    println("Кристалическая руда: $buffCrystal \nЖелезная руда: $buffMetal ")

}