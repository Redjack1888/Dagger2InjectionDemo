package com.example.dagger2injectiondemo

import android.util.Log
import javax.inject.Inject

// We consider MemoryCard from an outer source using Retrofit or other libraries
class MemoryCard {
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailability(){
        Log.i("MYTAG","Memory space available")
    }
}