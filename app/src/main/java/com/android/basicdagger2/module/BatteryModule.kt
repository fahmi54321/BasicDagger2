package com.android.basicdagger2.module

import com.android.basicdagger2.Battery
import dagger.Module
import dagger.Provides

@Module
class BatteryModule {

    @Provides
    fun providesBattery(): Battery {
        return Battery()
    }

}