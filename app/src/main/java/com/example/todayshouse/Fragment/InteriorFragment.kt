package com.example.todayshouse.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todayshouse.databinding.FragmentInteriorBinding

class InteriorFragment : Fragment() {
    lateinit var binding: FragmentInteriorBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInteriorBinding.inflate(inflater, container, false)
        return binding.root
    }
}