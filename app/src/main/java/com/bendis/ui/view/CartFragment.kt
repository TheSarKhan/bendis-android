package com.bendis.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bendis.R
import com.bendis.data.entity.Items
import com.bendis.data.entity.ProductsAddedToCart
import com.bendis.databinding.FragmentCartBinding
import com.bendis.ui.adapter.ItemAdapter
import com.bendis.ui.adapter.ProductAddedToCartAdapter

class CartFragment : Fragment() {
    private var _binding : FragmentCartBinding? = null
    val binding get() = _binding!!
    private lateinit var itemsList : ArrayList<Items>
    private lateinit var productList : ArrayList<ProductsAddedToCart>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCartBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        testWithStaticData()
        navigate()
        setAdapter()

    }

    private fun navigate() {
        binding.navigateToPaymentDetail.setOnClickListener {
            findNavController().navigate(R.id.action_cartFragment_to_paymentDetailFragment)
        }
    }

    private fun testWithStaticData() {
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

        productList = ArrayList<ProductsAddedToCart>()
        productList.add((ProductsAddedToCart(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67,1)))
        productList.add((ProductsAddedToCart(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67,3)))
        productList.add((ProductsAddedToCart(R.drawable.appleitem,"Apple 10.9-inch Ipad Air Wi-Fi Cellular 64 GB",438.67,538.67,1)))

    }

    private fun setAdapter() {
        binding.addedProductsRV.layoutManager = LinearLayoutManager(requireContext())
        binding.similarProductsRV.layoutManager = GridLayoutManager(requireContext(),2)

        //binding.addedProductRV.adapter = AddedProductAdapter(requireContext())
        binding.similarProductsRV.adapter = ItemAdapter(itemsList)
        binding.addedProductsRV.adapter = ProductAddedToCartAdapter(productList,parentFragmentManager)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}