package com.example.smoke_giga_241.api.v2

import com.example.smoke_giga_241.entity.User
import org.springframework.data.jpa.domain.Specification

data class UserFilter(
    val nameContains: String? = null,
    val usernameContains: String? = null,
    val emailContains: String? = null,
    val genderLike: String? = null,
    val creditCardLike: String? = null
) {
    fun toSpecification() =
        Specification.where(nameContainsSpec())
            .and(usernameContainsSpec())
            .and(emailContainsSpec())
            .and(genderLikeSpec())
            .and(creditCardLikeSpec())

    private fun nameContainsSpec() = Specification<User> { root, _, cb ->
        nameContains?.takeIf(String::isNotBlank)?.let {
            cb.like(cb.lower(root.get("name")), "%${it.lowercase()}%")
        }
    }

    private fun usernameContainsSpec() = Specification<User> { root, _, cb ->
        usernameContains?.takeIf(String::isNotBlank)?.let {
            cb.like(cb.lower(root.get("username")), "%${it.lowercase()}%")
        }
    }

    private fun emailContainsSpec() = Specification<User> { root, _, cb ->
        emailContains?.takeIf(String::isNotBlank)?.let {
            cb.like(cb.lower(root.get("email")), "%${it.lowercase()}%")
        }
    }

    private fun genderLikeSpec() = Specification<User> { root, _, cb ->
        genderLike?.takeIf(String::isNotBlank)?.let {
            cb.like(cb.lower(root.get("gender")), it.lowercase())
        }
    }

    private fun creditCardLikeSpec() = Specification<User> { root, _, cb ->
        creditCardLike?.takeIf(String::isNotBlank)?.let {
            cb.like(cb.lower(root.get("creditCard")), it.lowercase())
        }
    }
}