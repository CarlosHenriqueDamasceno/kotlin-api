package com.carlos.estudos.kotlinapi.financialPosting

import com.carlos.estudos.kotlinapi.category.Category
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "financial_postings")
class FinancialPosting(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val amount: Float,
    val datetime: LocalDateTime,
    @ManyToOne
    @JoinColumn(name = "category_id")
    val category: Category
)