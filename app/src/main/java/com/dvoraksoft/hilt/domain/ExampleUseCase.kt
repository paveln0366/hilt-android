package com.dvoraksoft.hilt.domain

import android.util.Log
import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {

    operator fun invoke(item: Item) {
        Log.d("ExampleTest", "ExampleUseCase invoke $item")
        repository.exampleMethod(item)
    }
}