package com.android.basicdagger2

import com.android.basicdagger2.module.BatteryModule
import com.android.basicdagger2.module.MemoryCardModule
import com.android.basicdagger2.module.SIMCardModule
import com.android.basicdagger2.module.ServiceProviderModule
import dagger.Component

// todo 3 (finish next lakukan tambah module pada class lain)
@Component(
    modules = [
        MemoryCardModule::class,
        BatteryModule::class,
        ServiceProviderModule::class,
        SIMCardModule::class
    ]
)
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone

}