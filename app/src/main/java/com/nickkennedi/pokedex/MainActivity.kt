package com.nickkennedi.pokedex

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nickkennedi.pokedex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener(){
            val navegarScreeOnboarding02 = Intent(this, Onboarding02Activity::class.java)
            val options = ActivityOptions.makeCustomAnimation(this,  R.anim.slide_in, R.anim.slide_out)
            startActivity(navegarScreeOnboarding02, options.toBundle())
        }

    }

}