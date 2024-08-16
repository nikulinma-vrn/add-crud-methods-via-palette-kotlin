package com.example.smoke_giga_241.service;

import com.example.smoke_giga_241.api.v4.UserFilter
import com.example.smoke_giga_241.dto.UserDto
import com.example.smoke_giga_241.dto.UserMapper
import com.example.smoke_giga_241.entity.User
import com.example.smoke_giga_241.repository.UserRepository
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import jakarta.annotation.PostConstruct
import net.andreinc.mockneat.MockNeat
import net.andreinc.mockneat.types.enums.NameType
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.data.jpa.domain.Specification
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.io.IOException
import java.util.*

@Service
class UserServiceImpl(private val userRepository: UserRepository, private val userMapper: UserMapper,
                      private val objectMapper: ObjectMapper
) : UserService {
    
    @EventListener(ApplicationReadyEvent::class)
    fun bulkUserCreate() {
        val mockNeat = MockNeat.threadLocal()

        repeat(100) {
            val user = User(
                UUID.randomUUID(),
                mockNeat.names().type(NameType.FIRST_NAME).get(),
                mockNeat.users().get(),
                mockNeat.emails().get(),
                mockNeat.genders().get(),
                mockNeat.creditCards().get()
            )
            userRepository.save(user)
        }
    }
    override fun getList(filter: UserFilter?): List<UserDto> {
        val spec: Specification<User>? = filter?.toSpecification()
        val users: List<User> = userRepository.findAll(spec)
        return users.map(userMapper::toDto)
    }
    override fun getOne(id: UUID): UserDto {
        val userOptional: Optional<User> = userRepository.findById(id)
        return userMapper.toDto(userOptional.orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        })
    }
    override fun getMany(ids: List<UUID>): List<UserDto> {
        val users: List<User> = userRepository.findAllById(ids)
        return users.map(userMapper::toDto)
    }
    override fun create(dto: UserDto): UserDto {
        val user: User = userMapper.toEntity(dto)
        val resultUser: User = userRepository.save(user)
        return userMapper.toDto(resultUser)
    }
    override fun createMany(dtos: List<UserDto>): List<UserDto> {
        val users: Collection<User> = dtos.map(userMapper::toEntity)
        val resultUsers: List<User> = userRepository.saveAll(users)
        return resultUsers.map(userMapper::toDto)
    }

    @Throws(IOException::class)
    override fun patch(id: UUID, patchNode: JsonNode): UserDto {
        val user: User = userRepository.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        }
        val userDto = userMapper.toDto(user)
        objectMapper.readerForUpdating(userDto).readValue<UserDto>(patchNode)
        userMapper.updateWithNull(userDto, user)
        val resultUser: User = userRepository.save(user)
        return userMapper.toDto(resultUser)
    }

    @Throws(IOException::class)
    override fun patchMany(ids: List<UUID>, patchNode: JsonNode): List<UUID> {
        val users: Collection<User> = userRepository.findAllById(ids)
        for (user in users) {
            val userDto = userMapper.toDto(user)
            objectMapper.readerForUpdating(userDto).readValue<UserDto>(patchNode)
            userMapper.updateWithNull(userDto, user)
        }
        val resultUsers: List<User> = userRepository.saveAll(users)
        return resultUsers.mapNotNull(User::id)
    }
    override fun update(id: UUID, dto: UserDto): UserDto {
        val user: User = userRepository.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `$id` not found")
        }
        userMapper.updateWithNull(dto, user)
        val resultUser: User = userRepository.save(user)
        return userMapper.toDto(resultUser)
    }
    override fun delete(id: UUID): UserDto? {
        val user: User? = userRepository.findById(id).orElse(null)
        if (user != null) {
            userRepository.delete(user)
        }
        return user?.let(userMapper::toDto)
    }
    override fun deleteMany(ids: List<UUID>) {
        userRepository.deleteAllById(ids)
    }
}