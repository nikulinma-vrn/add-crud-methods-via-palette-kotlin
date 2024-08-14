package com.example.smoke_giga_241.dto

import java.util.*

/**
 * DTO for {@link com.example.smoke_giga_241.entity.User}
 */
data class UserDto(
    val id: UUID? = null,
    val name: String? = null,
    val username: String? = null,
    val email: String? = null
)