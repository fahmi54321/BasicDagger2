package com.android.basicdagger2

import android.util.Log
import javax.inject.Inject

// todo 1 hapus inject constructor (next MemoryCardModule)
class MemoryCard {

    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }

}