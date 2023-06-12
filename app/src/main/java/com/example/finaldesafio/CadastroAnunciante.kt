package com.example.finaldesafio

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroAnunciante: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastroanunciante)

        val button = findViewById<Button>(R.id.button3)

        val text = "Cadastro efetuado com sucesso!"
        val duration = Toast.LENGTH_SHORT

        button.setOnClickListener {
            val botao = Intent(this, ConsultaVagas::class.java)
            startActivity(botao)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }
}