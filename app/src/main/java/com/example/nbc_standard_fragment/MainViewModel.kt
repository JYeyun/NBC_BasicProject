package com.example.nbc_standard_fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nbc_standard_fragment.Flower.Companion.showlist

class MainViewModel:ViewModel(){
    val selectFlower = MutableLiveData<Flower>()
    val list = showlist()

    fun sendFlower(position:Int){
        selectFlower.value = list[position]
    }
    fun getData():MutableLiveData<Flower> = selectFlower
}