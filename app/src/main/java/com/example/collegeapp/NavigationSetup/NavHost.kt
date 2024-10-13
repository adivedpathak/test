package com.example.collegeapp.NavigationSetup

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.collegeapp.Screens.SplashScreen

@Composable
fun NavigationFun(navController:NavHostController) {

    NavHost(navController = navController, startDestination = Routes.Splash.route) {
        composable(Routes.Home.route) {
//    HomeScreen()
        }
        composable(Routes.BottomNav.route) {
//    HomeScreen()
        }
        composable(Routes.Splash.route) {
//    HomeScreen(
            SplashScreen()
        }
        composable(Routes.About.route) {
//    HomeScreen()
        }
        composable (Routes.Gallery.route) {
//    HomeScreen()
        }


    }
}
