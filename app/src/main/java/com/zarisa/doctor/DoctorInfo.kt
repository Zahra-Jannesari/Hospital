package com.zarisa.doctor

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.zarisa.doctor.databinding.ActivityDoctorsPersonalPageBinding.inflate
import com.zarisa.doctor.databinding.ActivityMainBinding.inflate
import com.zarisa.doctor.databinding.FragmentDoctorInfoBinding
import com.zarisa.doctor.databinding.FragmentDoctorInfoBinding.inflate


class DoctorInfo : Fragment() {
    lateinit var fragBinding:FragmentDoctorInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragBinding= FragmentDoctorInfoBinding.inflate(layoutInflater, container, false)
        var doctorOfThisPage=activity?.intent?.getParcelableExtra<Doctor>(DOCTOR)
        fragBinding.textViewName.text=doctorOfThisPage?.name
        fragBinding.textViewAddress.text="Address: ${doctorOfThisPage?.personalOffice}"
        fragBinding.textViewPhone.text="Phone: ${doctorOfThisPage?.phone.toString()}"
        return fragBinding.root
    }


}