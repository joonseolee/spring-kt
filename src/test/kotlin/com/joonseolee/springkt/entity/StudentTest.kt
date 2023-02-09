//package com.joonseolee.springkt.entity
//
//import org.assertj.core.api.Assertions.assertThat
//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.params.ParameterizedTest
//import org.junit.jupiter.params.provider.CsvSource
//
//internal class StudentTest {
//
//    @ParameterizedTest
//    @CsvSource(value = ["joonseo|30|25", "vv|2|20"], delimiter = '|')
//    fun `var 타입인 age 만 변경이 가능하다`(name: String, fakeAge: Int, realAge: Int) {
//        val student = Student(name, fakeAge)
//
//        assertThat(student.name).isEqualTo(name)
//        assertThat(student.age).isEqualTo(fakeAge)
//
//        student.age = realAge
//
//        assertThat(student.age).isEqualTo(realAge)
//    }
//
//    @ParameterizedTest
//    @CsvSource(value = ["joon|30|joon|30"], delimiter = '|')
//    fun `data 클래스는 필드값이 같으면 객체가 같다`(oneName: String, oneAge: Int, twoName: String, twoAge: Int) {
//        val oneStudent = Student(oneName, oneAge)
//        val twoStudent = Student(twoName, twoAge)
//        val notDataStudent = NotDataStudent(twoName, twoAge)
//
//        assertThat(oneStudent).isEqualTo(twoStudent)
//        assertThat(oneStudent).isNotEqualTo(notDataStudent)
//
//        Student.DEFAULT_SCORE
//    }
//
//    private class NotDataStudent(val name: String, val age: Int)
//}