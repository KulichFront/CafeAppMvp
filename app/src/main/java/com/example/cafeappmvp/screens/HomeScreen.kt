package com.example.cafeappmvp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices.PIXEL_6
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cafeappmvp.ui.theme.BgPremium
import com.example.cafeappmvp.ui.theme.CardSurface
import com.example.cafeappmvp.ui.theme.EspressoGold

@Composable
fun HomeScreen(){
    Box(modifier=Modifier
        .fillMaxSize()
        .background(color = BgPremium)){
        Column(
            modifier=Modifier
                .fillMaxSize()
                .padding(vertical = 48.dp, horizontal = 24.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            HomeTopBar()
            LiveCard()
            AboutCafeBlock()
            SeasonVibe()
            BottomNavBar()
        }
    }
}

@Composable
fun HomeTopBar(){
    Column(horizontalAlignment = Alignment.Start) {
        Text(
            text="Привет, Иван ☕",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color=Color.White
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text="Твой кэшбэк обновлен секунду назад",
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            color=Color(0xFF9E9A98)
        )
    }
}
@Composable
fun LiveCard(){
    Column(
        modifier=Modifier
            .fillMaxWidth()
            .background(color= CardSurface
                , shape = RoundedCornerShape(16.dp))
            .border(1.dp,color= EspressoGold, shape = RoundedCornerShape(16.dp))
            .padding(24.dp)
    ){
        Text(
            text="БАЛАНС КЭШБЭКА",
            fontSize = 12.sp,
            fontWeight = FontWeight.ExtraBold,
            color=Color(0xFF9E9A98)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text="450 БОНУСОВ",
            fontSize = 32.sp,
            fontWeight = FontWeight.ExtraBold,
            color=Color.White

        )
        Spacer(Modifier.height(16.dp))
        Row(modifier=Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Text(
                text="Списать при покупке",
                fontSize = 14.sp,
                color=EspressoGold,

            )
            Switch(checked = false, onCheckedChange = {})
        }

    }
}

@Composable
fun SeasonVibe(){
    val names=mutableListOf<String>("Бамбл кофе","Эспрессо Тоник","Черничный Тарт")
    Column(Modifier.fillMaxWidth())
    {
        Text(
            text="СЕЗОННЫЕ НОВИНКИ",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp,
            color=Color.White
        )
        Spacer(Modifier.height(16.dp))
        LazyRow(modifier = Modifier.fillMaxWidth()){
            for(i in names){
                item(i){
                    Box(
                        modifier=Modifier.width(140.dp).height(80.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(color=CardSurface),
                        contentAlignment = Alignment.Center

                        ){
                        Text(
                            text=i,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color=Color.White,
                            modifier = Modifier.wrapContentSize(Alignment.Center)

                        )
                    }
                    Spacer(Modifier.width(12.dp))
                }
            }

        }
    }
}

@Composable
fun AboutCafeBlock(){
    Column(modifier=Modifier
        .fillMaxWidth()
        .background(color=CardSurface,RoundedCornerShape(12.dp))
        .padding(16.dp))
    {
        Text(
            text="О НАШЕМ КАФЕ",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color=Color(0xFF9E9A98)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text="\uD83D\uDCCD Самара, ул. Куйбышева, 1283737",
            fontSize=14.sp,
            fontWeight = FontWeight.Medium,
            color=Color.White
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text="\uD83D\uDD52 Каждый день с 08:00 до 22:00",
            fontSize = 14.sp,
            color=EspressoGold
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = PIXEL_6)
@Composable
fun dkasms(){
    HomeScreen()
}