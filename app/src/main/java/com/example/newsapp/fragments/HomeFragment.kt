package com.example.newsapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newsapp.adapter.NewsPagerAdapter
import com.example.newsapp.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val tabs = arrayOf("Tesla", "TechCrunch", "Business")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        val adapter = NewsPagerAdapter(this)
        binding.vpMain.adapter = adapter
        TabLayoutMediator(binding.tlMain, binding.vpMain){
                tab, index -> tab.text = tabs[index]
        }.attach()
        return binding.root
    }


}