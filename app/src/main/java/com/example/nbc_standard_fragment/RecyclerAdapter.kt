package com.example.nbc_standard_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nbc_standard_fragment.Flower.Companion.showlist
import com.example.nbc_standard_fragment.databinding.FlowerItemBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){
    var datalist = showlist()
    interface OnItemClickListener{
        fun onItemClick(view: View, position:Int)
    }

    private lateinit var itemClickListner: OnItemClickListener

    fun setOnItemClickLister(onItemClickListener:OnItemClickListener){
        itemClickListner = onItemClickListener
    }

    inner class MyViewHolder(private val binding: FlowerItemBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            binding.cardView.setOnClickListener{
                val pos = absoluteAdapterPosition
                if(pos != RecyclerView.NO_POSITION && itemClickListner != null){
                    itemClickListner.onItemClick(binding.cardView, pos)
                }
            }
        }
        fun bind(flowerData:Flower) {
            binding.flowerImg.setImageResource(flowerData.img)
            binding.flowerDescription.text = flowerData.description
            binding.flowerName.text = flowerData.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding=FlowerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = datalist.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datalist[position])
    }
}