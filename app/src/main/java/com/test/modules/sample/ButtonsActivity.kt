package com.test.modules.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gft.app.databinding.ActivityButtonsBinding

class ButtonsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}