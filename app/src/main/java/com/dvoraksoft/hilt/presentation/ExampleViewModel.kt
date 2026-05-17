package com.dvoraksoft.hilt.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dvoraksoft.hilt.domain.ExampleUseCase
import com.dvoraksoft.hilt.domain.Item
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel(assistedFactory = ExampleViewModel.Factory::class)
class ExampleViewModel @AssistedInject constructor(
    private val useCase: ExampleUseCase,
    @Assisted("item") private val item: Item
) : ViewModel() {

    fun exampleMethod() {
        Log.d("ExampleTest", "ExampleViewModel exampleMethod $item")
        useCase.invoke(item)
    }

    @AssistedFactory
    interface Factory {

        fun create(
            @Assisted("item") item: Item
        ): ExampleViewModel
    }
}

class ExampleViewModelFactory @Inject constructor(
    private val useCase: ExampleUseCase
) {
    fun create(item: Item): ExampleViewModel {
        return ExampleViewModel(useCase, item)
    }
}