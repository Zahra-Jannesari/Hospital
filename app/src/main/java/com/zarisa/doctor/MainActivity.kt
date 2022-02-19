package com.zarisa.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zarisa.doctor.databinding.ActivityMainBinding
const val DOCTOR="doctor"
class MainActivity : AppCompatActivity(){
    lateinit var binding:ActivityMainBinding
    private var menuClicked:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        buttonsOnClickListeners()
    }

    private fun buttonsOnClickListeners() {
        binding.buttonMenu.setOnClickListener { menuButtonOnClick() }
        binding.buttonFirstButtonOfMenu.setOnClickListener { eachButtonOnClick(1) }
        binding.buttonSecondButtonOfMenu.setOnClickListener{ eachButtonOnClick(2) }
        binding.buttonThirdButtonOfMenu.setOnClickListener{ eachButtonOnClick(3) }
    }
    fun eachButtonOnClick(numberOfButton:Int) {
        val intent=Intent(this,DoctorsPersonalPage::class.java)
        var doctor=Hospital.testData(numberOfButton)
        intent.putExtra(DOCTOR,doctor)
        startActivity(intent)
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