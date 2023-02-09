package com.joonseolee.springkt.repository

import com.joonseolee.springkt.entity.Student
import com.querydsl.jpa.impl.JPAQueryFactory

class StudentQueryRepositoryImpl constructor(
        private val jpaQueryRepository: JPAQueryFactory
) : StudentQueryRepository {

    override fun findByConditions(): Student {
        return Student("ee", 330)
    }
}
