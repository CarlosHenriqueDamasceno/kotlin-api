package com.carlos.estudos.kotlinapi.repository

import com.carlos.estudos.kotlinapi.entity.FinancialPosting
import org.springframework.data.jpa.repository.JpaRepository

interface FinancialPostingRepository: JpaRepository<FinancialPosting, Long> {
}