package com.example.pt_9_tastehub

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogInScreenActivity : AppCompatActivity() {
    private lateinit var logInBoto: Button
    private lateinit var signInBoto: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.log_in_screen)

        signInBoto = findViewById(R.id.btn_singup)
        logInBoto = findViewById(R.id.btn_login)

        signInBoto.setOnClickListener(View.OnClickListener {
            val list: Intent = Intent(
                this@LogInScreenActivity,
                MainActivity::class.java
            )
            startActivity(list)
        })

        logInBoto.setOnClickListener(View.OnClickListener {
            val list: Intent = Intent(
                this@LogInScreenActivity,
                SignedUpOkayActivity::class.java
            )
            startActivity(list)
        })

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}