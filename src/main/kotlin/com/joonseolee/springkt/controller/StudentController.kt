package com.joonseolee.springkt.controller

import com.joonseolee.springkt.entity.Student
import com.joonseolee.springkt.service.StudentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/students")
@RestController
class StudentController(private val studentService: StudentService) {

    @GetMapping
    fun findByConditions(): Student {
        return studentService.findByConditions()
    }

    @GetMapping("/{id}")
    fun findByConditions(@PathVariable id: Long): Student? {
        return studentService.findById(id)
    }

    @PostMapping
    fun save(@RequestBody student: Student): Student {
        return studentService.save(student)
    }
}