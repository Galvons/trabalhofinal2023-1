package com.example.finaldesafio

import VagaAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ConsultaVagas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.consultavagas)



        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val listaDeVagas: List<VagaAdapter.Vaga> = listOf(
            VagaAdapter.Vaga(
                "Recepcionista",
                "Localização 1",
                "Salário 1",
                "Anunciante 1",
                "E-mail 1",
                "Telefone 1",
                "Data Início 1",
                "Data Término 1"
            ),
            VagaAdapter.Vaga(
                "Desenvolvedor",
                "Localização 2",
                "Salário 2",
                "Anunciante 2",
                "E-mail 2",
                "Telefone 2",
                "Data Início 2",
                "Data Término 2"
            ),
            VagaAdapter.Vaga(
                "Designer",
                "Localização 3",
                "Salário 3",
                "Anunciante 3",
                "E-mail 3",
                "Telefone 3",
                "Data Início 3",
                "Data Término 3"
            )
        )


// Crie uma instância do adaptador VagaAdapter e passe a lista de vagas para ele
        val vagaAdapter = VagaAdapter(listaDeVagas){vaga ->
        val detalhesVaga = Intent (this,DetalhesVagas::class.java)
            detalhesVaga.putExtra("detalhesVaga", vaga);
         startActivity(detalhesVaga)
        }


// Defina o layout manager para o RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

// Defina o adaptador para o RecyclerView
        recyclerView.adapter = vagaAdapter
        
    }
}