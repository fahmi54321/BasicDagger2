package com.android.basicdagger2

import android.util.Log
import javax.inject.Inject

class ServiceProvider{

    init {
        Log.i("MYTAG","Service Provider Constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connected")
    }

}