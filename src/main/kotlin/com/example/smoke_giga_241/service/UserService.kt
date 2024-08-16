package com.example.smoke_giga_241.service

import com.example.smoke_giga_241.api.v4.UserFilter
import com.example.smoke_giga_241.dto.UserDto
import com.fasterxml.jackson.databind.JsonNode
import java.io.IOException
import java.util.*

interface UserService {
    fun getList(filter: UserFilter?): List<UserDto>
    fun getOne(id: UUID): UserDto
    fun getMany(ids: List<UUID>): List<UserDto>
    fun create(dto: UserDto): UserDto
    fun createMany(dtos: List<UserDto>): List<UserDto>

    @Throws(IOException::class)
    fun patch( id: UUID,  patchNode: JsonNode): UserDto

    @Throws(IOException::class)
    fun patchMany(ids: List<UUID>, patchNode: JsonNode): List<UUID>
    fun update(id: UUID, dto: UserDto): UserDto
    fun delete(id: UUID): UserDto?
    fun deleteMany(ids: List<UUID>)
}