package com.example.daggerforandroid.DI

import com.example.daggerforandroid.MainActivity
import com.example.daggerforandroidl.DI.WheelsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [WheelsModule::class, PetrolEngineModule::class])
    abstract fun contributedMainActivity() : MainActivity
}