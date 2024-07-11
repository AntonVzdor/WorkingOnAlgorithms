package org.example

fun main() {
    asd ()
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


fun asd () {
    val mesto = readln().toString()
    compartment(mesto)
}

fun compartment(mesto : String){
    val vanOne = listOf("1","2","3","4")
    val vanTwo = listOf("5","6","7","8")
    val vanTree = listOf("9","10","11","12")
    val vanFour = listOf("13","14","15","16")

    val result = if(mesto.equals(vanOne)) { println("у вас первое купе")
    } else if (mesto.equals(vanTwo)){
        println("у вас первое купе")
    } else if (mesto.equals(vanTree)){
        println("у вас первое купе")
    } else if (mesto.equals(vanFour)) {
        println("у вас первое купе")
    } else {
        println("Хуй")
    }
    return result
}
