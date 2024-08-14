package com.example.smoke_giga_241.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "user_")
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    open var id: UUID? = null

    @Column(name = "name")
    open var name: String? = null

    @Column(name = "username")
    open var username: String? = null

    @Column(name = "email")
    open var email: String? = null

    @Column(name = "gender")
    open var gender: String? = null

    @Column(name = "credit_card")
    open var creditCard: String? = null
}