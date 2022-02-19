package com.zarisa.doctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zarisa.doctor.databinding.ActivityDoctorsPersonalPageBinding

class DoctorsPersonalPage : AppCompatActivity() {
    lateinit var binding2: ActivityDoctorsPersonalPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2= ActivityDoctorsPersonalPageBinding.inflate(layoutInflater)
        var view=binding2.root
        setContentView(view)
        var doctorOfThisPage=intent?.getParcelableExtra<Doctor>(DOCTOR)
        supportActionBar!!.title = doctorOfThisPage!!.name
    }
}