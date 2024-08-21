package com.example.smoke_giga_241.api.v1

import com.example.smoke_giga_241.repository.UserRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/*
 * ToDo: Amplicode Designer -> Request Handling -> Get All
 *       DTO class: User
 *       Proxy service: None
 *       Pagination: OFF
 *
 * ToDo: Amplicode Designer -> Request Handling -> Get One
 *       DTO class: User
 *       Proxy service: None
 *       Resource path: /{id}
 *
 * ToDo: Amplicode Designer -> Request Handling -> Get Many
 *       DTO class: User
 *       Proxy service: None
 *       Resource path: /by-ids
 *
 * ToDo: Amplicode Designer -> Request Handling -> Create One
 *       DTO class: User
 *       Proxy service: None
 *
 * ToDo: Amplicode Designer -> Request Handling -> Create Many
 *       DTO class: User
 *       Resource path: /bulk
 *       Proxy service: None
 *
 * ToDo: Amplicode Designer -> Request Handling -> Path One
 *       DTO class: User
 *       Resource path: /{id}
 *       Proxy service: None
 *
 * ToDo: Amplicode Designer -> Request Handling -> Path Many
 *       DTO class: User
 *       Proxy service: None
 *
 * ToDo: Amplicode Designer -> Request Handling -> Delete One
 *       DTO class: User
 *       Resource path: /{id}
 *       Proxy service: None
 *
 * ToDo: Amplicode Designer -> Request Handling -> Delete Many
 *        Proxy service: None
 *
 * ToDo: Amplicode Designer -> Request Handling -> Update One
 *       DTO class: User
 *       Resource path: /{id}
 *       Proxy service: None
 *
 */

@RestController
@RequestMapping("/rest/v1")
class UserController(private val userRepository: UserRepository, private val objectMapper: ObjectMapper) {

}
