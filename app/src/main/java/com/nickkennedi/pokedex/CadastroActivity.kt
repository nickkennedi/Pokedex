package com.nickkennedi.pokedex

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.MotionEvent
import android.widget.ImageView
import androidx.core.view.isNotEmpty
import androidx.core.view.isVisible
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.nickkennedi.pokedex.R.*
import com.nickkennedi.pokedex.R.drawable.eye_false
import com.nickkennedi.pokedex.R.drawable.eye_true
import com.nickkennedi.pokedex.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding
    private var passwordVisible = false
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.edtNomeTxt.addTextChangedListener(textWatcher)
        binding.edtEmailTxt.addTextChangedListener(textWatcher)
        binding.edtSenhaTxt.addTextChangedListener(textWatcher)



        val senhaTextInputLayout = findViewById<TextInputLayout>(id.edt_senha)
        val senhaEditText = findViewById<TextInputEditText>(id.edt_senha_txt)

        // Configuração inicial para ocultar a senha
        senhaEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

        // Configuração do endIconMode para alternar a visibilidade da senha
        senhaTextInputLayout.setEndIconOnClickListener {
            togglePasswordVisibility(senhaEditText, senhaTextInputLayout)
        }


    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(editable: Editable?) {
            val nomeValido = binding.edtNomeTxt.text?.isNotBlank() == true
            val emailValido = android.util.Patterns.EMAIL_ADDRESS.matcher(binding.edtEmailTxt.text?.toString()).matches()
            val senhaValida = binding.edtSenhaTxt.text?.length ?: 0 >= 6

            binding.btnCadastrar.isVisible = nomeValido && emailValido && senhaValida
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




