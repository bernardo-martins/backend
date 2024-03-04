package com.sivalabs.myapp.entity.dto

import javax.persistence.Id;
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Table

@Entity
@Table(name="SURFER")
data class Surfer(
    @Id
    @GeneratedValue
    val surferId: UUID,
    val age: Int,
    val username: String,
    val level: Int
)