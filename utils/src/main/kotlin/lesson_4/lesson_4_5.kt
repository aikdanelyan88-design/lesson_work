package org.example.utils.lesson_4

fun main() {

    print("Наличие повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа:")
    val crew = readln().toInt()

    print("Количество ящиков с провизией на борту:")
    val boxesOfProvision = readln().toInt()

    print("Благоприятность метеоусловий (true/false):")
    val isWeatherGood = readln().toBoolean()

    val condition = (!hasDamage && crew in 55..70 && boxesOfProvision > 50 && (isWeatherGood || !isWeatherGood)) ||
            (hasDamage && crew == 70 && isWeatherGood && boxesOfProvision >= 50)

    println("Корабль может отправляться в плавание: $condition")

}