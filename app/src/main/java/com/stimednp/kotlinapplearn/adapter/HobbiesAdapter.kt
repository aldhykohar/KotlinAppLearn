package com.stimednp.kotlinapplearn.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stimednp.kotlinapplearn.databinding.ItemContainerHobbiesBinding
import com.stimednp.kotlinapplearn.model.HobbiesModel

class HobbiesAdapter(private val listHobbie: List<HobbiesModel>) :
    RecyclerView.Adapter<HobbiesAdapter.ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            ItemContainerHobbiesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int = listHobbie.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(listHobbie[position])
    }

    class ItemViewHolder(private val binding: ItemContainerHobbiesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hobby: HobbiesModel?) {
            with(binding) {
                tvTitle.text = hobby!!.title
            }
        }

    }

}
