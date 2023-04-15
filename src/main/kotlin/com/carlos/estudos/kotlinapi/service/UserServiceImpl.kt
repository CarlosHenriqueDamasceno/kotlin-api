package com.carlos.estudos.kotlinapi.service

import com.carlos.estudos.kotlinapi.dto.UserInputDto
import com.carlos.estudos.kotlinapi.dto.UserOutputDto
import com.carlos.estudos.kotlinapi.entity.User
import com.carlos.estudos.kotlinapi.repository.UserRepository
import com.carlos.estudos.kotlinapi.service.contracts.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {
    override fun find(id: Long): UserOutputDto {
        return with(findUserOrThrowException(id)) {
            UserOutputDto.fromEntity(this)
        }
    }

    override fun getAll(): List<UserOutputDto> {
        return userRepository.findAll().map { UserOutputDto.fromEntity(it) }
    }

    override fun create(data: UserInputDto): UserOutputDto {
        return userRepository.save(data.run { User(name) }).run { UserOutputDto.fromEntity(this) }
    }

    override fun update(id: Long, data: UserInputDto): UserOutputDto {
        val user = with(findUserOrThrowException(id)) {
            User(id, data.name, balance, categories)
        }
        return userRepository.save(user).run { UserOutputDto.fromEntity(this) }
    }

    override fun delete(id: Long) {
        userRepository.delete(findUserOrThrowException(id))
    }

    private fun findUserOrThrowException(id: Long): User {
        return userRepository.findById(id).orElseThrow {
            RuntimeException("Usuário não encontrado com o id: $id")
        }
    }
}