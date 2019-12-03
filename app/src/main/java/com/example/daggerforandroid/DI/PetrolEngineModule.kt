package com.example.daggerforandroid.DI

import com.example.daggerforandroid.Models.Engine
import com.example.daggerforandroid.Models.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindPetrolEngine(engine : PetrolEngine) : Engine
}