package com.joonseolee.springkt.repository

import com.joonseolee.springkt.config.QueryDSLConfiguration
import com.joonseolee.springkt.entity.Student
import io.kotest.core.spec.style.DescribeSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.context.annotation.Import

@DataJpaTest
@Import(QueryDSLConfiguration::class)
class StudentRepositoryTest {

    @Autowired
    lateinit var studentRepository: StudentRepository

    @Test
    fun saveTest() {
        val student = Student("hello", 13)

        studentRepository.save(student)

        val selectedStudent = studentRepository.findById(1L).orElse(null)

        assertThat(student).isEqualTo(selectedStudent)
    }
}