package com.android.basicdagger2

import android.util.Log
import javax.inject.Inject

//todo 3 (next membuat interface dengan anotasi @Component untuk generated dagger2)
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