package com.android.basicdagger2.component

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

    fun getSmartPhone(): SmartPhone

}