package com.bendis.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bendis.data.entity.Items
import com.bendis.databinding.RecyclerFavoriteBinding
import com.bendis.ui.adapter.FavoriteAdapter.FavoriteHolder

class FavoriteAdapter(private val favoriteList : List<Items>) : RecyclerView.Adapter<FavoriteHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): FavoriteHolder {

        val binding = RecyclerFavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavoriteHolder(binding)
    }

    override fun onBindViewHolder(holder: FavoriteHolder,position: Int) {

        val favorite = favoriteList[position]

        holder.binding.tvFavoriteName.text = favorite.itemName
        holder.binding.tvNewPrice.text = "${favorite.itemNowPrice} ₼"
        holder.binding.tvOldPrice.text = "${favorite.itemOldPrice} ₼"
        holder.binding.ivFavorite.setImageResource(favorite.itemImage)
    }

    override fun getItemCount(): Int = favoriteList.size

    class FavoriteHolder(val binding: RecyclerFavoriteBinding) : RecyclerView.ViewHolder(binding.root)
}