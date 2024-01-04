package com.example.homeworke7

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homeworke7.databinding.FragmentSecondBinding

class SecondFragment : Fragment(), OnItemClick {

    private lateinit var binding: FragmentSecondBinding
    private var musicList = arrayListOf(
        Music("Седая ночь", "Юрий Шатунов", "5:35"),
        Music("Любовь как сон", "Ulukmanapo, Бекиш", "3:10"),
        Music("Август это ты", "Мот", "2:52"),
        Music("Мурашки", "PRINCE", "2:55"),
        Music("Если это любовь то она взята на прокат", "Jah Khalib", "3:41"),
        Music("Тихий океан", "AIHAN", "3:18"),
        Music("Жалгыз океан ", "Oberon.MSY", "3:11"),
        Music("Ойлаш", "PRINCE", "3:31"),
        Music("Не сегодня", "Ulukmanapo", "3:45"),
        Music("Сирень", "Bakr", "3:13"),
        Music("Камин", "EMIN feat. JONY", "3:05")
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = MusicAdapter(musicList, this)
        binding.rvMusicName.adapter = adapter

    }

    override fun onItemClick(position: Int) {

        val intent = Intent(activity, MusicActivity::class.java)
        val music: Music = musicList[position]
        intent.putExtra("music", music.name)
        startActivity(intent)
    }
}