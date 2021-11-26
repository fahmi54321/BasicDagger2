package com.android.basicdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.basicdagger2.component.DaggerSmartPhoneComponent
import com.android.basicdagger2.module.MemoryCardVGenModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 4 (next android manifest)

        (application as SmartPhoneApplication)
            .smartPhoneComponent
            .inject(this)
    }
}