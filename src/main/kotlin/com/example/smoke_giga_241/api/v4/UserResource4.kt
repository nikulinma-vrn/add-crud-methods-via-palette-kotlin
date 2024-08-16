package com.example.smoke_giga_241.api.v4

import com.example.smoke_giga_241.dto.UserDto
import com.example.smoke_giga_241.service.UserService
import com.fasterxml.jackson.databind.JsonNode
import org.springframework.web.bind.annotation.*
import java.io.IOException
import java.util.*

/*
 * ToDo: Amplicode Designer -> Request Handling -> Get All
 *       DTO class: UserDto
 *       Pagination: ON
 *       List filter: UserFilter
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
class UserResource4(private val userService: UserService) {
    @GetMapping
    fun getList(@ModelAttribute filter: UserFilter?): List<UserDto> {
        return userService.getList(filter)
    }


    @GetMapping("/{id}")
    fun getOne(@PathVariable id: UUID): UserDto {
        return userService.getOne(id)
    }

    @GetMapping("/by-ids")
    fun getMany(@RequestParam ids: List<UUID>): List<UserDto> {
        return userService.getMany(ids)
    }

    @PostMapping
    fun create(@RequestBody dto: UserDto): UserDto {
        return userService.create(dto)
    }

    @PostMapping("/bulk")
    fun createMany(@RequestBody dtos: List<UserDto>): List<UserDto> {
        return userService.createMany(dtos)
    }

    @PatchMapping("/{id}")
    @Throws(IOException::class)
    fun patch(@PathVariable id: UUID, @RequestBody patchNode: JsonNode): UserDto {
        return userService.patch(id, patchNode)
    }

    @PatchMapping
    @Throws(IOException::class)
    fun patchMany(@RequestParam ids: List<UUID>, @RequestBody patchNode: JsonNode): List<UUID> {
        return userService.patchMany(ids, patchNode)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: UUID, @RequestBody dto: UserDto): UserDto {
        return userService.update(id, dto)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: UUID): UserDto? {
        return userService.delete(id)
    }

    @DeleteMapping
    fun deleteMany(@RequestParam ids: List<UUID>) {
        userService.deleteMany(ids)
    }
}

