package com.nickkennedi.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nickkennedi.pokedex.databinding.ActivityOnboarding02Binding
import com.nickkennedi.pokedex.databinding.ActivityOnboarding03Binding

class Onboarding03Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboarding03Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboarding03Binding.inflate(layoutInflater)
        setContentView(binding.root)
        
        
        binding.btnPular.setOnClickListener(){
            // TODO: Abrir tela Home 
        }

        binding.btnCriarConta.setOnClickListener(){
            val navegarScreenCriarConta = Intent(this, CriarContaActivity::class.java)
            startActivity(navegarScreenCriarConta)
        }
    }
}