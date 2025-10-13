package org.example.utils.lesson_4

const val MINIMUM_CREW = 55
const val MAKSIMAL_CREW = 70
const val MINIMUM_BOXES = 50

fun main() {

    print("Наличие повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа:")
    val crew = readln().toInt()

    print("Количество ящиков с провизией на борту:")
    val boxesOfProvision = readln().toInt()

    print("Благоприятность метеоусловий (true/false):")
    val isWeatherGood = readln().toBoolean()

    val condition =
        (!hasDamage &&
                (crew in MINIMUM_CREW..MAKSIMAL_CREW) &&
                (boxesOfProvision > MINIMUM_BOXES) &&
                (isWeatherGood || !isWeatherGood)) ||
                (hasDamage &&
                        (crew == MAKSIMAL_CREW) &&
                        isWeatherGood &&
                        (boxesOfProvision >= MINIMUM_BOXES))

    println("Корабль может отправляться в плавание: $condition")

}