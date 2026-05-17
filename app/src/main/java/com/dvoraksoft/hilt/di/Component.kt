package com.dvoraksoft.hilt.di

import com.dvoraksoft.hilt.data.Database
import com.dvoraksoft.hilt.data.ExampleRepositoryImpl
import com.dvoraksoft.hilt.domain.ExampleUseCase
import com.dvoraksoft.hilt.presentation.ExampleViewModel
import com.dvoraksoft.hilt.presentation.MainActivity

class Component {

    val database = Database()

    val repository = ExampleRepositoryImpl(database)

    val exampleUseCase = ExampleUseCase(repository)

    val exampleViewModel = ExampleViewModel(exampleUseCase)

    fun inject(mainActivity: MainActivity) {
        mainActivity.exampleViewModel = exampleViewModel
        mainActivity.repository = repository
    }
}