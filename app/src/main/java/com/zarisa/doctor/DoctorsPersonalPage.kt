package com.zarisa.doctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.zarisa.doctor.databinding.ActivityDoctorsPersonalPageBinding

class DoctorsPersonalPage : AppCompatActivity() {
    val viewModel1: ViewModel1 by viewModels()
    lateinit var binding2: ActivityDoctorsPersonalPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2= ActivityDoctorsPersonalPageBinding.inflate(layoutInflater)
        var view=binding2.root
        setContentView(view)
        var id=intent.getStringExtra(DOCTOR)
        var doctor=viewModel1.getInfo(id)
        supportActionBar?.title = doctor.name
    }
}