package com.example.databindinguser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindinguser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView( this,R.layout.activity_main)
       // binding.tvFname.text="hemant"
        //binding.tvLname.text="kumar"
        binding.button.setOnClickListener {


        }


    }
}