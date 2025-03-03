package com.bendis.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bendis.data.entity.Items
import com.bendis.databinding.RecyclerItemsBinding

class ItemAdapter(private val itemsList : List<Items>) : RecyclerView.Adapter<ItemAdapter.ItemsHolder>() {

    class ItemsHolder(val binding: RecyclerItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsHolder {

        val binding = RecyclerItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemsHolder(binding)
    }

    override fun getItemCount(): Int = itemsList.size

    override fun onBindViewHolder(holder: ItemsHolder, position: Int) {

        val item = itemsList[position]

        holder.binding.rvItemImage.setImageResource(item.itemImage)
        holder.binding.rvItemName.text = item.itemName
        holder.binding.rvItemNowPrice.text = "${item.itemNowPrice} ₼"
        holder.binding.rvItemOldPrice.text = "${item.itemOldPrice} ₼"
    }
}