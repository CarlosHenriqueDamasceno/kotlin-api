package com.carlos.estudos.kotlinapi.dto

import com.carlos.estudos.kotlinapi.entity.User

data class UserOutputDto(val id: Long, val name: String, val balance: Float) {
    companion object {
        fun fromEntity(user: User): UserOutputDto {
            return user.run {
                UserOutputDto(id!!, name, balance)
            }
        }
    }
}
