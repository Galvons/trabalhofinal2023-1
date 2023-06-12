package com.example.finaldesafio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditarPerfil: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editarperfil)

        val button = findViewById<Button>(R.id.botao_voltar)
        val editarPerfil = findViewById<Button>(R.id.botao_editar)

        val text = "Perfil editado!"
        val duration = Toast.LENGTH_SHORT


        editarPerfil.setOnClickListener {
            val botao = Intent(this, Perfil::class.java)
            startActivity(botao)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        button.setOnClickListener {
            val botao = Intent(this, Perfil::class.java)
            startActivity(botao)
        }




    }
}