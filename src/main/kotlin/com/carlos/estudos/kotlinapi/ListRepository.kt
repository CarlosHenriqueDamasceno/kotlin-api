package com.carlos.estudos.kotlinapi

import com.carlos.estudos.kotlinapi.entity.List
import org.springframework.data.jpa.repository.JpaRepository

interface ListRepository : JpaRepository<List, Long>{
}