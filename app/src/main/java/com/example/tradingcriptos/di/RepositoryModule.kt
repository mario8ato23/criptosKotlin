package com.example.tradingcriptos.di

import com.example.tradingcriptos.data.repositorie.CriptosRepository
import com.example.tradingcriptos.data.repositorie.CriptosRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
@Suppress("unused")
abstract class RepositoryModule {

    @Binds
    abstract fun bindCriptosRepository(
        repository: CriptosRepositoryImpl
    ): CriptosRepository
}
