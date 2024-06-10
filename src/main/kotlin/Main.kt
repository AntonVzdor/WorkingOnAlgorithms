package org.example

fun main() {
    numberOne()
    println("")
    numberTwo()
    println("")
    numberThree()
    println("")
    numberFour()
    println("")
    numberFive()
    println("")
    numberPi()
    println("")
    numberE()
    println("")
    inputNumber()
}

fun numberOne(){ val numbers = arrayOf(31, 18, 79); for (i in numbers) print("$i ")}

fun numberTwo(){ val number = arrayOf(47, 50, 150); for (i in number) print("$i  ")}

fun numberThree(){ val number = arrayOf(50, 10); for (i in number) println("$i")}

fun numberFour(){ val number = arrayOf(5, 10, 21); for (i in number) println("$i")}

fun numberFive(){ val number = arrayOf(1, 2); for (i in number) println("$i")}

fun numberPi(){ val pi = 3.1415926; println("%.3f".format(pi))}

fun numberE(){ val e = 2.71828; println("%.1f".format(e))}

fun inputNumber(){ val inputUser: Int = readln().toInt(); println("Вы ввели чило: $inputUser")}