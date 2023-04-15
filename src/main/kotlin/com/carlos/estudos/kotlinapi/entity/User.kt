package com.carlos.estudos.kotlinapi.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val balance: Float,
    @OneToMany(mappedBy = "user")
    val categories: List<Category>
)