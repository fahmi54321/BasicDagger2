package com.android.basicdagger2.module

import com.android.basicdagger2.MemoryCard
import dagger.Module
import dagger.Provides

// todo 2 (next tambahkan module pada Component)
@Module
class MemoryCardModule {

    @Provides
    fun providesMemoyCard(): MemoryCard {
        return MemoryCard()
    }

}