package com.example.smoke_giga_241.service;

import com.example.smoke_giga_241.entity.User
import com.example.smoke_giga_241.repository.UserRepository
import jakarta.annotation.PostConstruct
import net.andreinc.mockneat.MockNeat
import net.andreinc.mockneat.types.enums.NameType
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {
    
    @EventListener(ApplicationReadyEvent::class)
    fun bulkUserCreate() {
        val mockNeat = MockNeat.threadLocal()

        repeat(100) {
            val user = User(
                UUID.randomUUID(),
                mockNeat.names().type(NameType.FIRST_NAME).get(),
                mockNeat.users().get(),
                mockNeat.emails().get(),
                mockNeat.genders().get(),
                mockNeat.creditCards().get()
            )
            userRepository.save(user)
        }
    }
}