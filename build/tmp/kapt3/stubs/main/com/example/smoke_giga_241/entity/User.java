package com.example.smoke_giga_241.entity;

@jakarta.persistence.Entity()
@jakarta.persistence.Table(name = "user_")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bR \u0010\f\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R \u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R \u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/example/smoke_giga_241/entity/User;", "", "()V", "_id", "Ljava/util/UUID;", "_name", "", "_username", "_email", "_gender", "_creditCard", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "creditCard", "getCreditCard", "()Ljava/lang/String;", "setCreditCard", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "gender", "getGender", "setGender", "id", "getId", "()Ljava/util/UUID;", "setId", "(Ljava/util/UUID;)V", "name", "getName", "setName", "username", "getUsername", "setUsername", "smoke-giga-241"})
public class User {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    @jakarta.persistence.Column(name = "id", nullable = false)
    @org.jetbrains.annotations.Nullable()
    private java.util.UUID id;
    @jakarta.persistence.Column(name = "name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @jakarta.persistence.Column(name = "username")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @jakarta.persistence.Column(name = "email")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @jakarta.persistence.Column(name = "gender")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gender;
    @jakarta.persistence.Column(name = "credit_card")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String creditCard;
    
    @org.jetbrains.annotations.Nullable()
    public java.util.UUID getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getUsername() {
        return null;
    }
    
    public void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getGender() {
        return null;
    }
    
    public void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getCreditCard() {
        return null;
    }
    
    public void setCreditCard(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public User() {
        super();
    }
    
    public User(@org.jetbrains.annotations.NotNull()
    java.util.UUID _id, @org.jetbrains.annotations.NotNull()
    java.lang.String _name, @org.jetbrains.annotations.NotNull()
    java.lang.String _username, @org.jetbrains.annotations.NotNull()
    java.lang.String _email, @org.jetbrains.annotations.NotNull()
    java.lang.String _gender, @org.jetbrains.annotations.NotNull()
    java.lang.String _creditCard) {
        super();
    }
}