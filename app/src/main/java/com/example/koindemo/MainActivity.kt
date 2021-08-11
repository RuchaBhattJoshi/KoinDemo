package com.example.koindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koindemo.container.Component
import org.koin.core.component.KoinApiExtension

@KoinApiExtension
class MainActivity : AppCompatActivity() {

    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.car.getCar()
        component.main.getDemo()
        component.viewmodel.getTest()
    }





}