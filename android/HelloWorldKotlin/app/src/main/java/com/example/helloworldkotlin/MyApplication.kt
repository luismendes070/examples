package com.example.helloworldkotlin

import android.app.Application
import com.example.helloworldkotlin.ui.login.LoginActivity
import com.google.android.datatransport.runtime.dagger.Component

// import com.google.dagger.*;
// import kotlin.text.Typography.dagger.DaggerApplicationComponent;

// class MyApplication {}
// https://developer.android.com/training/dependency-injection/dagger-android
// Definition of the Application graph
@Component
interface ApplicationComponent {

    // This tells Dagger that LoginActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is requesting.
    fun inject(activity: LoginActivity)

}

// appComponent lives in the Application class to share its lifecycle
class MyApplication: Application() {
    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerApplicatonComponent.create()
}
