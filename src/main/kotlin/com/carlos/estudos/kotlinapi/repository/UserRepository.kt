package com.carlos.estudos.kotlinapi.repository

import com.carlos.estudos.kotlinapi.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}