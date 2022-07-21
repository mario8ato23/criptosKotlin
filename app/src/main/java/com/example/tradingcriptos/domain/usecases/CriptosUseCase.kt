package com.example.tradingcriptos.domain.usecases

import com.example.tradingcriptos.data.repositorie.CriptosRepository
import javax.inject.Inject

class CriptosUseCase @Inject constructor(private val repository: CriptosRepository) {

    fun getCriptos() = repository.getCriptos()
}
