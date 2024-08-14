package com.example.smoke_giga_241.repository;

import com.example.smoke_giga_241.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, UUID> {
}