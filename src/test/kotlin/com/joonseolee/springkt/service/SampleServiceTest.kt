package com.joonseolee.springkt.service

import org.junit.jupiter.api.Test

class SampleServiceTest {

    @Test
    fun hello() {
        println("Hello" + sum(1, 2))
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}