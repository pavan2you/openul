package io.soul

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.soul.java.JavaLanguage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Soul.set(JavaLanguage())
        val obj =  SampleObject()
        val array = Soul.newArray<Int>()
        val list = Soul.newList<SampleObject>()
    }

    class SampleObject : SoulObject()
}