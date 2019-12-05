package com.example.daggerforandroid

import android.os.Bundle
import com.example.daggerforandroid.Models.Car
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : DaggerActivity() {
    @Inject
    lateinit var car1 : Car

    @Inject
    lateinit var car2 : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car1.engine.startEngine()
        car1.drive()

        car2.engine.startEngine()
        car2.drive()
    }
}
