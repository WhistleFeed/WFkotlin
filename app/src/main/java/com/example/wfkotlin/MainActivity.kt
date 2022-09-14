package com.example.wfkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whistle.Kenya

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Kenya()
    }
}