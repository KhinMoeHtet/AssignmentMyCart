package com.example.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycart.adapter.ProductAdapter
import com.example.mycart.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var productList = ArrayList<Product>()
        productList.add(Product("Fine Grain Sugar", 20.00, R.drawable.sugar,"1 Kg"))
        productList.add(Product("Peanuts", 20.00, R.drawable.peanuts,"3 Kg"))
        productList.add(Product("Dawat Rice", 80.00, R.drawable.rice,"2 Kg"))

        var productAdapter = ProductAdapter(productList)
        productRecycler.layoutManager = LinearLayoutManager(this)
        productRecycler.adapter = productAdapter

    }
}