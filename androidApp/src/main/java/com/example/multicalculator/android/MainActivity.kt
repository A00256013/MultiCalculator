package com.example.multicalculator.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multicalculator.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingView(Greeting().greet())

                    // Call the CalcView function and display its result
                    CalcDisplay(CalcView())

                    // Call the CalcNumericButton function to create numeric buttons
                    Row {
                        CalcNumericButton(number = 1) {
                            // Handle button click for 1
                        }
                        CalcNumericButton(number = 2) {
                            // Handle button click for 2
                        }
                        // Add more buttons as needed
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Composable
fun CalcView(): String {
    // Perform your calculations or operations here
    return "Calculations result"
}

@Composable
fun CalcRow(value: String) {
    Text(text = value)
}

@Composable
fun CalcDisplay(calculation: String) {
    Text(text = calculation)
}

@Composable
fun CalcNumericButton(number: Int, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = number.toString())
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
