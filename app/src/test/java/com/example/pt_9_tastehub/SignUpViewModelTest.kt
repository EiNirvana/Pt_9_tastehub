package com.example.pt_9_tastehub

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.android.tools.screenshot.isValid
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class SignUpViewModelTest {
    @get:Rule
    val  instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: ActivitySignUpViewModel

    @Before
    fun setup(){
        viewModel = ActivitySignUpViewModel()
    }

    @Test
    fun `test nom buit`(){
        val status = mutableListOf<SignUpForm>()
        viewModel.formatStatus.observeForever{status.add(it)}

        viewModel.test_nomUser("")
        assertFalse(status.last().isValid)
        assertEquals("El nom d'usuari no pot estar buit", status.last().errorNom)

        viewModel.test_nomUser("       ")
        assertFalse(status.last().isValid)
        assertEquals("El nom d'usuari no pot estar buit", status.last().errorNom)

        viewModel.test_nomUser("Natàlia")
        assertNull(status.last().errorNom)
    }

    @Test
    fun `test email buit`(){
        val status = mutableListOf<SignUpForm>()
        viewModel.formatStatus.observeForever { status.add(it) }

        viewModel.test_nomUser("")
        assertFalse(status.last().isValid)
        assertEquals("El email no pot estar buit", status.last().errorCognom)

        viewModel.test_nomUser("       ")
        assertFalse(status.last().isValid)
        assertEquals("El email no pot estar buit", status.last().errorCognom)
    }

    @Test
    fun `test contrasenya buida`(){

    }


}