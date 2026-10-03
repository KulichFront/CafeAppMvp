package com.example.cafeappmvp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices.PIXEL_6
import androidx.compose.ui.tooling.preview.Preview
import com.example.cafeappmvp.navigation.NavGraph
import com.example.cafeappmvp.screens.InfoScreen
import com.example.cafeappmvp.ui.theme.CafeAppMvpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CafeAppMvpTheme {
                NavGraph()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi =true, device = PIXEL_6)
@Composable
fun GreetingPreview() {
    CafeAppMvpTheme {
        InfoScreen ({})
    }
}