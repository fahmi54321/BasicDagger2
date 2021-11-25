package com.android.basicdagger2.component

import com.android.basicdagger2.SmartPhone
import com.android.basicdagger2.module.*
import dagger.Component

@Component(
    modules = [
        ServiceProviderModule::class,
        SIMCardModule::class,
        BatteryAbcModule::class,
        MemoryCardVGenModule::class
    ]
)
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone

}