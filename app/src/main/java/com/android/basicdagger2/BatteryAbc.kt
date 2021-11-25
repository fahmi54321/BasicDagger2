package com.android.basicdagger2

import android.util.Log
import com.android.basicdagger2.interfaces.Battery
import javax.inject.Inject

//todo 2 dengan class baru dengan implement battery serta inject class BatteryAbc
// ketika di rebuild maka akan error, oleh sebab itu ditambahkan module battery abc

class BatteryAbc @Inject constructor() : Battery {
    override fun getPower() {
        Log.i("MYTAG", "Power from Battery abc")
    }
}