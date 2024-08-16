package com.example.smoke_giga_241.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H&J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u001b"}, d2 = {"Lcom/example/smoke_giga_241/service/UserService;", "", "create", "Lcom/example/smoke_giga_241/dto/UserDto;", "dto", "createMany", "", "dtos", "delete", "id", "Ljava/util/UUID;", "deleteMany", "", "ids", "getList", "Lorg/springframework/data/domain/Page;", "filter", "Lcom/example/smoke_giga_241/api/v4/UserFilter;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getMany", "getOne", "patch", "patchNode", "Lcom/fasterxml/jackson/databind/JsonNode;", "patchMany", "update", "smoke-giga-241"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.data.domain.Page<com.example.smoke_giga_241.dto.UserDto> getList(@org.jetbrains.annotations.Nullable()
    com.example.smoke_giga_241.api.v4.UserFilter filter, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.dto.UserDto getOne(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.smoke_giga_241.dto.UserDto> getMany(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.dto.UserDto create(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto dto);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.smoke_giga_241.dto.UserDto> createMany(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.smoke_giga_241.dto.UserDto> dtos);
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.dto.UserDto patch(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.JsonNode patchNode) throws java.io.IOException;
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.util.UUID> patchMany(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.JsonNode patchNode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.smoke_giga_241.dto.UserDto update(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto dto);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.smoke_giga_241.dto.UserDto delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    public abstract void deleteMany(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids);
}