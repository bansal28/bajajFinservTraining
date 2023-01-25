package com.example.configchangeskotlin

import android.app.Application
import android.content.res.Configuration
import android.util.Log

class MyApplication : Application(){


        private val TAG = "MyApplication"



//    fun getInstance(): MyApplication? {
//        return singleton
//    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG , "On Create()")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(TAG, "onLowMemory")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged")
    }

}
