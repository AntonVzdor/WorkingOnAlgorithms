package org.example

fun main() {

}

fun numberOne(){ val numbers = arrayOf(31, 18, 79); for (i in numbers) print("$i ")}

fun numberTwo(){ val number = arrayOf(47, 50, 150); for (i in number) print("$i  ")}

fun numberThree(){ val number = arrayOf(50, 10); for (i in number) println("$i")}

fun numberFour(){ val number = arrayOf(5, 10, 21); for (i in number) println("$i")}

fun numberFive(){ val number = arrayOf(1, 2); for (i in number) println("$i")}

fun numberPi(){ val pi = 3.1415926; println("%.3f".format(pi))}

fun numberE(){ val e = 2.71828; println("%.1f".format(e))}

fun inputNumber(){ val inputUser: Int = readln().toInt(); println("Вы ввели чило: $inputUser")}

fun inputNumberUser(){ val inputUser: Int = readln().toInt(); println("$inputUser - вот какое число вы ввели") }

fun inputName(){ println("Введите имя"); val inputUser = readln(); println(inputUser) }

fun footballTeam(){ println("Введите название команды"); val footballTeamUser = readln(); println("$footballTeamUser - это чемпионы!") }

fun inputUserName(){ println("Введите имя"); val inputUser = readln(); println("Привет, $inputUser!") }

fun newUserInput(){
    println("Введите целое число")
    val numberInput = readln()

    if ((numberInput.toFloat() % 1) == 0.toFloat()){
        val numNext = numberInput.toInt() + 1
        val numPast = numberInput.toInt() - 1
        println("Следующее за число $numberInput число - $numNext")
        println("Для числа $numberInput предыдущее чилос - $numPast")
    } else{
        println("Вы ввели не целое чило")
    }}