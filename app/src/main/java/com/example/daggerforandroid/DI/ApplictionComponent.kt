package com.example.daggerforandroid.DI

import dagger.Component

@ApplicationScope
@Component
interface ApplicationComponent{

    fun getActivityComponent() : ActivityComponent
}