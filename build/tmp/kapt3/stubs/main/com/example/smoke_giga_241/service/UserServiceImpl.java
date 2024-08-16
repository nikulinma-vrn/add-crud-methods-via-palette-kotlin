package com.example.smoke_giga_241.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0016J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/smoke_giga_241/service/UserServiceImpl;", "Lcom/example/smoke_giga_241/service/UserService;", "userRepository", "Lcom/example/smoke_giga_241/repository/UserRepository;", "userMapper", "Lcom/example/smoke_giga_241/dto/UserMapper;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/example/smoke_giga_241/repository/UserRepository;Lcom/example/smoke_giga_241/dto/UserMapper;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "bulkUserCreate", "", "create", "Lcom/example/smoke_giga_241/dto/UserDto;", "dto", "createMany", "", "dtos", "delete", "id", "Ljava/util/UUID;", "deleteMany", "ids", "getList", "Lorg/springframework/data/domain/Page;", "filter", "Lcom/example/smoke_giga_241/api/v4/UserFilter;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getMany", "getOne", "patch", "patchNode", "Lcom/fasterxml/jackson/databind/JsonNode;", "patchMany", "update", "smoke-giga-241"})
public class UserServiceImpl implements com.example.smoke_giga_241.service.UserService {
    @org.jetbrains.annotations.NotNull()
    private final com.example.smoke_giga_241.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.smoke_giga_241.dto.UserMapper userMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public UserServiceImpl(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserMapper userMapper, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @org.springframework.context.event.EventListener(value = {org.springframework.boot.context.event.ApplicationReadyEvent.class})
    public void bulkUserCreate() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.example.smoke_giga_241.dto.UserDto> getList(@org.jetbrains.annotations.Nullable()
    com.example.smoke_giga_241.api.v4.UserFilter filter, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto getOne(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.smoke_giga_241.dto.UserDto> getMany(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto create(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto dto) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.smoke_giga_241.dto.UserDto> createMany(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.smoke_giga_241.dto.UserDto> dtos) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto patch(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.JsonNode patchNode) throws java.io.IOException {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.util.UUID> patchMany(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.JsonNode patchNode) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto update(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto dto) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.example.smoke_giga_241.dto.UserDto delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteMany(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids) {
    }
}