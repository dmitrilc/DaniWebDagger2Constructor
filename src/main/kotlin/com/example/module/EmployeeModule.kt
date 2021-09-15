package com.example.module

import com.example.Employee
import dagger.Module
import dagger.Provides

@Module //1
abstract class EmployeeModule {

    companion object { //2
        @Provides //3
        fun provideEmployee() = Employee("Anna") //4
    }

}