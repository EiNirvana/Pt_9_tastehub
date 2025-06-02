package com.example.pt_9_tastehub.recepta_1_linia.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pt_9_tastehub.R
import com.example.pt_9_tastehub.recepta_1_linia.adapter.Recepta1LiniaAdapter
import com.example.pt_9_tastehub.recepta_1_linia.Recepta1Linia

class Recepta1LiniaAdapter(private val recepta1LiniaList: List<Recepta1Linia>) : RecyclerView.Adapter<Recepta1LiniaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recepta1LiniaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return Recepta1LiniaViewHolder(layoutInflater.inflate(R.layout.item05_recepta_alone, parent, false))
    }

    override fun getItemCount(): Int = recepta1LiniaList.size

    override fun onBindViewHolder(holder: Recepta1LiniaViewHolder, position: Int) {
        val item = recepta1LiniaList.get(position)
        holder.render(item)
    }

}