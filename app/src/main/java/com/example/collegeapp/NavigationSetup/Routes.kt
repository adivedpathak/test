package com.example.collegeapp.NavigationSetup

import kotlinx.serialization.Serializable

sealed class Routes(val route : String){
    object Home :Routes("Home")
    object Faculty :Routes("Faculty")
    object About :Routes("About")
    object Gallery : Routes("Gallery")
    object BottomNav :Routes("BottomNav")
    object Splash :Routes("Splash")
}