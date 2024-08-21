package com.example.smoke_giga_241.api.v2

import com.example.smoke_giga_241.repository.UserRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/*
 * ToDo: Amplicode Designer -> Request Handling -> Get All
 *       DTO class: User
 *       Filter: UserFilter
 *       Pagination: ON
 */

@RestController
@RequestMapping("/rest/v2")
class UserController2(private val userRepository: UserRepository) {

}

