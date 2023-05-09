package com.example.test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test.databinding.ItemRowBinding

class ItemAdapter(private val mList: List<CartData>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(mList[position])
    }
    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(private val itemBinding: ItemRowBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(cartData: CartData) {
            itemBinding.apply {
                tvAvailability.text = cartData.productAvailability
                tvPrice.text = cartData.price.toString()
                tvProductTitle.text = cartData.price.toString()
                Glide.with(itemView.context)
                    .load("https://picsum.photos/seed/picsum/200/300")
                    .centerCrop()
                    .into(ivCart)
            }
        }
    }
}