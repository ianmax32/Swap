package com.example.swap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(applicationContext, mainScreen::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000)
    }
}
