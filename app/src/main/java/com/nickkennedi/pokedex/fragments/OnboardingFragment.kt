package com.nickkennedi.pokedex.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.nickkennedi.pokedex.R


class OnboardingFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_onboarding,
            container,
            false
        )
        val btnOnboarding = view.findViewById<Button>(R.id.btn_onboarding1)
        btnOnboarding.setOnClickListener {
        openOnboardingTwoFragment()
        }
        return view
    }
    private fun openOnboardingTwoFragment() {
        val fragment = OnboardingTwoFragment()
        val transaction = requireFragmentManager().beginTransaction()
        transaction.replace(R.id.fragment_conteudo, fragment) // R.id.fragment_container é o ID do contêiner onde os fragments estão sendo exibidos
        transaction.addToBackStack(null)
        transaction.commit()
    }



}