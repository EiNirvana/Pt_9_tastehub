package com.example.pt_9_tastehub

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.pt_9_tastehub.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el diseño del fragmento
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val navButton = view.findViewById<BottomNavigationView>(R.id.bottom_nav)

        setSelectedNavItem(navButton)

        navButton.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    true
                }
                R.id.search -> {
                    if (activity !is RecepieScrollActivity){
                        startActivity(Intent(requireActivity(), RecepieScrollActivity::class.java))
                    }
                    true
                }

                R.id.addRecep -> {
                    if (activity !is NewRecepie){
                        startActivity(Intent(requireActivity(), NewRecepie::class.java))
                    }
                    true
                }

                R.id.btn_profile -> {
                    if (activity !is PaginaPerfil){
                        startActivity(Intent(requireActivity(), PaginaPerfil::class.java))
                    }
                    true
                }

                else -> false
            }
        }

    }

    private fun setSelectedNavItem(navButton : BottomNavigationView){
        when(activity?.javaClass){
            SignedUpOkayActivity::class.java -> navButton.selectedItemId = R.id.home
            RecepieScrollActivity::class.java -> navButton.selectedItemId = R.id.search
            NewRecepie::class.java -> navButton.selectedItemId = R.id.addRecep
            PaginaPerfil::class.java -> navButton.selectedItemId = R.id.btn_profile
        }
    }
}