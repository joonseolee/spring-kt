package com.joonseolee.springkt.util

import com.joonseolee.springkt.util.Calculator.sub
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class CalculatorKotestBehaviorTest : BehaviorSpec({
    given("calculate") {
        `when`("1, 2를 더하면") {
            val result = Calculator.add(1, 2)
            then("3 이 반환된다") {
                result shouldBe 3
            }
        }

        `when`("1, 2 를 빼면") {
            val result = 1 sub 2
            then("-1 이 반환된다") {
                result shouldBe -1
            }
        }
    }
})
