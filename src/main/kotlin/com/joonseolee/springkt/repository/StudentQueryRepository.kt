package com.joonseolee.springkt.repository

import com.joonseolee.springkt.entity.Student

interface StudentQueryRepository {
    fun findByConditions(): Student
}