package com.android.basicdagger2.module

import android.util.Log
import com.android.basicdagger2.MemoryCardVGen
import com.android.basicdagger2.interfaces.MemoryCard
import dagger.Binds
import dagger.Module
import dagger.Provides


//todo 1 change to class and add parameter
@Module
class MemoryCardVGenModule(val memorySize:Int) {

    @Provides
    fun providesMemoryCardVGen(memoryCardVGen: MemoryCardVGen):MemoryCard{
        //todo 2 change to class and add parameter
        // (rebuild untuk generated dan next to main activity)
        Log.i("MYTAG","Size the memory is $memorySize")

        return memoryCardVGen
    }

}