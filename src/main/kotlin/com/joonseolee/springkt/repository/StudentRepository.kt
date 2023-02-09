package com.joonseolee.springkt.repository

import com.joonseolee.springkt.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long>, StudentQueryRepository {
}