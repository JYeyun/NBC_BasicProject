package com.example.nbc_standard_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.nbc_standard_fragment.databinding.FragmentDashboardBinding

class DashBoardFragment : Fragment() {
    private val viewModel:MainViewModel by activityViewModels()
    private var _binding:FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    lateinit var selectItem:Flower

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root
        viewModel.getData().observe(viewLifecycleOwner, Observer {
            selectItem = it
            binding.detailImg.setImageResource(it.img)
            binding.detailName.text = it.name
            binding.detailDescription.text = it.description
        })
        return view
    }

}