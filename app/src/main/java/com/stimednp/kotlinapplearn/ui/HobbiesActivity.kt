package com.stimednp.kotlinapplearn.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.stimednp.kotlinapplearn.adapter.HobbiesAdapter
import com.stimednp.kotlinapplearn.databinding.ActivityHobbiesBinding
import com.stimednp.kotlinapplearn.model.Supplier

class HobbiesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHobbiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHobbiesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.rvHobbies.layoutManager = layoutManager

        val adapter = HobbiesAdapter(Supplier.hobbiesModel)
        binding.rvHobbies.adapter = adapter
    }
}