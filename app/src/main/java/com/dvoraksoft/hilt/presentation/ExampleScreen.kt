package com.dvoraksoft.hilt.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.dvoraksoft.hilt.domain.Item

@Composable
fun ExampleScreen(
    modifier: Modifier = Modifier,
    exampleViewModel: ExampleViewModel = hiltViewModel(
        creationCallback = { factory: ExampleViewModel.Factory ->
            factory.create(Item(0))
        }
    )
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            onClick = {
                exampleViewModel.exampleMethod()
            }
        ) {
            Text(text = "Click Me!!!")
        }
        ExampleScreen2()
    }
}