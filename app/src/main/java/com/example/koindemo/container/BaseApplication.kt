package com.example.koindemo.container

import android.app.Application
import com.example.koindemo.di.demoModule
import com.example.koindemo.di.interfaceModule
import com.example.koindemo.di.viewmodelModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            modules(demoModule, interfaceModule, viewmodelModule)
        }
    }


}