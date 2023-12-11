package com.nickkennedi.pokedex

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nickkennedi.pokedex.databinding.ActivityOnboarding02Binding

class Onboarding02Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboarding02Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboarding02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener(){
            val navegarScreenOnboarding03 = Intent(this, Onboarding03Activity::class.java)
            /*val options = ActivityOptions.makeCustomAnimation(this,  R.anim.slide_in, R.anim.slide_out)*/
            startActivity(navegarScreenOnboarding03, /*options.toBundle()*/)

        }
    }
}