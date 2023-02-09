package com.joonseolee.springkt.entity

import org.apache.logging.log4j.util.Strings
import javax.persistence.*

@Table
@Entity
class School() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    var name: String = Strings.EMPTY

    @OneToMany(mappedBy = "school")
    var students = mutableListOf<Student>()

    constructor(name: String): this() {
        this.name = name
    }
}