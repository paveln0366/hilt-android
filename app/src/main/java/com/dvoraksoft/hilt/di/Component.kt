package com.dvoraksoft.hilt.di

import android.content.Context
import com.dvoraksoft.hilt.data.Database
import com.dvoraksoft.hilt.data.ExampleRepositoryImpl
import com.dvoraksoft.hilt.domain.ExampleUseCase
import com.dvoraksoft.hilt.domain.Item
import com.dvoraksoft.hilt.presentation.ExampleViewModel
import com.dvoraksoft.hilt.presentation.MainActivity

class Component(
    context: Context
) {

    val database = Database.getInstance(context)

    val repository = ExampleRepositoryImpl(database)

    val exampleUseCase = ExampleUseCase(repository)

    val exampleViewModel2 = ExampleViewModel(exampleUseCase, Item(0)) // Singleton

    val exampleViewModel
        get() = ExampleViewModel(exampleUseCase, Item(0)) // Not singleton

    fun inject(mainActivity: MainActivity) {
//        mainActivity.exampleViewModel = exampleViewModel
    }
}