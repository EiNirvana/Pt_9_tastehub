package com.example.pt_9_tastehub

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.pt_9_tastehub.ActivitySignUpViewModel
import org.junit.Test
import org.junit.Assert.*
import org.junit.Rule

class SignUpUnitariTest {
    @get:Rule
    val instantExecuteRule = InstantTaskExecutorRule()

    private val viewModel = ActivitySignUpViewModel()

    @Test
    fun `update nom user retorna error quan el nom de usuari esta buit` (){
        viewModel.updateNomUser("")
        viewModel.test_nomUser("")
        assertEquals("El nom d'usuari no pot estar buit", viewModel.errorNom.value)
    }

    @Test
    fun `updateEmailUser retorna error quan esta buit`(){
        viewModel.updateEmailUser("")
        viewModel.test_emailUser("")
        assertEquals("El email d'usuari no pot estar buit", viewModel.errorEmail.value)
    }

    @Test
    fun `updatePasswordUser retorna error quan esta buida`(){
        viewModel.updatePasswordUser("")
        viewModel.test_passwordUser()
        assertEquals("La contrasenya no pot estar buit", viewModel.errorPass.value)
    }

}