package com.zarisa.doctor

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.fragment.app.viewModels
import com.zarisa.doctor.databinding.ActivityDoctorsPersonalPageBinding.inflate
import com.zarisa.doctor.databinding.ActivityMainBinding.inflate
import com.zarisa.doctor.databinding.FragmentDoctorInfoBinding
import com.zarisa.doctor.databinding.FragmentDoctorInfoBinding.inflate


class DoctorInfo : Fragment() {
    lateinit var fragBinding:FragmentDoctorInfoBinding
    val viewModel1: ViewModel1 by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragBinding= FragmentDoctorInfoBinding.inflate(layoutInflater, container, false)

        return fragBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var id=activity?.intent?.getStringExtra(DOCTOR)
        var doctor=viewModel1.getInfo(id)
        fragBinding.textViewName.text=doctor.name
        fragBinding.textViewAddress.text="Address: ${doctor.personalOffice}"
        fragBinding.textViewPhone.text="Phone: ${doctor.phone}"
    }


}