package com.nickkennedi.pokedex.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.nickkennedi.pokedex.activity.CriarContaActivity
import com.nickkennedi.pokedex.R

class OnboardingThreeFragment: Fragment() {
    //ciclo de vida do Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_onboarding_three,
            container,
            false)

        // id botoes
        val btnCriarConta = view.findViewById<Button>(R.id.btn_criarConta)
        val btnJaTemConta = view.findViewById<Button>(R.id.btn_temConta) // implementar
        btnCriarConta.setOnClickListener {
            openCriarContaActivity()
        }
        return view
    }
    // metodo que cria a intent
    private fun openCriarContaActivity() {
        val openCriarContaScreen = Intent(requireContext(), CriarContaActivity::class.java)
        startActivity(openCriarContaScreen)
    }


}