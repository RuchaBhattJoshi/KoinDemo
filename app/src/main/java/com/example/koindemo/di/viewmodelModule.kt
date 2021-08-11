package com.example.koindemo.di

import com.example.koindemo.viewmodels.MainViewModel
import com.example.koindemo.viewmodels.Test
import com.example.koindemo.viewmodels.TestImp
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewmodelModule = module {
    factory { TestImp() } bind Test::class
    viewModel { MainViewModel(get()) }
}