package com.aastha.zomatosearch.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.aastha.zomatosearch.R
import com.aastha.zomatosearch.databinding.ItemRestaurantBinding
import com.aastha.zomatosearch.entities.RestaurantObject

class RestaurantAdapter(context: Context, val it: ArrayList<RestaurantObject>) :
    RecyclerView.Adapter<RestaurantAdapter.Viewholder>() {

    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            DataBindingUtil.inflate(
                layoutInflater,
                R.layout.item_restaurant,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return it.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.bind()
    }

    inner class Viewholder(private val binding: ItemRestaurantBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            binding.data = it[adapterPosition]
        }
    }
}
