package com.example.pt_9_tastehub

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class LogInUnitTest {

    @get:Rule
    var activity = ActivityScenarioRule(LogInScreenActivity::class.java)

    @Test
    fun testNomUsuariBuit() {
        onView(withId(R.id.editTextText2)).perform(clearText())
        onView(withId(R.id.btn_login)).perform(click())
        onView(withId(R.id.editTextText2))
            .check(matches(hasErrorText("El nom d'usuari no pot estar buit")))
    }

    @Test
    fun testContrasenyaBuida(){
        onView(withId(R.id.editTextText3)).perform(clearText())
        onView(withId(R.id.btn_login)).perform(click())
        onView(withId(R.id.editTextText3))
            .check(matches(hasErrorText("La contrasenya no pot estar buida")))
    }
}