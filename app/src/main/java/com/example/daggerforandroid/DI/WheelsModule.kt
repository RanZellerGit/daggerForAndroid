package com.example.daggerforandroidl.DI

import com.example.daggerforandroid.Models.Rims
import com.example.daggerforandroid.Models.Tires
import com.example.daggerforandroid.Models.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims() : Rims =
        Rims()

    @Provides
    fun provideTires() : Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) =
        Wheels(rims, tires)
}