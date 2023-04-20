package com.carlos.estudos.kotlinapi.financialPosting

import org.springframework.data.jpa.repository.JpaRepository

interface FinancialPostingRepository : JpaRepository<FinancialPosting, Long>