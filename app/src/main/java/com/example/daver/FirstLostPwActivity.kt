package com.example.daver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daver.databinding.ActivityMainBinding

class FirstLostPwActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}