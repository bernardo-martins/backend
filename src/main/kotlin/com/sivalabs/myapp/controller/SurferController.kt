package com.sivalabs.myapp.controller

import com.sivalabs.myapp.entity.dto.Surfer
import com.sivalabs.myapp.service.SurferService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/surfers")
class SurferController(private val surferService: SurferService) {

    @GetMapping("/")
    fun getAllSurfers(): List<Surfer> = surferService.getAllSurfers()

    @GetMapping("/test")
    fun getTest() : String {return "/success"}

    @GetMapping("/{id}")
    fun getSurferById(@PathVariable("id") surferId: Long): Surfer =
            surferService.getSurfersById(surferId)

    @PostMapping("/create")
    fun createSurfer(@RequestBody payload: Surfer) = surferService.createSurfer(payload)

    @PutMapping("/{id}")
    fun updateSurferById(@PathVariable("id") surferId: Long, @RequestBody payload: Surfer) = surferService.updateSurfer(payload)

    @DeleteMapping("/{id}")
    fun deleteSurferById(@PathVariable("id") surferId: Long) = surferService.deleteSurferById(surferId)
}