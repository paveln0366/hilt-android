package com.dvoraksoft.hilt.di

import android.content.Context
import com.dvoraksoft.hilt.data.Database
import com.dvoraksoft.hilt.data.ExampleRepositoryImpl
import com.dvoraksoft.hilt.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Singleton
    @Binds
    fun bindExampleRepository(
        impl: ExampleRepositoryImpl
    ): ExampleRepository

    companion object {

        @Singleton
        @Provides
        fun provideDatabase(
            @ApplicationContext context: Context
        ): Database {
            return Database.getInstance(context)
        }
    }
}