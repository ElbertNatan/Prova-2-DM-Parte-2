package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.imdmarket.databinding.ActivityEditBinding
import androidx.activity.ComponentActivity

class EditActivity : ComponentActivity() {
    private lateinit var binding: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editButton.setOnClickListener {
            val code = binding.code.text.toString()
            val name = binding.name.text.toString()
            val description = binding.description.text.toString()
            val stock = binding.stock.text.toString().toIntOrNull()

            if (code.isEmpty()) {
                Toast.makeText(this, "Preencha o campo de código!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Produto alterado com sucesso!", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        binding.clearButton.setOnClickListener {
            binding.code.text.clear()
            binding.name.text.clear()
            binding.description.text.clear()
            binding.stock.text.clear()
        }

        binding.backButton.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}
