package com.example.daver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daver.databinding.ActivityMainBinding

class RegisterActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}