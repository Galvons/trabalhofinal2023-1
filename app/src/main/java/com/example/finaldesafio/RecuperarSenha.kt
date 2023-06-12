package com.example.finaldesafio

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class RecuperarSenha : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recuperarsenha)

        val button = findViewById<Button>(R.id.button_enviar_email)


        button.setOnClickListener {
            val button = Intent(this,Login::class.java)
            startActivity(button)
            finish()
        }

    }
}