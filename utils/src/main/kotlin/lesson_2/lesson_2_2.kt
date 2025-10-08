package org.example.utils.lesson_2

fun main(){
    val worker = 50
    val workerSalary = 30000
    val intern = 30
    val internSalary = 20000
    val expensesWorkerSalary = (worker * workerSalary)
    println(expensesWorkerSalary)
    val generalExpense = (intern * internSalary + expensesWorkerSalary)
    println(generalExpense)
    val averageSalary = (generalExpense / (worker + intern))
    println(averageSalary)
}