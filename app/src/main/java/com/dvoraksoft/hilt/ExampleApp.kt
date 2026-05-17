package com.dvoraksoft.hilt

import android.app.Application
import com.dvoraksoft.hilt.di.Component

class ExampleApp : Application() {

    val component = Component(this)
}