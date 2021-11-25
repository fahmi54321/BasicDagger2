package com.android.basicdagger2.module

import com.android.basicdagger2.MemoryCardVGen
import com.android.basicdagger2.interfaces.MemoryCard
import dagger.Module
import dagger.Provides

@Module
class MemoryCardVGenModule {

    @Provides
    fun providesMemoryCardVGen(memoryCardVGen: MemoryCardVGen):MemoryCard{
        return memoryCardVGen
    }

}