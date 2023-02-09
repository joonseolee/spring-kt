package com.joonseolee.springkt.repository

import com.joonseolee.springkt.entity.School
import org.springframework.data.jpa.repository.JpaRepository

interface SchoolRepository : JpaRepository<School, Long>, SchoolQueryRepository {

}