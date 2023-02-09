package com.joonseolee.springkt.util

import com.joonseolee.springkt.util.Calculator.sub
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.core.spec.style.Test
import io.kotest.matchers.shouldBe

internal class CalculatorJunitTest: AnnotationSpec() {

    @Test
    fun `1, 2 를 더하면 3이 나온다`() {
        val result = Calculator.add(1, 2)

        result shouldBe 3
    }

    @Test
    fun `아니 이게 된다고?`() {
        val result = 1 sub 2

        result shouldBe -1
    }

    companion object {
        private val calculations = listOf(
                "1 * 1 * 1" to 20
        )
    }
}