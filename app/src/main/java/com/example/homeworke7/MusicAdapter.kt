package com.example.homeworke7

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.homeworke7.databinding.ItemMusicBinding

class MusicAdapter(private  val musicList: ArrayList<Music>, private val onClick: OnItemClick): Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = musicList.size

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(musicList[position])
        holder.tvNumber.text = (position + 1).toString()

        holder.itemView.setOnClickListener {
            onClick.onItemClick(position)
        }
    }
}
class ViewHolder(private val binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root){

    val tvNumber: TextView = binding.tvNumber

    fun onBind(music: Music) {
        binding.tvName.text = music.name
        binding.tvAuthor.text = music.author
        binding.tvTame.text = music.tame
    }
}