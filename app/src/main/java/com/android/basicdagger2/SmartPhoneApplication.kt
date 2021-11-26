package com.android.basicdagger2

import android.app.Application
import com.android.basicdagger2.component.DaggerSmartPhoneComponent
import com.android.basicdagger2.component.SmartPhoneComponent
import com.android.basicdagger2.module.MemoryCardVGenModule

class SmartPhoneApplication:Application() {

    //todo 1
    lateinit var smartPhoneComponent: SmartPhoneComponent


    override fun onCreate() {

        //todo 3 (next main activity)
        smartPhoneComponent = initDagger()

        super.onCreate()
    }

    //todo 2
    private fun initDagger():SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder()
            .memoryCardVGenModule(MemoryCardVGenModule(1000))
            .build()
}