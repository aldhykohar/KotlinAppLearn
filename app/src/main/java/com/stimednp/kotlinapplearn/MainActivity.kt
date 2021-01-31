package com.stimednp.kotlinapplearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stimednp.kotlinapplearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnIntentEx.setOnClickListener {

            val msg = binding.editText.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", msg)
            startActivity(intent)
        }

        binding.btnIntentIm.setOnClickListener {

            val msg = binding.editText.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to"))
        }
    }
}