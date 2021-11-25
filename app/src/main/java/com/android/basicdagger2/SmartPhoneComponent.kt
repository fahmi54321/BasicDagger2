package com.android.basicdagger2

import dagger.Component

// todo 3 (finish next lakukan tambah module pada class lain)
@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone

}