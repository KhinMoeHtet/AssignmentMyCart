package com.example.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycart.R
import com.example.mycart.model.Product
import kotlinx.android.synthetic.main.item_product.view.*


class ProductAdapter(var productList: ArrayList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.txtName.text = product.name
            itemView.txtPrice.text = product.price.toString()
            itemView.imgProduct.setImageResource(product.image)
            itemView.txtWeight.text=product.weight
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        holder.bind(productList[position])

    }


}