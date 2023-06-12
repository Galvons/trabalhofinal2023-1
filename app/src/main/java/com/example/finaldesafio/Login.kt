package com.example.finaldesafio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.login_button)

        button.setOnClickListener {
            val botao = Intent(this, Cadastro::class.java)
            startActivity(botao)
        }


    }
}