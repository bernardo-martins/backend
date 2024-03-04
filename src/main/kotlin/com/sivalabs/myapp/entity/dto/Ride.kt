package com.sivalabs.myapp.entity.dto

import javax.persistence.Id;
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Table

@Entity
@Table(name="RIDE")
class Ride(
    @Id
    @GeneratedValue
    val rideId: UUID,
    val cost: Int
)