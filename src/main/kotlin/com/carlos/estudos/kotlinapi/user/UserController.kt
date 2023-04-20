package com.carlos.estudos.kotlinapi.user

import com.carlos.estudos.kotlinapi.user.dto.UserInputDto
import com.carlos.estudos.kotlinapi.user.dto.UserOutputDto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/users")
class UserController(val service: UserService) {

    @GetMapping("{id}")
    fun find(@PathVariable id: Long): UserOutputDto {
        return service.find(id)
    }

    @GetMapping
    fun getAll(): List<UserOutputDto> {
        return service.getAll()
    }

    @PostMapping
    fun create(@RequestBody data: UserInputDto): UserOutputDto {
        return service.create(data)
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody data: UserInputDto): UserOutputDto {
        return service.update(id, data)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) {
        service.delete(id)
    }
}