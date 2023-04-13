package com.carlos.estudos.kotlinapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MainController(val repository: ListRepository) {
    @GetMapping
    fun get() : List<com.carlos.estudos.kotlinapi.entity.List>{
        return repository.findAll();
    }
}