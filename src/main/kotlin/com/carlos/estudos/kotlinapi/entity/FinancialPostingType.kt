package com.carlos.estudos.kotlinapi.entity

import jakarta.persistence.*

@Entity
@Table(name = "financial_posting_types")
class FinancialPostingType (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    @OneToMany(mappedBy = "category")
    val categories: List<Category>
)