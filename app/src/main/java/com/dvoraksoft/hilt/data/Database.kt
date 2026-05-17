package com.dvoraksoft.hilt.data

import android.content.Context
import android.util.Log
import com.dvoraksoft.hilt.domain.Item

class Database private constructor(
    private val context: Context
) {

    init {
        Log.d("ExampleTest", "Database created")
    }

    fun exampleMethod(item: Item) {
        Log.d("ExampleTest", "Database exampleMethod $item $context")
    }

    companion object {

        private val LOCK = Any()
        private var instance: Database? = null

        fun getInstance(context: Context): Database {
            instance?.let { return it }

            synchronized(LOCK) {
                instance?.let { return it }

                return Database(context).also {
                    instance = it
                }
            }
        }
    }
}