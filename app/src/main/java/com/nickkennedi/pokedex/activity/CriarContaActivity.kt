package com.nickkennedi.pokedex.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nickkennedi.pokedex.databinding.ActivityCriarContaBinding

class CriarContaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCriarContaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriarContaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCcEmail.setOnClickListener(){
            val navegarScreenCadastroActivity = Intent(this, CadastroActivity::class.java)
            startActivity(navegarScreenCadastroActivity)
        }
    }
}