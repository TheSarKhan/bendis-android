package com.bendis.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.bendis.R
import com.bendis.data.entity.Items
import com.bendis.databinding.FragmentHomeBinding
import com.bendis.ui.adapter.ItemAdapter

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter : ItemAdapter
    private lateinit var itemsList : ArrayList<Items>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View{
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        itemsList = ArrayList<Items>()
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))
        itemsList.add(Items(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67))

        binding.rvHome.layoutManager = GridLayoutManager(requireContext(),2)
        adapter = ItemAdapter(itemsList)
        binding.rvHome.adapter = adapter
        return binding.root
    }
}