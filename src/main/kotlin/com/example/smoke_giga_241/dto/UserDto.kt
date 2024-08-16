package com.example.smoke_giga_241.dto

import java.util.*

/**
 * DTO for {@link com.example.smoke_giga_241.entity.User}
 */
data class UserDto(
    var id: UUID? = null,
    var name: String? = null,
    var username: String? = null,
    var email: String? = null
)