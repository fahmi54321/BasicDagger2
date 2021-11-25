package com.android.basicdagger2

import android.util.Log
import javax.inject.Inject

class SIMCard(private val serviceProvider: ServiceProvider) {

    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}