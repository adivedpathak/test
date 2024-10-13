package com.example.collegeapp.Screens

import android.annotation.SuppressLint
import android.widget.Toast
import android.window.SplashScreen
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.collegeapp.NavigationSetup.Routes
import com.example.collegeapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen() {
val context = LocalContext.current
    Scaffold(
        Modifier.background(Color.Yellow),
        topBar = {
            TopAppBar(
                { Text("Products & Services", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.ArrowBack, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Search, contentDescription = null)
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.MoreVert, contentDescription = null)
                    }

                }

            )
        }
        , floatingActionButton = {
            Button(onClick = {
                Toast.makeText(context, "FAB Clicked", Toast.LENGTH_SHORT).show()
            }) {
                Icon(Icons.Default.Add , contentDescription = null, tint = Color.Black)
            }
        }
    ) {
        // Content goes here
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .background(Color.Black)
        ) {
            MyCard(10,200)

        }
    }

}


@Composable
fun MyCard(qty : Int  , price : Int) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp), // Set elevation for shadow effect
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.14f)
            .padding(16.dp),
        border = BorderStroke(1.dp, Color.Gray) ,
        colors = CardDefaults.cardColors(Color.LightGray)

    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Center
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bag),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
                Text("Product name " , color = Color.Black , fontWeight = FontWeight.SemiBold , fontSize = 18.sp)
             Column(modifier = Modifier.padding(10.dp)) {
                 Text("Qty : ${qty}" , color = Color.Black)
                 Text("Price : ${price}" , color = Color.Black )
             }

            }
        }
    }
}