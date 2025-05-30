package com.example.pt_9_tastehub.recepta_1_linia.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pt_9_tastehub.R
import com.example.pt_9_tastehub.recepta_1_linia.Recepta1Linia

class Recepta1LiniaViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val nomPhoto = view.findViewById<ImageView>(R.id.image)
    val nomReceipe = view.findViewById<TextView>(R.id.tipusRecepta)
    val titleRecepta = view.findViewById<TextView>(R.id.titleRecepta)
    val textRecepta = view.findViewById<TextView>(R.id.textRecepta)

    fun render(receptaUnica: Recepta1Linia){
        nomReceipe.text = receptaUnica.typeReciepe
        titleRecepta.text = receptaUnica.titleRecepta
        textRecepta.text = receptaUnica.descripcioRecepta
    }
}