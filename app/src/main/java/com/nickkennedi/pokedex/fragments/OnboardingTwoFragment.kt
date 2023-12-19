package com.nickkennedi.pokedex.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.nickkennedi.pokedex.R

class OnboardingTwoFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_onboarding_two,
            container,
            false)

        val btnOnboardingTwo = view.findViewById<Button>(R.id.btn_start)
        btnOnboardingTwo.setOnClickListener {
            openOnboardingThreeFragment()
        }
        return view
    }
    private fun openOnboardingThreeFragment() {
        val fragment = OnboardingThreeFragment()
        val transaction = requireFragmentManager().beginTransaction()
        transaction.replace(R.id.fragment_conteudo, fragment) // R.id.fragment_container é o ID do contêiner onde os fragments estão sendo exibidos
        transaction.addToBackStack(null)
        transaction.commit()
    }
}