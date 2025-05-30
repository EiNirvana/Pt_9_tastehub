package com.example.pt_9_tastehub

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.nullValue

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SignUpUnitTest {

    @get:Rule
    var activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testNomUsuariBuit() {
        onView(withId(R.id.textNomUser)).perform(clearText())
        onView(withId(R.id.btn_singup)).perform(click())
        onView(withId(R.id.textNomUser))
            .check(matches(hasErrorText("El nom d'usuari no pot estar buit")))
    }
    @Test
    fun testEmailBuit() {
        onView(withId(R.id.textEmailUser)).perform(clearText())
        onView(withId(R.id.btn_singup)).perform(click())
        onView(withId(R.id.textEmailUser))
            .check(matches(hasErrorText("El email no pot estar buit")))
    }
    @Test
    fun testContrasenyaBuida(){
        onView(withId(R.id.textFirstPassword)).perform(clearText())
        onView(withId(R.id.btn_singup)).perform(click())
        onView(withId(R.id.textFirstPassword))
            .check(matches(hasErrorText("La contrasenya no pot estar buida")))
    }
    @Test
    fun testContrasenyaRepetidaBuida(){
        onView(withId(R.id.textPasswordRepeated)).perform(clearText())
        onView(withId(R.id.btn_singup)).perform(click())
        onView(withId(R.id.textPasswordRepeated))
            .check(matches(hasErrorText("S'ha de repetir la contrasenya")))
    }

    @Test
    fun testContrasenyesMatch(){
        onView(withId(R.id.textFirstPassword))
            .perform(typeText("password123"), closeSoftKeyboard())
        onView(withId(R.id.textPasswordRepeated))
            .perform(typeText("password123"), closeSoftKeyboard())
        onView(withId(R.id.textPasswordRepeated))
            .check(matches(hasErrorText(nullValue(String::class.java))))
    }

    @Test
    fun navCorrecte(){
        onView(withId(R.id.textNomUser))
            .perform(typeText("Natalia"), closeSoftKeyboard())
        onView(withId(R.id.textEmailUser))
            .perform(typeText("natalia@gmail.com"), closeSoftKeyboard())
        onView(withId(R.id.editTextText3))
            .perform(typeText("12343212"), closeSoftKeyboard())
        onView(withId(R.id.textPasswordRepeated))
            .perform(typeText("12343212"), closeSoftKeyboard())

        onView(withId(R.id.btn_singup)).perform(click())

        onView(withText("Registre correcte"))
            .check(matches(isDisplayed()))
    }
}