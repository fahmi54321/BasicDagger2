package com.android.basicdagger2.component

import com.android.basicdagger2.MainActivity
import com.android.basicdagger2.SmartPhone
import com.android.basicdagger2.module.*
import dagger.Component

@Component(
    modules = [
        MemoryCardVGenModule::class,
        ServiceProviderModule::class,
        SIMCardIndosatModule::class,
        BatteryAbcModule::class
    ]
)
interface SmartPhoneComponent {

    //todo 1 inject smartphone component ke main activity (next main activity)
    fun inject(mainActivity : MainActivity)
}