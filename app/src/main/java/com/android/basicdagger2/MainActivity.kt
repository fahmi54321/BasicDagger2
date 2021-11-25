package com.android.basicdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //todo 1 (next memberikan inject constructor pada masing2 class)
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

        //with dagger
        //todo 4 (finish)
        DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()
    }
}