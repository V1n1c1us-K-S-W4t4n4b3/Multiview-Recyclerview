package com.kzdev.recyclerviewwithmultipleviewtype.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kzdev.recyclerviewwithmultipleviewtype.adapter.MultiViewAdapter
import com.kzdev.recyclerviewwithmultipleviewtype.databinding.ActivityMainBinding
import com.kzdev.recyclerviewwithmultipleviewtype.mock.getItems

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = MultiViewAdapter(this, getItems())
        binding.recyclerView.adapter = adapter
    }
}