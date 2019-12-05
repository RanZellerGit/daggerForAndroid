package com.example.daggerforandroid

import com.example.daggerforandroid.DI.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class Dagger2Tutorial : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.create()
    }


}