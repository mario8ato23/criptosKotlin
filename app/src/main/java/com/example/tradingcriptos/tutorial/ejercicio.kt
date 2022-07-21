package com.example.tradingcriptos.tutorial

import androidx.compose.ui.text.toLowerCase



fun fibonacci(args: Int) {
    val n = 100
    var t1 = 0
    var t2 = 1

    print("Upto $n: ")
    while (t1 <= n) {
        print("$t1 + ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}