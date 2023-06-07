package com.rimapps.reader

import android.app.Application
import android.content.Context

class App: Application() {

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: Application

        fun applicationContext() : Context {
            return instance.applicationContext
        }
    }
}