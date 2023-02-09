package com.joonseolee.springkt.util

object Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    infix fun Int.sub(b: Int): Int {
        return this - b
    }
}