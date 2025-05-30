package com.example.pt_9_tastehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaginaPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pagina_perfil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Encuentra el botón por su ID
        val btnEditaPerfil: Button = findViewById(R.id.btn_editaPerfil)

        // Configura un listener para el botón
        btnEditaPerfil.setOnClickListener {
            // Crea el Intent para cambiar a la nueva actividad
            val intent = Intent(this, EditaPerfil::class.java)

            // Inicia la actividad
            startActivity(intent)
        }

    }
}