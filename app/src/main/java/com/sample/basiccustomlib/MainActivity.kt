package com.sample.basiccustomlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sample.basiccustomlib.databinding.ActivityMainBinding
import com.sample.cutomsnackbar.CustomSnackBar

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.clButton.setOnClickListener {

            CustomSnackBar.SnackSg(it,"Success","")

        }



    }
}