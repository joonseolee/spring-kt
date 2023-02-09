package com.joonseolee.springkt.service

import com.joonseolee.springkt.entity.Student
import com.joonseolee.springkt.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(private val studentRepository: StudentRepository) {

    fun findByConditions(): Student {
        return studentRepository.findByConditions()
    }

    fun save(student: Student): Student {
        return studentRepository.save(student)
    }

    fun findById(id: Long): Student? {
        return studentRepository.findById(id).orElse(null)
    }
}