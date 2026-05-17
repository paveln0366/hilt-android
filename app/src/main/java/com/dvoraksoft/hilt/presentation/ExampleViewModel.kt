package com.dvoraksoft.hilt.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dvoraksoft.hilt.domain.ExampleUseCase
import com.dvoraksoft.hilt.domain.Item

class ExampleViewModel(
    private val useCase: ExampleUseCase
) : ViewModel() {

    fun exampleMethod(item: Item) {
        Log.d("ExampleTest", "ExampleViewModel exampleMethod $item")
        useCase.invoke(item)
    }
}