package com.example.daggerforandroid

import android.app.Application
import com.example.daggerforandroid.DI.ApplicationComponent
import com.example.daggerforandroid.DI.DaggerApplicationComponent

class Dagger2Tutorial : Application() {

    lateinit var appComponent : ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.create()
    }


}