package com.nickkennedi.pokedex.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.nickkennedi.pokedex.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            val navegarScreenMain = Intent(this, MainActivity::class.java)
            startActivity(navegarScreenMain)
            finish()
        }, 2000)
    }
}