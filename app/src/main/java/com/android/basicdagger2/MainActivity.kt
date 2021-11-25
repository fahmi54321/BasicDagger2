package com.android.basicdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.basicdagger2.component.DaggerSmartPhoneComponent

class MainActivity : AppCompatActivity() {

    private lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val smartPhone = SmartPhone(
//            Battery(),
//            SIMCard(ServiceProvider()),
//            MemoryCard()
//        )
//
//        smartPhone.makeACallWithRecording()

        DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()
    }
}