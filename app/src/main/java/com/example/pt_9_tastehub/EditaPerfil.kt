package com.example.pt_9_tastehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditaPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edita_perfil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Encuentra el botón por su ID
        val btnDelete: Button = findViewById(R.id.btn_deleteCuenta)

        // Configura un listener para el botón
        btnDelete.setOnClickListener {
            // Muestra el Toast
            Toast.makeText(this, "Compte Suprimit", Toast.LENGTH_SHORT).show()
        }

        val btnGuardar: Button = findViewById(R.id.btn_changePass)

        btnGuardar.setOnClickListener{
            Toast.makeText(this, "Informació guardada", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PaginaPerfil::class.java)
        }

    }
}