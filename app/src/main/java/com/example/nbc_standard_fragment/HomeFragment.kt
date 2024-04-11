package com.example.nbc_standard_fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nbc_standard_fragment.Flower.Companion.showlist
import com.example.nbc_standard_fragment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel:MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        initRecyclerView()
        return view
    }
    fun initRecyclerView(){
        val adapter = RecyclerAdapter()
        adapter.datalist = showlist()

        adapter.setOnItemClickLister(object:RecyclerAdapter.OnItemClickListener{
            override fun onItemClick(view: View, position: Int) {
                viewModel.sendFlower(position)
            }
        })
        binding.flowerRecyclerView.adapter = adapter
        binding.flowerRecyclerView.layoutManager= LinearLayoutManager(this.activity)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}