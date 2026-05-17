package com.dvoraksoft.hilt.data

import android.util.Log
import com.dvoraksoft.hilt.domain.ExampleRepository
import com.dvoraksoft.hilt.domain.Item

class ExampleRepositoryImpl(
    private val database: Database
) : ExampleRepository {

    override fun exampleMethod(item: Item) {
        Log.d("ExampleTest", "ExampleRepositoryImpl exampleMethod $item")
        database.exampleMethod(item)
    }
}