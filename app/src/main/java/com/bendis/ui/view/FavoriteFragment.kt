package com.bendis.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.bendis.R
import com.bendis.data.entity.Items
import com.bendis.databinding.FragmentFavoriteBinding
import com.bendis.ui.adapter.FavoriteAdapter

class FavoriteFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteBinding
    private lateinit var adapter: FavoriteAdapter
    private lateinit var favoriteList : ArrayList<Items>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View{
        binding = FragmentFavoriteBinding.inflate(inflater,container,false)

        favoriteList = ArrayList<Items>()

        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        favoriteList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))

        binding.rvFavorite.layoutManager = GridLayoutManager(requireContext(),2)
        adapter = FavoriteAdapter(favoriteList)
        binding.rvFavorite.adapter = adapter
        return binding.root
    }
}