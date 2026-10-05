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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Devices.PIXEL_6
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cafeappmvp.ui.theme.BgPremium
import com.example.cafeappmvp.ui.theme.EspressoGold
import com.example.cafeappmvp.ui.theme.TextMuted

@Composable
fun AuthScreen(){
    Box(modifier=Modifier
        .fillMaxSize()
        .background(color= BgPremium))
    {
        Column(
            modifier=Modifier.fillMaxSize()
                .padding(horizontal = 24.dp,
                    vertical = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Column{
                Text(
                    text="SAMARA COFFEE STAGE",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color=Color.White,
                    letterSpacing = 1.5.sp
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text="Программа лояльности и персонализированный сервис.",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color= TextMuted
                )

            }
            Column{
                Column(modifier=Modifier
                    .clip(shape= RoundedCornerShape(16.dp))
                    .fillMaxWidth()
                    .background(color = Color(0xFF141211))
                    .padding(24.dp)
                )
                {
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        label={Text("Номер телефона")},
                        singleLine = true,
                        shape=RoundedCornerShape(12.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        colors = OutlinedTextFieldDefaults.colors(

                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedBorderColor = EspressoGold,
                            unfocusedBorderColor = Color(0xFF262220),

                            focusedLabelColor = EspressoGold,
                            unfocusedLabelColor = TextMuted
                        )
                    )


                }
                Spacer(Modifier.height(20.dp))
                Button(onClick = {},modifier=Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                    shape = RoundedCornerShape(12.dp), colors = ButtonDefaults.buttonColors(containerColor = EspressoGold)
                ) {
                    Text(
                        text="ПОЛУЧИТЬ КОД",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 15.sp,
                        color=BgPremium
                    )
                }
            }
            TextButton(onClick = {}) {
                Text(
                    text="ВХОД ДЛЯ ПЕРСОНАЛА ➔",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color=EspressoGold
                )
            }


        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = PIXEL_6)
@Composable
fun dsmks(){
    AuthScreen()
}