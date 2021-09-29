package com.example.lab4_androidadvanced

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lab4_androidadvanced.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnBai1.setOnClickListener {
           startActivity(Intent(this, Bai1::class.java))
       }

        binding.btnBai2.setOnClickListener {
            startActivity(Intent(this, Bai2::class.java))
        }

    }
}