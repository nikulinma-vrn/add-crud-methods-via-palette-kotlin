package com.example.smoke_giga_241.api.v2;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/rest/v2"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/smoke_giga_241/api/v2/UserResource2;", "", "userRepository", "Lcom/example/smoke_giga_241/repository/UserRepository;", "(Lcom/example/smoke_giga_241/repository/UserRepository;)V", "getList", "Lorg/springframework/data/domain/Page;", "Lcom/example/smoke_giga_241/entity/User;", "filter", "Lcom/example/smoke_giga_241/api/v2/UserFilter1;", "pageable", "Lorg/springframework/data/domain/Pageable;", "smoke-giga-241"})
public class UserResource2 {
    @org.jetbrains.annotations.NotNull()
    private final com.example.smoke_giga_241.repository.UserRepository userRepository = null;
    
    public UserResource2(@org.jetbrains.annotations.NotNull()
    com.example.smoke_giga_241.repository.UserRepository userRepository) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.example.smoke_giga_241.entity.User> getList(@org.springframework.web.bind.annotation.ModelAttribute()
    @org.jetbrains.annotations.Nullable()
    com.example.smoke_giga_241.api.v2.UserFilter1 filter, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
}