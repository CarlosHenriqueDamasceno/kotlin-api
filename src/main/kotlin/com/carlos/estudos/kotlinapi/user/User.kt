package com.carlos.estudos.kotlinapi.user

import com.carlos.estudos.kotlinapi.category.Category
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String,
    val balance: Float,
    @OneToMany(mappedBy = "user")
    val categories: List<Category>
) {
    constructor(name: String) : this(null, name, 0f, listOf())
}