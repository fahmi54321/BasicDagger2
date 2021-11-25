package com.android.basicdagger2.module

import com.android.basicdagger2.Battery
import com.android.basicdagger2.BatteryAbc
import dagger.Module
import dagger.Provides

//todo 3 (next tambahkan module ke component dan finish)
@Module
class BatteryAbcModule {

    @Provides
    fun providesBaterryAbc(batteryAbc: BatteryAbc): Battery {
        return batteryAbc
    }

}