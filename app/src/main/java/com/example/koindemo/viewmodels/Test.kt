package com.example.koindemo.viewmodels

import android.util.Log

interface Test{
    fun getTest()
}

class TestImp: Test{
    override fun getTest() {
        Log.d("main","viewmodel is testing...")

    }


}