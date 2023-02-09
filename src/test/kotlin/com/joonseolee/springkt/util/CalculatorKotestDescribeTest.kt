package com.joonseolee.springkt.util

import com.joonseolee.springkt.util.Calculator.sub
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class CalculatorKotestDescribeTest: DescribeSpec({
    describe("calculator") {
        context("1, 2를 더하면") {
            it("3 이 반환된다") {
                val result = Calculator.add(1, 2)

                result shouldBe 3
            }
        }

        context("1, 2 를 빼면 ") {
            it("-1 이 된다") {
                val result = 1 sub 2

                result shouldBe -1
            }
        }
    }
})