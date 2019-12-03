package com.example.daggerforandroid.Models

import android.util.Log
import com.example.daggerforandroid.DI.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    val driver: Driver,
    val engine : Engine,
    val wheels : Wheels
){

    val TAG = Car::class.java.simpleName
    fun drive(){
        Log.d(TAG,"$driver drives $this")
    }

}