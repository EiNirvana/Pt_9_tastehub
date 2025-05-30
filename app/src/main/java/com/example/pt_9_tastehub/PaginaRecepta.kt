package com.example.pt_9_tastehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaginaRecepta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pagina_recepta)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Encuentra el botón por su ID
        val btnNext: Button = findViewById(R.id.btn_next)

        // Configura un listener para el botón
        btnNext.setOnClickListener {
            // Crea el Intent para cambiar a la nueva actividad
            val intent = Intent(this, Activity9::class.java)

            // Inicia la actividad
            startActivity(intent)
        }
    }
}