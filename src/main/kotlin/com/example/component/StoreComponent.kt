package com.example.component

import com.example.Store
import com.example.module.EmployeeModule
import com.example.module.ManagerModule
import dagger.Component

@Component(modules = [ManagerModule::class, EmployeeModule::class]) //1
interface StoreComponent { //2
    fun store(): Store //3
}