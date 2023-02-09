package com.joonseolee.springkt.repository

import com.joonseolee.springkt.config.QueryDSLConfiguration
import com.joonseolee.springkt.entity.School
import com.joonseolee.springkt.entity.Student
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.context.annotation.Import

@DataJpaTest
@Import(QueryDSLConfiguration::class)
class KotestStudentRepositoryTest : DescribeSpec() {
    override fun extensions() = listOf(SpringExtension)

    @Autowired
    private lateinit var studentRepository: StudentRepository

    @Autowired
    private lateinit var schoolRepository: SchoolRepository

    init {
        describe("studentRepository") {
            generateData()
            context("save") {
                it("save successfully") {
                    val student = Student("hello", 13)
                    studentRepository.save(student)

                    val selectedStudent = studentRepository.findById(4L).orElse(null)

                    selectedStudent shouldBe student
                }
            }
        }

        describe("schoolRepository") {
            context("ddd") {
                it("영통 학교의 학생은 2명이다") {
                    val school = schoolRepository.findById(2).orElse(null)

                    school shouldNotBe null
                    school.students.size shouldBeExactly 2
                }
            }
        }
    }

    final fun generateData() {
        val oneSchool = School("영일")
        val twoSchool = School("영통")
        schoolRepository.save(oneSchool)
        schoolRepository.save(twoSchool)

        studentRepository.save(Student("joon", 12, oneSchool))
        studentRepository.save(Student("fkvkv", 40, twoSchool))
        studentRepository.save(Student("zoo", 23, twoSchool))
    }
}