package org.example

fun main() {
    seatCompartment()
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

//3,6
fun seatCompartment() {
    println("Какое у вас место?")
    val seat = readln().toInt()
    println("Сколько купе в вагоне?")
    val compartment = readln().toInt()
    println("Сколько в купе мест?")
    val numberSeats = readln().toInt()
    compartment(seat, compartment, numberSeats)
}

fun compartment(seat: Int, compartment: Int, numberSeats: Int){
    if (seat < 1 || seat > compartment * numberSeats){
println("Hull")
    } else {
val floor = (seat - 1) / numberSeats + 1
println("Ваше место $seat в купе $floor")
    }
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

//3,7
fun decision(){
    println("Какой номер квартиры")
    val apartNumber = readln().toInt()
    println("Сколько этажей")
    val numFloor = readln().toInt()
    println("Сколько квартир на этаже")
    val numApart = readln().toInt()
    floors(apartNumber, numFloor, numApart)
}

fun floors(apartNumber: Int, numFloor : Int, numApart: Int) {
    if (apartNumber < 1 || apartNumber > numFloor * numApart){
        println("{eq")
    } else {
    val floor = (apartNumber - 1) / numApart + 1
    println("Хата $apartNumber на этаже $floor")
    }
}