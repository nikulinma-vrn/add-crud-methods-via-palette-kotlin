package com.example.smoke_giga_241.api.v4;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/rest/v4"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0017J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0017J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0017J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J\u001c\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0017J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0017J\u001c\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/smoke_giga_241/api/v4/UserResource4;", "", "userService", "Lcom/example/smoke_giga_241/service/UserService;", "(Lcom/example/smoke_giga_241/service/UserService;)V", "create", "Lcom/example/smoke_giga_241/dto/UserDto;", "dto", "createMany", "", "dtos", "delete", "id", "Ljava/util/UUID;", "deleteMany", "", "ids", "getList", "Lorg/springframework/data/domain/Page;", "filter", "Lcom/example/smoke_giga_241/api/v4/UserFilter;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getMany", "getOne", "patch", "patchNode", "Lcom/fasterxml/jackson/databind/JsonNode;", "patchMany", "update", "smoke-giga-241"})
public class UserResource4 {
    @org.jetbrains.annotations.NotNull()
    private final com.example.smoke_giga_241.service.UserService userService = null;
    
    public UserResource4(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.service.UserService userService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.example.smoke_giga_241.dto.UserDto> getList(@org.springframework.web.bind.annotation.ModelAttribute()
    @org.jetbrains.annotations.Nullable()
    com.example.smoke_giga_241.api.v4.UserFilter filter, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto getOne(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/by-ids"})
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.smoke_giga_241.dto.UserDto> getMany(@org.springframework.web.bind.annotation.RequestParam()
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping()
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto create(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto dto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/bulk"})
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.smoke_giga_241.dto.UserDto> createMany(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.smoke_giga_241.dto.UserDto> dtos) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{id}"})
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto patch(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.JsonNode patchNode) throws java.io.IOException {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.util.UUID> patchMany(@org.springframework.web.bind.annotation.RequestParam()
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids, @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.JsonNode patchNode) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.dto.UserDto update(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.dto.UserDto dto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    @org.jetbrains.annotations.Nullable()
    public com.example.smoke_giga_241.dto.UserDto delete(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping()
    public void deleteMany(@org.springframework.web.bind.annotation.RequestParam()
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids) {
    }
}