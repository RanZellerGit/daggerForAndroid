package com.example.daggerforandroid.DI

import com.example.daggerforandroid.Dagger2Tutorial
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilderModule::class])
interface ApplicationComponent : AndroidInjector<Dagger2Tutorial> {

}