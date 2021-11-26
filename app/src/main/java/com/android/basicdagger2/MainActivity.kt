package com.android.basicdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.basicdagger2.component.DaggerSmartPhoneComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //todo 2
    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //todo 3 (finish)
        DaggerSmartPhoneComponent.create()
            .inject(this)
        smartPhone.makeACallWithRecording()
    }
}