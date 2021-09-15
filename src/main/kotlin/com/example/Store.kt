package com.example;

import javax.inject.Inject

data class Store
@Inject constructor
    (val manager: Manager,
     val employee: Employee)