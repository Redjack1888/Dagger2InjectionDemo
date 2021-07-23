package com.example.dagger2injectiondemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun bindsNCBattery(nickelCadiumBattery: NickelCadiumBattery) : Battery
}