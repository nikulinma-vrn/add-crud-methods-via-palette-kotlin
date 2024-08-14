package com.example.smoke_giga_241

import com.example.smoke_giga_241.utils.UserGenerator
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmokeGiga241Application

fun main(args: Array<String>) {
	runApplication<SmokeGiga241Application>(*args)

	UserGenerator.bulkUserAdd(50)
}
