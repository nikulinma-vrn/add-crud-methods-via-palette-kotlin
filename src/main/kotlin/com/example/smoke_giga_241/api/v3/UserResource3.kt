package com.example.smoke_giga_241.api.v3

import com.example.smoke_giga_241.dto.UserMapper
import com.example.smoke_giga_241.repository.UserRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/*
 * ToDo: Amplicode Designer -> Request Handling -> Get All
 *       DTO class: UserDto
 *       List filter: UserDtoFilter
 *       Pagination: ON
 *
 * ToDo: Amplicode Designer -> Request Handling -> Get One
 *       DTO class: UserDto
 *       Resource path: /{id}
 *
 * ToDo: Amplicode Designer -> Request Handling -> Get Many
 *       DTO class: UserDto
 *       Resource path: /by-ids
 *
 * ToDo: Amplicode Designer -> Request Handling -> Create One
 *       DTO class: UserDto
 *
 * ToDo: Amplicode Designer -> Request Handling -> Create Many
 *       DTO class: UserDto
 *       Resource path: /bulk
 *
 * ToDo: Amplicode Designer -> Request Handling -> Path One
 *       DTO class: UserDto
 *       Resource path: /{id}
 *
 * ToDo: Amplicode Designer -> Request Handling -> Path Many
 *       DTO class: UserDto
 *
 * ToDo: Amplicode Designer -> Request Handling -> Update One
 *       DTO class: UserDto
 *       Proxy service: None
 *       Resource path: /{id}
 *
 */

@RestController
@RequestMapping("/rest/v3")
class UserResource3(private val userRepository: UserRepository, private val userMapper: UserMapper,
                    private val objectMapper: ObjectMapper
) {

}

