package com.dvoraksoft.hilt.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dvoraksoft.hilt.domain.ExampleUseCase
import com.dvoraksoft.hilt.domain.Item
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel2 @Inject constructor(
    private val useCase: ExampleUseCase
) : ViewModel() {

    fun exampleMethod(item: Item) {
        Log.d("ExampleTest", "ExampleViewModel exampleMethod $item")
        useCase.invoke(item)
    }
}