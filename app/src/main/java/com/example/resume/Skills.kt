package com.example.resume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.resume.databinding.ActivitySkillsBinding

class Skills : AppCompatActivity() {
    private lateinit var binding: ActivitySkillsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
            onBackPressed()
        }
    }
}