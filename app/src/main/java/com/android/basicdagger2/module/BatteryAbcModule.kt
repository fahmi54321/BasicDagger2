package com.android.basicdagger2.module

import com.android.basicdagger2.interfaces.Battery
import com.android.basicdagger2.BatteryAbc
import dagger.Binds
import dagger.Module

//todo 1 change to abstract class (lebih simpel, ) (finish)

@Module
abstract class BatteryAbcModule {

    @Binds
    abstract fun bindBaterryAbc(batteryAbc: BatteryAbc): Battery

}