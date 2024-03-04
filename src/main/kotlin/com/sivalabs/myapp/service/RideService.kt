package com.sivalabs.myapp.service

import com.sivalabs.myapp.entity.dao.RideDao
import com.sivalabs.myapp.entity.dto.Ride
import com.sivalabs.myapp.exceptions.SurferNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class RideService(val rideDao : RideDao) {

    fun getAllRides(): List<Ride> = rideDao.findAll();

    fun getRideById(rideId: Long): Ride = rideDao.findById(rideId)

    fun createRide(ride: Ride) = rideDao.create(ride)

    fun updateRide(ride: Ride) = rideDao.update(ride)

    fun deleteRideById(rideId: Long) {
        return if (rideDao.existsById(rideId)) {
            rideDao.deleteById(rideId)
        } else throw SurferNotFoundException(HttpStatus.NOT_FOUND, "No matching ride with id "+rideId+" was found")
    }

}