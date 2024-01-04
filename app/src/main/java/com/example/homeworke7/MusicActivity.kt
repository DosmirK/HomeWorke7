package com.example.homeworke7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homeworke7.databinding.ActivityMusicBinding

class MusicActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val music: String = intent.getStringExtra("music").toString()

        binding.tvName.text = music

    }
}