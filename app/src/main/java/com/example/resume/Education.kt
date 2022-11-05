package com.example.resume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.resume.databinding.ActivityEducationBinding

class Education : AppCompatActivity() {
    private lateinit var binding: ActivityEducationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
            onBackPressed()
        }

    }
}