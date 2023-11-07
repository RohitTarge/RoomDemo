package com.example.roomdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.roomdemo.ui.theme.RoomDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        ScreenSetup()
                }
            }
        }
    }
}

@Composable
fun ScreenSetup(){
    MainScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
//    var productName by remember { mutableStateOf("") }
//    var quantity by remember { mutableStateOf(0) }
//    Column {
//        TextField(value = productName, onValueChange = { productName = it },
//            label = {Text("Product Name")})
//        TextField(value = quantity, onValueChange = { quantity = it },
//            label = {Text("Quantity")})
//    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RoomDemoTheme {

    }
}