package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.imdmarket.databinding.ActivityListBinding
import androidx.activity.ComponentActivity

class ListActivity : ComponentActivity() {
    private lateinit var binding: ActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productNames = listOf("Produto teste 1", "Produto teste 2")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, productNames)
        binding.productList.adapter = adapter

        binding.backButton.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}
