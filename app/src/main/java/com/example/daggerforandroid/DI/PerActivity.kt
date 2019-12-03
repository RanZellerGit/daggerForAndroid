package com.example.daggerforandroid.DI

import java.lang.annotation.Documented
import javax.inject.Scope

@Scope
@Documented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity