package com.example.pt_9_tastehub

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class  SignUpForm(
    val isValid: Boolean = false,
    val errorNom: String? = null,
    val errorCognom: String? = null,
    var nomUser : String? = null,
    var emailUser : String? = null,
    var passwordUser : String? = null,
    var passwordIIUser : String? = null
) {
}

class ActivitySignUpViewModel : ViewModel() {

    private var nomUser : String = ""
    private var emailUser : String = ""
    private var passwordUser : String = ""
    private var passwordIIUser : String = ""

    private val formStatus = MutableLiveData<SignUpForm>()
    val formatStatus: LiveData<SignUpForm> = formStatus

    private val errorNomUser = MutableLiveData<String>("")
    val errorNom:LiveData<String> = errorNomUser

    private val errorEmailUser = MutableLiveData<String>("")
    val errorEmail:LiveData<String> = errorEmailUser

    private val errorPassUser = MutableLiveData<String>("")
    val errorPass:LiveData<String> = errorPassUser

    private val errorPassIIUser = MutableLiveData<String>("")
    val errorPassII:LiveData<String> = errorPassIIUser

    fun updateNomUser(nomUsuari : String){
        nomUser = nomUsuari
    }
    fun updateEmailUser(emailUsuari :String){
        emailUser = emailUsuari
    }
    fun updatePasswordUser(passwordUsuari: String){
        passwordUser = passwordUsuari
    }
    fun updatePasswordIIUser(passwordIIUsuari: String){
        passwordIIUser = passwordIIUsuari
    }

    public fun test_nomUser(nom: String){
        if(nom.isEmpty()){
            errorNomUser.value = "El nom d'usuari no pot estar buit"
        }else{
            errorNomUser.value = ""
        }
    }
    public fun test_emailUser(email: String){
        if(email.isEmpty()){
            errorEmailUser.value = "El email d'usuari no pot estar buit"
        } else {
            errorEmailUser.value = ""
        }
    }
    public fun test_passwordUser(){
        if(passwordUser.isEmpty()){
            errorPassUser.value = "La contrasenya no pot estar buit"
        } else {
            errorPassUser.value = ""
        }
    }
    public fun test_passwordIIUser(){
        if(passwordIIUser.isEmpty()){
            errorPassIIUser.value = "S'ha de repetir la contrasenya"
        } else {
            errorPassIIUser.value = ""
        }
    }

    fun testUser() {
        test_nomUser(nomUser)
        test_emailUser(emailUser)
        test_passwordUser()
    }

    /*fun signUpUser(){
        testUser()
        if (formulariValid.value!!){
            TODO("Cridar api retrofit per registrar usuari")
        }
    }*/

}