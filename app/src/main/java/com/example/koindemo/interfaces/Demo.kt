package com.example.koindemo.interfaces

import android.util.Log

interface Demo1 {
    fun getDemo1()
}


interface Demo2 {
    fun getDemo2()
}

class DemoImpl: Demo1,Demo2{
    override fun getDemo1() {
        Log.d("main", "this is demo 1")
    }

    override fun getDemo2() {
        Log.d("main", "this is demo 2")
    }

}

class Main(private val demo1:Demo1,private val demo2:Demo2){
    fun getDemo(){
        demo1.getDemo1()
        demo2.getDemo2()
    }
}