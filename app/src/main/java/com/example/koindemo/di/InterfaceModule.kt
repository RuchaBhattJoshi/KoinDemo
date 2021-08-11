package com.example.koindemo.di

import com.example.koindemo.interfaces.*
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {
//    factory<Demo> {
//    DemoImpl()
//    //DemoImpl() as Demo
//    }

    //factory { DemoImpl() } bind Demo::class
    factory { DemoImpl() } binds arrayOf(Demo1::class, Demo2::class)
    factory { Main(get(),get()) }
}