package com.example.helloworldkotlin

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.helloworldkotlin.viewbinding.ResultProfile

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.helloworldkotlin", appContext.packageName)
    }

    // https://developer.android.com/topic/libraries/view-binding#setup
    @Test
    fun ResultProfileViewBindingTest(){

        val resultProfile = ResultProfile();

        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.helloworldkotlin.viewbinding.ResultProfile", appContext.packageName)

    }
}