package com.android.basicdagger2

import android.util.Log
import com.android.basicdagger2.interfaces.MemoryCard
import javax.inject.Inject

class MemoryCardVGen @Inject constructor():MemoryCard {
    override fun getSpaceAvailablity() {
        Log.i("MYTAG","Memory card is V gen")
    }
}