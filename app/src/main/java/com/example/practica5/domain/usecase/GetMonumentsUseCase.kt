package com.example.practica5.domain.usecase

import com.example.practica5.domain.model.bo.MonumentBO
import com.example.practica5.domain.repository.MonumentRepository

class GetMonumentsUseCase(private val monumentRepository: MonumentRepository) {
    suspend operator fun invoke(): List<MonumentBO>? = monumentRepository.getMonuments()
}