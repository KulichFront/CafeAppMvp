package com.example.cafeappmvp.screens

import androidx.benchmark.traceprocessor.Row
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun MenuScreen(){
    Box(modifier=Modifier.fillMaxSize().background(color= BgPremium)){
        Column(
            modifier=Modifier
                .fillMaxSize()
                .padding(vertical = 48.dp,
                    horizontal = 24.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ){
            Column(Modifier.fillMaxWidth().weight(1f))
            {
                topBarMenu()
                Spacer(Modifier.height(20.dp))
                listCategoryMenu()
                listMenuItems()
            }
            BottomNavBar()
        }
    }
}


@Composable
fun topBarMenu(){
    Text(
        text="КАТАЛОГ МЕНЮ",
        fontSize = 22.sp,
        fontWeight = FontWeight.ExtraBold,
        color=Color.White,
        letterSpacing = 1.sp
    )
}

@Composable
fun listCategoryMenu(){
    val categories=mutableListOf("Кофе","Выпечка","Десерты")

    LazyRow(Modifier.fillMaxWidth()) {
        for(category in categories)(
            item(category){
                Box(
                    modifier=Modifier
                        .height(36.dp)
                        .width(100.dp)
                        .padding(horizontal = 16.dp)
                        .background(color= CardSurface,
                            RoundedCornerShape(16.dp))
                        .border(1.dp,color= EspressoGold,RoundedCornerShape(16.dp)),

                    contentAlignment = Alignment.Center

                ){
                    Text(
                        text=category,
                        color=Color(0xFF9E9A98)

                    )
                    Spacer(Modifier.width(8.dp))
                }
            })

    }
}

@Composable
fun listMenuItems(){
    Spacer(Modifier.height(24.dp))
    val menuItems=mutableListOf("Капучино", "Флэт Уайт", "Латте Макиато")
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        for(itemmenu in menuItems){
            item(itemmenu){
                Row(modifier=Modifier
                    .fillMaxWidth()
                    .background(color=CardSurface,RoundedCornerShape(12.dp))
                    .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically)
                {
                    Text(
                        text=itemmenu,
                        fontSize=16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color=Color.White
                    )
                    Text(
                        text="240 ₽",
                        fontSize=16.sp,
                        fontWeight = FontWeight.Bold,
                        color=EspressoGold
                    )
                }
                Spacer(Modifier.height(12.dp))
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = PIXEL_6)
@Composable
fun sjdsnfkd(){
    MenuScreen()
}