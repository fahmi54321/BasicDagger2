package com.android.basicdagger2

import android.util.Log

class Battery {

    init {
        Log.i("MYTAG","Battery Constructed")
    }

    fun getPower(){
        Log.i("MYTAG","Battery power is available")
    }
}