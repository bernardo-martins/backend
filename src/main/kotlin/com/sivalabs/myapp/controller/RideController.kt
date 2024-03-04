package com.sivalabs.myapp.controller

import com.sivalabs.myapp.entity.dto.Ride
import com.sivalabs.myapp.service.RideService
import org.springframework.web.bind.annotation.*
import java.io.Serializable

@RestController
@RequestMapping("/rides")
class RideController(private val rideService: RideService) : Serializable {

    @GetMapping("/")
    fun getAllRides(): List<Ride> = rideService.getAllRides()

    @GetMapping("/{id}")
    fun getRideById(@PathVariable("id") rideId: Long): Ride =
        rideService.getRideById(rideId)

    @PostMapping("/create")
    fun createRide(@RequestBody payload: Ride) = rideService.createRide(payload)

    @PutMapping("/{id}")
    fun updateRideById(@PathVariable("id") rideId: Long, @RequestBody payload: Ride) = rideService.updateRide(payload)

    @DeleteMapping("/{id}")
    fun deleteRideById(@PathVariable("id") rideId: Long) = rideService.deleteRideById(rideId)

}