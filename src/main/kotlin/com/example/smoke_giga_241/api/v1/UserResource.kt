package com.example.smoke_giga_241.api.v1

import com.example.smoke_giga_241.entity.User
import com.example.smoke_giga_241.repository.UserRepository
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.io.IOException
import java.util.*

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
class UserResource(private val userRepository: UserRepository, private val objectMapper: ObjectMapper) {
    @GetMapping
    fun getList(): List<User> {
        return userRepository.findAll()
    }


    @GetMapping("/{id}")
    fun getOne(@PathVariable id: UUID): User {
        val userOptional: Optional<User> = userRepository.findById(id)
        return userOptional.orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        }
    }

    @GetMapping("/by-ids")
    fun getMany(@RequestParam ids: List<UUID>): List<User> {
        return userRepository.findAllById(ids)
    }

    @PostMapping
    fun create(@RequestBody user: User): User {
        return userRepository.save(user)
    }

    @PostMapping("/bulk")
    fun createMany(@RequestBody users: List<User>): List<User> {
        return userRepository.saveAll(users)
    }

    @PatchMapping("/{id}")
    @Throws(IOException::class)
    fun patch(@PathVariable id: UUID, @RequestBody patchNode: JsonNode): User {
        val user: User = userRepository.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        }
        objectMapper.readerForUpdating(user).readValue<User>(patchNode)
        return userRepository.save(user)
    }

    @PatchMapping
    @Throws(IOException::class)
    fun patchMany(@RequestParam ids: List<UUID>, @RequestBody patchNode: JsonNode): List<UUID> {
        val users: Collection<User> = userRepository.findAllById(ids)
        for (user in users) {
            objectMapper.readerForUpdating(user).readValue<User>(patchNode)
        }
        val resultUsers: List<User> = userRepository.saveAll(users)
        return resultUsers.mapNotNull(User::id)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: UUID): User? {
        val user: User? = userRepository.findById(id).orElse(null)
        if (user != null) {
            userRepository.delete(user)
        }
        return user
    }

    @DeleteMapping
    fun deleteMany(@RequestParam ids: List<UUID>) {
        userRepository.deleteAllById(ids)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: UUID, @RequestBody user: User): User {
        if (!userRepository.existsById(id)) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        }
        return userRepository.save(user)
    }
}
