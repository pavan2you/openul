package io.soul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.soul.java.SoulObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openUl = Soul.language()
        val obj = openUl.newObject()
        val array = openUl.newArray<Int>()
        val list = openUl.newList<SampleObject>()
    }

    class SampleObject : SoulObject<SampleObject>() {
    }
}