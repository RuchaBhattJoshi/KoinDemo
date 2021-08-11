package com.example.koindemo.di

import com.example.koindemo.Car
import com.example.koindemo.Engine
import com.example.koindemo.Wheel
import org.koin.dsl.module

val demoModule = module{

    factory { Wheel() }
    factory { Engine() }

    factory {
        Car(get(),get())
    }

    //single { Car() }  for singlton
}