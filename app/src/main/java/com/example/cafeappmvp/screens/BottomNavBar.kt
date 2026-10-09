package com.example.cafeappmvp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cafeappmvp.ui.theme.CardSurface

@Composable
fun BottomNavBar(){
    Row(modifier=Modifier
        .fillMaxWidth()
        .height(64.dp)
        .background(color= CardSurface)
        .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    )
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Text("\uD83C\uDFE0")
            Spacer(Modifier.height(4.dp))
            Text(
                text="Главная",
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Text("☕")
            Spacer(Modifier.height(4.dp))
            Text(
                text="Меню",
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Text("\uD83C\uDF81")
            Spacer(Modifier.height(4.dp))
            Text(
                text="Акции",
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Text("\uD83D\uDCF1")
            Spacer(Modifier.height(4.dp))
            Text(
                text="Карта",
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}