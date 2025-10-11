package org.example.utils.lesson_4

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100
    println(("Груз с весом 20кг и объемом 80л соответствует категории 'Average':") + ((firstCargoWeight > MINIMUM_WEIGHT_AVERAGE) && (firstCargoWeight <= MAKSIMUM_WEIGHT_AVERAGE) && (firstCargoVolume < MAKSIMUM_VOLUME_AVERAGE)))
    println(("Груз с весом 50кг и объемом 100л соответствует категории 'Average':") + ((secondCargoWeight > MINIMUM_WEIGHT_AVERAGE) && (secondCargoWeight <= MAKSIMUM_WEIGHT_AVERAGE) && (secondCargoVolume < MAKSIMUM_VOLUME_AVERAGE)))
}

const val MINIMUM_WEIGHT_AVERAGE = 35
const val MAKSIMUM_WEIGHT_AVERAGE = 100
const val MAKSIMUM_VOLUME_AVERAGE = 100
