package com.example.dagger2injectiondemo

import android.util.Log
import dagger.Module
import dagger.Provides

// We create a MemoryCard Module to be able to use Dagger for dependency Injection
// We inserted a memory card parameter about memory size to use Dagger for a state
@Module
class MemoryCardModule(val memorySize:Int) {

    @Provides
    fun providesMemoryCard():MemoryCard{
        Log.i("MYTAG", "Size of the memory is $memorySize")
        return MemoryCard()
    }
}