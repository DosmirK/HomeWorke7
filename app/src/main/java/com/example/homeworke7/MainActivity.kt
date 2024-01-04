package com.example.homeworke7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container1, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.container2, SecondFragment()).commit()
    }
}