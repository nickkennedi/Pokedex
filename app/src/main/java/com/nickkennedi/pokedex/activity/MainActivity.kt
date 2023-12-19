package com.nickkennedi.pokedex.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nickkennedi.pokedex.R
import com.nickkennedi.pokedex.fragments.OnboardingFragment

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //chama a funcao com os id dos botoes
        StartFragment()

    }
    fun StartFragment(){
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_conteudo, OnboardingFragment())
            .commit()
    }



}