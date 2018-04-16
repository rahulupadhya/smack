package com.aum.sample.smack.Controller

import android.app.Application
import com.aum.sample.smack.Utilities.SharedPrefs

class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}