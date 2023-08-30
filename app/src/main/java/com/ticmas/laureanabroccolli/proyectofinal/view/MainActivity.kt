package com.ticmas.laureanabroccolli.proyectofinal.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.ticmas.laureanabroccolli.proyectofinal.databinding.ActivityMainBinding
import com.ticmas.laureanabroccolli.proyectofinal.model.DataModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compareButton.setOnClickListener {
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()
            mainViewModel.compareTexts(text1, text2)
        }

        mainViewModel.result.observe(this, Observer { result ->
            binding.resultTextView.text = "Resultado: $result"
        })
    }
}
