package com.sivalabs.myapp.entity.dao

import com.sivalabs.myapp.entity.dto.Ride
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
class RideDao {

    @Autowired
    private lateinit var entityManager: EntityManager


    fun findAll(): List<Ride> {
        return entityManager.createQuery("SELECT e FROM RIDE e", Ride::class.java).resultList
    }

    fun findById(rideId: Long): Ride {
        val ride: Ride  = entityManager.find(Ride::class.java, rideId);
        return ride
    }

    fun existsById(rideId: Long): Boolean {
        val ride  = entityManager.find(Ride::class.java, rideId);
        return ride != null
    }

    fun create(ride: Ride) {
        entityManager.persist(ride)
    }

    fun update(surfer: Ride) {
        entityManager.merge(surfer)
    }

    fun deleteById(surferId: Long) {
        val surfer: Ride = findById(surferId)
        entityManager.remove(surfer)
    }
}