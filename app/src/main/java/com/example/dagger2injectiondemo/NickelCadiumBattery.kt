package com.example.dagger2injectiondemo

import android.util.Log
import javax.inject.Inject

class NickelCadiumBattery @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG", "Power from NickelCadmiumBattery")
    }
}