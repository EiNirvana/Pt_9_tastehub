package com.example.pt_9_tastehub

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pt_9_tastehub.R
import com.example.pt_9_tastehub.recepta_1_linia.Recepta1LiniaProvider
import com.example.pt_9_tastehub.recepta_1_linia.adapter.Recepta1LiniaAdapter

class RecepieScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recepie_scroll)

        // Referencia al botón
        val button: ImageButton = findViewById(R.id.btn_show_fragment)

        // Listener para mostrar el fragmento
        button.setOnClickListener {
            val fragmentContainer = findViewById<FrameLayout>(R.id.fragment_container)

            // Cambiar visibilidad del contenedor
            if (fragmentContainer.visibility == View.GONE) {
                fragmentContainer.visibility = View.VISIBLE

                // Reemplazar o añadir el fragmento
                val fragment = fragmentContainer
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment())
                    .commit()
            } else {
                fragmentContainer.visibility = View.GONE
            }
        }

        // Button Imagen Receta
      /*  val buttonReceta : ImageButton = findViewById(R.id.btn_receta01)
        buttonReceta.setOnClickListener(View.OnClickListener {
            val list: Intent = Intent(this@RecepieScrollActivity, PaginaRecepta::class.java)
            startActivity(list)
        }) */

        fun initRecyclerView(){
            val recyclerView = findViewById<RecyclerView>(R.id.singleReciepeShow)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = Recepta1LiniaAdapter(Recepta1LiniaProvider.recepta1LiniaList)
        }
    }
}