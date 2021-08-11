package com.example.koindemo.container

import com.example.koindemo.Car
import com.example.koindemo.Engine
import com.example.koindemo.interfaces.Main
import com.example.koindemo.viewmodels.MainViewModel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@KoinApiExtension
class Component : KoinComponent {
    val car: Car by inject() //late init   //= get() eagerly
    val main: Main by inject()
    val viewmodel: MainViewModel by inject()

}