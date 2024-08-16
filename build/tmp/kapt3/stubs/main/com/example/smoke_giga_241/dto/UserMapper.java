package com.example.smoke_giga_241.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/smoke_giga_241/dto/UserMapper;", "", "()V", "partialUpdate", "Lcom/example/smoke_giga_241/entity/User;", "userDto", "Lcom/example/smoke_giga_241/dto/UserDto;", "user", "toDto", "toEntity", "updateWithNull", "smoke-giga-241"})
@org.mapstruct.Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class UserMapper {
    
    public UserMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.entity.User toEntity(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto userDto);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.dto.UserDto toDto(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.entity.User user);
    
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.entity.User partialUpdate(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto userDto, @org.mapstruct.MappingTarget()
    @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.entity.User user);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.entity.User updateWithNull(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto userDto, @org.mapstruct.MappingTarget()
    @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.entity.User user);
}