package com.example.resume

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.method.MovementMethod
import com.example.resume.databinding.ActivityAboutBinding

class About : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            overridePendingTransition(R.anim.slide_up_bottom, R.anim.slide_down_top)
            onBackPressed()
        }

        binding.tvGithubLink.movementMethod = LinkMovementMethod.getInstance()
    }
}