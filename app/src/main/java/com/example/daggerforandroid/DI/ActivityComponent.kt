package com.example.daggerforandroid.DI

import com.example.daggerforandroid.MainActivity
import com.example.daggerforandroidl.DI.WheelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent{

    fun inject(mainActivity: MainActivity)
}