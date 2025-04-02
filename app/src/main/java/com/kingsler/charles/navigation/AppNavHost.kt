package com.kingsler.charles.navigation

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kingsler.charles.ui.theme.screens.home.Homescreen
import com.kingsler.charles.ui.theme.screens.login.Loginscreen
import com.kingsler.charles.ui.theme.screens.register.Registerscreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,navController: NavHostController= rememberNavController(),
               startDestination: String=route_home) {
    NavHost(navController=navController,
        modifier = modifier,
        startDestination = startDestination){
        composable (route_home){
            Homescreen(navController)
        }
        composable(route_login){
            Loginscreen(navController)
        }
        composable (route_register){
            Registerscreen(navController)
        }

    }

}