package com.example.smoke_giga_241.api.v1;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/rest/v1"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u0017J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0017J\u0014\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\u00020\u00112\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0017J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0017J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0017J\u0012\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u001c\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0017J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0017J\u001c\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\bH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/smoke_giga_241/api/v1/UserResource;", "", "userRepository", "Lcom/example/smoke_giga_241/repository/UserRepository;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/example/smoke_giga_241/repository/UserRepository;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "create", "Lcom/example/smoke_giga_241/entity/User;", "user", "createMany", "", "users", "delete", "id", "Ljava/util/UUID;", "deleteMany", "", "ids", "getList", "getMany", "getOne", "patch", "patchNode", "Lcom/fasterxml/jackson/databind/JsonNode;", "patchMany", "update", "smoke-giga-241"})
public class UserResource {
    @org.jetbrains.annotations.NotNull()
    private final com.example.smoke_giga_241.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public UserResource(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.smoke_giga_241.entity.User> getList() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.entity.User getOne(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/by-ids"})
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.smoke_giga_241.entity.User> getMany(@org.springframework.web.bind.annotation.RequestParam()
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping()
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.entity.User create(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.entity.User user) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/bulk"})
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.smoke_giga_241.entity.User> createMany(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.smoke_giga_241.entity.User> users) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{id}"})
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.entity.User patch(@org.springframework.web.bind.annotation.PathVariable()
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
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    @org.jetbrains.annotations.Nullable()
    public com.example.smoke_giga_241.entity.User delete(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping()
    public void deleteMany(@org.springframework.web.bind.annotation.RequestParam()
    @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> ids) {
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.example.smoke_giga_241.entity.User update(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.entity.User user) {
        return null;
    }
}