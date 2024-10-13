package com.example.collegeapp.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.collegeapp.NavigationSetup.Routes

data class BottomNavItems(val title: String, val route: String, val icon: ImageVector) {
}


@Composable
fun MybottomBar(navController1: NavHostController) {

    val backstackEntry =
        navController1.currentBackStackEntryAsState()   //to remeber last screen entry

    val list = listOf(
        BottomNavItems("Home", "home", Icons.Rounded.Home),
        BottomNavItems("Search", "search", Icons.Rounded.Search),
        BottomNavItems("Faculty", "Faculty", Icons.Rounded.Info),
        BottomNavItems("Student", "Student", Icons.Rounded.Person),
        BottomNavItems("Notification", "Notification", Icons.Rounded.Notifications)
        )

    BottomAppBar {
        list.forEach {
            val selected = it.route == backstackEntry.value?.destination?.route
            NavigationBarItem(selected = selected, onClick = {
                navController1.navigate(it.route) {
                    popUpTo(navController1.graph.findStartDestination().id) { saveState = true }
                    launchSingleTop = true
                }
            },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) })


        }

    }
}

