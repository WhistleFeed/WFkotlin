package com.example.wfkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.whistlefeed.WhistleFeed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val whistlefeed: WhistleFeed = findViewById(R.id.webadds)
        whistlefeed.setadds("116378385233oOAaL_3286", "1")
    }
}