package com.android.basicdagger2

import android.util.Log
import com.android.basicdagger2.interfaces.SIMCard
import javax.inject.Inject

class SIMCardIndosat @Inject constructor(var serviceProvider: ServiceProvider):SIMCard {

    override fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}