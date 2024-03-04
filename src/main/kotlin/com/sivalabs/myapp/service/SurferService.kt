package com.sivalabs.myapp.service

import com.sivalabs.myapp.entity.dao.SurferDao
import com.sivalabs.myapp.entity.dto.Surfer
import com.sivalabs.myapp.exceptions.SurferNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class SurferService(val surferDao: SurferDao) {

    fun getAllSurfers(): List<Surfer> = surferDao.findAll();

    fun getSurfersById(surferId: Long): Surfer = surferDao.findById(surferId)

    fun createSurfer(surfer: Surfer) = surferDao.create(surfer)

    fun updateSurfer(surfer: Surfer) = surferDao.update(surfer)

    fun deleteSurferById(surferId: Long) {
        return if (surferDao.existsById(surferId)) {
            surferDao.deleteById(surferId)
        } else throw SurferNotFoundException(HttpStatus.NOT_FOUND, "No matching surfer with id "+surferId+" was found")
    }
}