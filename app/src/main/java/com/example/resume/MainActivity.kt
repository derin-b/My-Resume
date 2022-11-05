package com.example.resume

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.resume.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLinked.setOnClickListener{
            try{
                val uri = Uri.parse("https://www.linkedin.com/in/aderinola-bankole-8050a6217/")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            catch(e : ActivityNotFoundException){
            }
        }

        moveToNextScreen()
    }

    private fun moveToNextScreen(){
        binding.btnAbout.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_up_top, R.anim.slide_down_bottom)
        }

        binding.btnEducation.setOnClickListener {
            val intent = Intent(this, Education::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        binding.btnSkills.setOnClickListener {
            val intent = Intent(this, Skills::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        binding.btnInterests.setOnClickListener {
            val intent = Intent(this, Interests::class.java)
            startActivity(intent)
        }
    }
}