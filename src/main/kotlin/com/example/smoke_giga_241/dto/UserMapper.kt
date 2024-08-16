package com.example.smoke_giga_241.dto

import com.example.smoke_giga_241.entity.User
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
abstract class UserMapper {

    abstract fun toEntity(userDto: UserDto): User

    abstract fun toDto(user: User): UserDto

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract fun partialUpdate(userDto: UserDto, @MappingTarget user: User): User
    abstract fun updateWithNull(userDto: UserDto, @MappingTarget user: User): User
}