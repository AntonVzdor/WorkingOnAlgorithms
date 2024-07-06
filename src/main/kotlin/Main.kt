package org.example

fun main() {
    appleAndHuman(6, 2)
}

fun centimeInMet(){
    println("Укажите данные в сантиметрах")
    val centimeters = readln().toInt()
    val meters = (centimeters.toDouble()/100)
    println("В метрах это: $meters")
}

fun kilogramInHundred(){
    println("Укажите данные в килограммах")
    val kilogram = readln().toInt()
    val hundredweight = (kilogram.toDouble()/100)
    println("В цейтнерах это: $hundredweight")
}

fun daysAndWeeks(){
    println("Сколько дней прошло?")
    val day = readln().toInt()
    val week = day/7
    println("Это $week недель.")
}

fun appleAndHuman(apple: Int, human: Int){
    val distributed = apple - human
    val stayed = apple - distributed
    println("Роздано: $stayed")
    println("Осталось: $distributed")
}