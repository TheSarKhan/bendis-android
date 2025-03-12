package com.bendis.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.bendis.data.entity.ProductsAddedToCart
import com.bendis.databinding.ProductAddedToCartRowLayoutBinding
import com.bendis.ui.view.DeleteProductBottomSheet

class ProductAddedToCartAdapter(
    val productsList : List<ProductsAddedToCart>,
    val fragmentManager: FragmentManager) : RecyclerView.Adapter<ProductAddedToCartAdapter.ViewHolder>() {
    inner class ViewHolder(val binding : ProductAddedToCartRowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(ProductAddedToCartRowLayoutBinding.inflate(layoutInflater,parent,false))
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val binding = holder.binding
        val currentProduct = productsList[position]

        binding.productImage.setImageResource(currentProduct.productImage)
        binding.productName.text = currentProduct.productName
        binding.oldPrice.text = currentProduct.productOldPrice.toString()
        binding.currentPrice.text = currentProduct.productCurrentPrice.toString()
        binding.count.text = currentProduct.productCount.toString()

        binding.deleteButton.setOnClickListener {
            val bottomSheet = DeleteProductBottomSheet()
            bottomSheet.show(fragmentManager,"deleteProductBottomSheet")
        }
    }

    override fun getItemCount(): Int {
        return productsList.size
    }

}