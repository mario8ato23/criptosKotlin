package com.example.tradingcriptos.di

import com.example.tradingcriptos.data.CriptosRemoteDataSource
import com.example.tradingcriptos.data.CriptosRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
@Suppress("unused")
abstract class DataSourceModule {

    @Binds
    abstract fun bindCriptosRemoteDataSource(
        dataSource: CriptosRemoteDataSourceImpl
    ): CriptosRemoteDataSource
}
