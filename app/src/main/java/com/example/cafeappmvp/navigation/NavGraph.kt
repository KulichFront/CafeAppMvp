package com.example.cafeappmvp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cafeappmvp.screens.InfoScreen

sealed class Screen(val route: String){
    object CafeInfo:Screen("cafe_info")
    object Home:Screen("home")
}

@Composable
fun NavGraph(){
    val navController= rememberNavController()

    NavHost(
        navController=navController,
        startDestination = Screen.CafeInfo.route
    ){
        composable(Screen.CafeInfo.route) {
            InfoScreen(onStartClick = {
                // Логика перехода: пока просто заглушка, позже направим на авторизацию
                navController.navigate(Screen.Home.route)
            })
        }
        composable(Screen.Home.route) {
            Box(modifier = androidx.compose.ui.Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
                Text(text = "Главный экран клиента (В разработке)", fontSize = 20.sp)
            }
        }
    }
}

