package com.android.basicdagger2

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor() {

    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }

}