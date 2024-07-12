package org.example

fun main() {
    asd()
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

//3,4
fun humanAndApple(){
    println("Сколько яблок?")
    val apple = readln().toInt()
    println("Сколько людей?")
    val human = readln().toInt()
    appleAndHuman(apple, human)
}

fun appleAndHuman(apple: Int, human: Int){
    if (apple > human){
        val distributed = apple - human
        val stayed = apple - distributed
        println("Роздано: $stayed.")
        println("Осталось: $distributed.")
    } else if (apple == human){
        println("Все ялоки розданы.")
    }
    else{
        val answer = human - apple
        println("Людей больше чем яблок.")
        println("Не хватает $answer яблок.")
    }
}

//3,5
fun rectangle(){
    println("Данные вашего прямоугольника")
    println("Введите длина:")
    val width = readln().toInt()
    println("Введите высота:")
    val height = readln().toInt()
    square(width, height)
}

fun square(width: Int, height: Int){
    if (width > height){
        val result = width / height
        println("В вашем прямоугольнике поместиться $result квадратов.")
    } else {
        println("Не верно!")
        println("Длина должна быть больше высоты.")
    }
}


fun asd() {
    println("Какое у вас место?")
    val place = readln().toInt()
    compartment(place)
}

fun compartment(place: Int){
    when(place) {
        in 1..4 -> println("У вас первое купе")
        in 5..8 -> println("У вас второе купе")
        in 9..13 -> println("У вас третье купе")
        in 14..17 -> println("У вас четвертое купе")
        in 18..21 -> println("У вас пятое купе")
        in 22..25 -> println("У вас шестое купе")
        in 26..29 -> println("У вас седьмое купе")
        in 30..34 -> println("У вас восьмое купе")
        in 38..48 -> println("У вас девятое купе")
        else -> println("Вы не в том вагоне")
    }
    }
