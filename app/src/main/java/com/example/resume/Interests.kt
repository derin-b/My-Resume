package com.example.resume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.resume.databinding.ActivityInterestsBinding

class Interests : AppCompatActivity() {
    private lateinit var binding: ActivityInterestsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInterestsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            onBackPressed()
        }

    }
}