package com.zarisa.doctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zarisa.doctor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var menuClicked:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.buttonMenu.setOnClickListener {menuButtonOnClick()}
    }
    fun menuButtonOnClick(){
        if (!menuClicked) {
            binding.buttonThirdButtonOfMenu.visibility = View.VISIBLE
            binding.buttonSecondButtonOfMenu.visibility = View.VISIBLE
            binding.buttonFirstButtonOfMenu.visibility = View.VISIBLE
            menuClicked=!menuClicked
        }else{
            binding.buttonThirdButtonOfMenu.visibility = View.GONE
            binding.buttonSecondButtonOfMenu.visibility = View.GONE
            binding.buttonFirstButtonOfMenu.visibility = View.GONE
            menuClicked=!menuClicked
        }
    }
}