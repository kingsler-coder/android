package com.kingsler.charles.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kingsler.charles.R
import com.kingsler.charles.navigation.route_home
import com.kingsler.charles.navigation.route_login
import com.kingsler.charles.navigation.route_register
import java.nio.file.WatchEvent

@Composable
fun Homescreen(navController: NavHostController){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("KINGSLER",
            color = Color.Magenta,
            fontSize = 50.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic
        )
//        Spacer(modifier = Modifier.height(40.dp))
    Image(painter = painterResource(id = R.drawable.code5),
    contentDescription = "code5",
    modifier = Modifier
        .fillMaxWidth()
        .height(400.dp)
    )

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {navController.navigate(route_login)},
            modifier =Modifier.width(300.dp)) {
            Text(text = "LOGIN",
                fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {navController.navigate(route_register)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "REGISTER",
                fontSize = 40.sp)
        }

        }

    }




@Preview
@Composable
private fun home_prev() {
    Homescreen(rememberNavController())
}