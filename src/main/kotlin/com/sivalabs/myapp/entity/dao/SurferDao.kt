package com.sivalabs.myapp.entity.dao

import com.sivalabs.myapp.entity.dto.Surfer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
class SurferDao {

    @Autowired
    private lateinit var entityManager: EntityManager

    fun findAll(): List<Surfer> {
        return entityManager.createQuery("SELECT e FROM SURFER e", Surfer::class.java).resultList
    }

    fun findById(surferId: Long): Surfer {
        val surfer: Surfer  = entityManager.find(Surfer::class.java, surferId);
        return surfer
    }

    fun existsById(surferId: Long): Boolean {
        val surfer  = entityManager.find(Surfer::class.java, surferId);
        return surfer != null
    }

    fun create(surfer: Surfer) {
        entityManager.persist(surfer)
    }

    fun update(surfer: Surfer) {
        entityManager.merge(surfer)
    }

    fun deleteById(surferId: Long) {
        val surfer: Surfer = findById(surferId)
        entityManager.remove(surfer)
    }

}