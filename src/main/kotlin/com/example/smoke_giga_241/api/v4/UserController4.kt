package com.example.smoke_giga_241.api.v4

import com.example.smoke_giga_241.service.UserService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/*
 * ToDo: Amplicode Designer -> Request Handling -> Get All
 *       DTO class: UserDto
 *       Pagination: ON
 *       List filter: UserDtoFilter
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Get One
 *       DTO class: UserDto
 *       Resource path: /{id}
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Get Many
 *       DTO class: UserDto
 *       Resource path: /by-ids
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Create One
 *       DTO class: UserDto
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Create Many
 *       DTO class: UserDto
 *       Resource path: /bulk
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Path One
 *       DTO class: UserDto
 *       Resource path: /{id}
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Path Many
 *       DTO class: UserDto
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Delete One
 *       DTO class: UserDto
 *       Resource path: /{id}
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Delete Many
 *       Proxy service: UserServiceImpl
 *
 * ToDo: Amplicode Designer -> Request Handling -> Update One
 *       DTO class: UserDto
 *       Resource path: /{id}
 *       Proxy service: UserServiceImpl
 *
 */

@RestController
@RequestMapping("/rest/v4")
class UserController4(private val userService: UserService) {

}

