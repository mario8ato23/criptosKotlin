package com.example.tradingcriptos.tutorial

fun multiTable(number: Int) {
    val listMultiple = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in listMultiple) {
        val res = number * i
        println("${number} * ${i} = ${res}")
    }
}