package com.nickkennedi.pokedex.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.nickkennedi.pokedex.R
import com.nickkennedi.pokedex.R.*


import com.nickkennedi.pokedex.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding
    private var passwordVisible = false
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val senhaTextInputLayout = findViewById<TextInputLayout>(id.edt_senha)
        val senhaEditText = findViewById<TextInputEditText>(id.edt_senha_txt)

        // Configuração inicial para ocultar a senha
        senhaEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

        // Configuração do endIconMode para alternar a visibilidade da senha
        senhaTextInputLayout.setEndIconOnClickListener {
            togglePasswordVisibility(senhaEditText, senhaTextInputLayout)
        }

    }

    private fun togglePasswordVisibility(editText: TextInputEditText, layout: TextInputLayout) {
        passwordVisible = !passwordVisible

        val inputType = if (passwordVisible) {
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
        } else {
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        }

        editText.inputType = inputType

        // Mova o cursor para o final do texto
        editText.setSelection(editText.text!!.length)

        // Altere o ícone com base na visibilidade da senha
        val iconResource = if (passwordVisible) R.drawable.eye_true else R.drawable.eye_false
        layout.endIconDrawable = resources.getDrawable(iconResource, theme)
    }



}




