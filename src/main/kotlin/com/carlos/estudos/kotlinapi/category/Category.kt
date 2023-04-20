package com.carlos.estudos.kotlinapi.category

import com.carlos.estudos.kotlinapi.financialPosting.FinancialPosting
import com.carlos.estudos.kotlinapi.financialPostingType.FinancialPostingType
import com.carlos.estudos.kotlinapi.user.User
import jakarta.persistence.*

@Entity
@Table(name = "categories")
class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,
    @ManyToOne
    @JoinColumn(name = "financial_posting_type_id")
    val category: FinancialPostingType,
    @OneToMany(mappedBy = "category")
    val financialPostings: List<FinancialPosting>
)