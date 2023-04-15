package com.carlos.estudos.kotlinapi.repository

import com.carlos.estudos.kotlinapi.entity.FinancialPostingType
import org.springframework.data.jpa.repository.JpaRepository

interface FinancialPostingTypeRepository : JpaRepository<FinancialPostingType, Long>