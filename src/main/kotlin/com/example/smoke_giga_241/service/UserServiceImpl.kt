package com.example.smoke_giga_241.service;

import com.example.smoke_giga_241.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {
}