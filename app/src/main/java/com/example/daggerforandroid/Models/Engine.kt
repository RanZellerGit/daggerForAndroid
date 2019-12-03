package com.example.daggerforandroid.Models

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

interface Engine{
    fun startEngine()
}

class PetrolEngine @Inject constructor() : Engine {
    override fun startEngine() {
        Log.d("Car", "PetrolEngine started")
    }

}
