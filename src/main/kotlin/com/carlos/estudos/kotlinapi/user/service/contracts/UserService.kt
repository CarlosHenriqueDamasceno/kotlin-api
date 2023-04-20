package com.carlos.estudos.kotlinapi.user.service.contracts

import com.carlos.estudos.kotlinapi.user.dto.UserInputDto
import com.carlos.estudos.kotlinapi.user.dto.UserOutputDto

interface UserService {
    fun find(id: Long): UserOutputDto
    fun getAll(): List<UserOutputDto>
    fun create(data: UserInputDto): UserOutputDto
    fun update(id: Long, data: UserInputDto): UserOutputDto
    fun delete(id: Long)
}