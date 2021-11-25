package com.android.basicdagger2

import com.android.basicdagger2.module.*
import dagger.Component

@Component(
    modules = [
        MemoryCardModule::class,
        ServiceProviderModule::class,
        SIMCardModule::class,
        BatteryAbcModule::class
    ]
)
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone

}