package com.example.koindemo

import android.util.Log

class Car constructor(private val engine:Engine,private val wheel:Wheel) {
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main","car is running...")
    }
}

class Engine(){
    fun getEngine(){
        Log.d("main","engine is running...")

    }
}


class Wheel(){
    fun getWheel(){
        Log.d("main","wheel is running...")

    }
}