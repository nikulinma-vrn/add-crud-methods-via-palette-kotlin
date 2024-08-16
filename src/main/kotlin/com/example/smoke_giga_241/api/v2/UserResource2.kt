package com.example.smoke_giga_241.api.v2

import com.example.smoke_giga_241.entity.User
import com.example.smoke_giga_241.repository.UserRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
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
class UserResource2(private val userRepository: UserRepository) {
    @GetMapping
    fun getList(@ModelAttribute filter: UserFilter?, pageable: Pageable): Page<User> {
        val spec: Specification<User>? = filter?.toSpecification()
        return userRepository.findAll(spec, pageable)
    }


}

