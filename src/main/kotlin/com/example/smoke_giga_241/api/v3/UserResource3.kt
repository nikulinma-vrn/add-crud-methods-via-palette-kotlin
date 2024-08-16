package com.example.smoke_giga_241.api.v3

import com.example.smoke_giga_241.dto.UserDto
import com.example.smoke_giga_241.dto.UserMapper
import com.example.smoke_giga_241.entity.User
import com.example.smoke_giga_241.repository.UserRepository
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.io.IOException
import java.util.*

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
    @GetMapping
    fun getList(@ModelAttribute filter: UserDtoFilter?, pageable: Pageable): Page<UserDto> {
        val spec: Specification<User>? = filter?.toSpecification()
        val users: Page<User> = userRepository.findAll(spec, pageable)
        return users.map(userMapper::toDto)
    }

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: UUID): UserDto {
        val userOptional: Optional<User> = userRepository.findById(id)
        return userMapper.toDto(userOptional.orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        })
    }

    @GetMapping("/by-ids")
    fun getMany(@RequestParam ids: List<UUID>): List<UserDto> {
        val users: List<User> = userRepository.findAllById(ids)
        return users.map(userMapper::toDto)
    }

    @PostMapping
    fun create(@RequestBody dto: UserDto): UserDto {
        val user: User = userMapper.toEntity(dto)
        val resultUser: User = userRepository.save(user)
        return userMapper.toDto(resultUser)
    }

    @PostMapping("/bulk")
    fun createMany(@RequestBody dtos: List<UserDto>): List<UserDto> {
        val users: Collection<User> = dtos.map(userMapper::toEntity)
        val resultUsers: List<User> = userRepository.saveAll(users)
        return resultUsers.map(userMapper::toDto)
    }

    @PatchMapping("/{id}")
    @Throws(IOException::class)
    fun patch(@PathVariable id: UUID, @RequestBody patchNode: JsonNode): UserDto {
        val user: User = userRepository.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        }
        val userDto = userMapper.toDto(user)
        objectMapper.readerForUpdating(userDto).readValue<UserDto>(patchNode)
        userMapper.updateWithNull(userDto, user)
        val resultUser: User = userRepository.save(user)
        return userMapper.toDto(resultUser)
    }

    @PatchMapping
    @Throws(IOException::class)
    fun patchMany(@RequestParam ids: List<UUID>, @RequestBody patchNode: JsonNode): List<UUID> {
        val users: Collection<User> = userRepository.findAllById(ids)
        for (user in users) {
            val userDto = userMapper.toDto(user)
            objectMapper.readerForUpdating(userDto).readValue<UserDto>(patchNode)
            userMapper.updateWithNull(userDto, user)
        }
        val resultUsers: List<User> = userRepository.saveAll(users)
        return resultUsers.mapNotNull(User::id)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: UUID, @RequestBody dto: UserDto): UserDto {
        val user: User = userRepository.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        }
        userMapper.updateWithNull(dto, user)
        val resultUser: User = userRepository.save(user)
        return userMapper.toDto(resultUser)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: UUID): UserDto? {
        val user: User? = userRepository.findById(id).orElse(null)
        if (user != null) {
            userRepository.delete(user)
        }
        return user?.let(userMapper::toDto)
    }

    @DeleteMapping
    fun deleteMany(@RequestParam ids: List<UUID>) {
        userRepository.deleteAllById(ids)
    }
}

