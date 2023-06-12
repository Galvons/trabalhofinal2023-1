package com.example.finaldesafio

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recuperar = findViewById<Button>(R.id.recuperarsenha_buton)
        val button = findViewById<Button>(R.id.register_button)
        val botaologin = findViewById<Button>(R.id.login_button)

        val text = "Login efetuado com sucesso!"
        val duration = Toast.LENGTH_SHORT

        recuperar.setOnClickListener {
            val botao = Intent(this, RecuperarSenha::class.java)
            startActivity(botao)
        }

        button.setOnClickListener {
            val botao = Intent(this, CadastroAnunciante::class.java)
            startActivity(botao)
        }

        botaologin.setOnClickListener {
            val botao = Intent(this, ConsultaVagas::class.java)
            startActivity(botao)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }
}