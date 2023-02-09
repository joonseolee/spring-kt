package com.joonseolee.springkt.entity

import org.apache.logging.log4j.util.Strings
import java.util.*
import javax.persistence.*

@Table
@Entity
class Student() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    var name: String = Strings.EMPTY

    private var age: Int = 0

    @ManyToOne(fetch = FetchType.LAZY)
    private lateinit var school: School

    constructor(name: String, age: Int): this() {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, school: School): this(name, age) {
        this.school = school
    }

    override fun hashCode(): Int {
        return Objects.hash(id, name, age)
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) {
            return false
        }

        if (other !is Student) {
            return false
        }

        return this.hashCode() == other.hashCode()
    }
}