package com.example.cafeappmvp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices.PIXEL_6
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cafeappmvp.ui.theme.BgPremium
import com.example.cafeappmvp.ui.theme.CardSurface
import com.example.cafeappmvp.ui.theme.EspressoGold

@Composable
fun PromotionsScreen(){
    Box(modifier=Modifier
        .fillMaxSize()
        .background(color= BgPremium)){
        Column(
            modifier=Modifier
                .fillMaxSize()
                .padding(vertical = 48.dp,
                    horizontal = 24.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Column(Modifier.fillMaxWidth().weight(1f)) {
                topBarPromotions()
                Spacer(Modifier.height(24.dp))
                Column(Modifier.fillMaxWidth()){
                    tapePromo()
                }
            }

            BottomNavBar()
        }
    }
}

@Composable
fun topBarPromotions(){
    Text(
        text="АКЦИИ И СКИДКИ",
        fontSize = 22.sp,
        fontWeight = FontWeight.ExtraBold,
        color=Color.White,
        letterSpacing = 1.sp

    )
}

@Composable
fun tapePromo(){
    Column(modifier=Modifier
        .fillMaxWidth()
        .background(color= CardSurface,
        RoundedCornerShape(16.dp))
        .padding(20.dp))
    {
        Text(
            text="КАЖДЫЙ 6-Й КОФЕ — БЕСПЛАТНО! \uD83C\uDF81",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color=Color.White
        )
        Spacer(Modifier.height(6.dp))
        Text(
            text="Заказывай любимые напитки в Самаре, сканируй QR-код у бариста и забирай каждый шестой флэт уайт или капучино за 0 рублей",
            fontSize = 13.sp,
            color=Color(0xFF9E9A98)
        )
    }
    Spacer(Modifier.height(16.dp))
    Column(modifier=Modifier
        .fillMaxWidth()
        .background(color= CardSurface,
            RoundedCornerShape(16.dp))
        .border(1.dp,color= EspressoGold,RoundedCornerShape(16.dp))
        .padding(20.dp))
    {
        Text(
            text="\uD83D\uDD25 ПРИВЕТСТВЕННЫЙ БОНУС",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color=Color.White
        )
        Spacer(Modifier.height(6.dp))
        Text(
            text="Дарим 450 приветственных баллов всем новым гостям! Спиши их прямо сейчас при первом заказе у бариста",
            fontSize = 13.sp,
            color=Color(0xFF9E9A98)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = PIXEL_6)
@Composable
fun dwkmsk(){
    PromotionsScreen()
}