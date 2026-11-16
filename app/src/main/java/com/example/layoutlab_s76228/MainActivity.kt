package com.example.layoutlab_s76228

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutlab_s76228.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLinear.setOnClickListener { open(LinearActivity::class.java) }
        binding.btnFrame.setOnClickListener { open(FrameActivity::class.java) }
        binding.btnTable.setOnClickListener { open(TableActivity::class.java) }
        binding.btnRecycler.setOnClickListener { open(RecyclerActivity::class.java) }
        binding.btnRelative.setOnClickListener { open(RelativeActivity::class.java) }
        binding.btnConstraint.setOnClickListener { open(ConstraintActivity::class.java) }

         }
    private fun open(target: Class<*>) = startActivity(Intent(this, target))
    }
