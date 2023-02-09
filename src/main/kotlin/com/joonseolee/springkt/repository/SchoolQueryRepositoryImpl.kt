package com.joonseolee.springkt.repository

import com.querydsl.jpa.impl.JPAQueryFactory

class SchoolQueryRepositoryImpl constructor(
        private val jpaQueryRepository: JPAQueryFactory
) : SchoolQueryRepository {
}