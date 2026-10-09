package com.example.cafeappmvp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices.PIXEL_6
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cafeappmvp.ui.theme.BgPremium
import com.example.cafeappmvp.ui.theme.CardSurface

@Composable
fun LoyaltyScreen(){
    Box(modifier=Modifier.fillMaxSize().background(color= BgPremium)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    vertical = 48.dp,
                    horizontal = 24.dp
                ),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Column(Modifier.fillMaxWidth().weight(1f)){
                topBarLoyalty()
                cardLoyalty()
            }
            BottomNavBar()
        }
    }
}


@Composable
fun topBarLoyalty(){
    Text(
        text="КАРТА ЛОЯЛЬНОСТИ",
        fontWeight = FontWeight.ExtraBold,
        color=Color.White,
        letterSpacing = 1.sp
    )
}


@Composable
fun cardLoyalty(){
    Spacer(Modifier.height(48.dp))
    Column(modifier=Modifier
        .fillMaxWidth()
        .background(color= CardSurface
        , RoundedCornerShape(16.dp))
        .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Box(modifier=Modifier
            .size(200.dp)
            .background(Color.White
                ,RoundedCornerShape(12.dp))
            .wrapContentWidth(Alignment.CenterHorizontally),

        ){
            Text(
                text="QR-CODE",
                color=Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(Modifier.height(24.dp))
        Text(
            text="Покажите код бариста для НАЧИСЛЕНИЯ кэшбэка",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color=Color(0xFF9E9A98),

        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = PIXEL_6)
@Composable
fun jndjsfa(){
    LoyaltyScreen()
}