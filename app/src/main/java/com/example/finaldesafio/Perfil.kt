package com.example.finaldesafio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Perfil:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfilusuario)

        val editar = findViewById<Button>(R.id.botao_editar_perfil)
        val home = findViewById<Button>(R.id.buttonvoltar)
        val sair = findViewById<Button>(R.id.buttonsair)

        val text = "Você deslogou da plataforma!"
        val duration = Toast.LENGTH_SHORT


        editar.setOnClickListener {
            val botao = Intent(this, EditarPerfil::class.java)
            startActivity(botao)
        }

        home.setOnClickListener {
            val botao = Intent(this, ConsultaVagas::class.java)
            startActivity(botao)
        }

        sair.setOnClickListener {
            val botao = Intent(this, MainActivity::class.java)
            startActivity(botao)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

    }
}