package com.carlos.estudos.kotlinapi.repository

import com.carlos.estudos.kotlinapi.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<Category, Long> {
}