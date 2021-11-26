package com.android.basicdagger2

import android.util.Log
import com.android.basicdagger2.interfaces.Battery
import com.android.basicdagger2.interfaces.MemoryCard
import com.android.basicdagger2.interfaces.SIMCard
import javax.inject.Inject

class SmartPhone @Inject constructor(
    val battery: Battery,
    val simCard: SIMCard,
    val memoryCard: MemoryCard
) {
    init {
        Log.i("MYTAG","SmartPhone Constructed")
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
    }

    fun makeACallWithRecording(){
        Log.i("MYTAG","Calling...")
    }
}