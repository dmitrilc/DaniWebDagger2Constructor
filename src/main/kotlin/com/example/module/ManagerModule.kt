package com.example.module

import com.example.Manager
import com.example.ManagerImpl
import dagger.Binds
import dagger.Module

@Module //1
interface ManagerModule { //2

    @Binds //3
    fun bindManager(managerImpl: ManagerImpl): Manager //4

}