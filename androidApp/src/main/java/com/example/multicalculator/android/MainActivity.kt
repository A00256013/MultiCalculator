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
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
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
                        // Add more numeric buttons as needed
                    }

                    // Call the CalcOperationButton function to create operation buttons
                    Row {
                        CalcOperationButton(operation = "+") {
                            // Handle button click for addition
                        }
                        CalcOperationButton(operation = "-") {
                            // Handle button click for subtraction
                        }
                        // Add more operation buttons as needed
                    }

                    // Call the CalcEqualsButton function to create the "=" button
                    CalcEqualsButton {
                        // Handle button click for calculating the result
                    }
                }
            }
        }
    }

    private fun CalcEqualsButton(onClick: () -> Unit) {

    }
}
@Composable
fun CalcView() {

}

@Composable
fun CalcDisplay(calcView: Any) {

}
@composable
fun CalcOperationButton(operation: String, function: () -> Unit) {

}
@composable
fun CalcNumericButton(number: Int, function: () -> Unit) {

}

@Composable
fun CalcEqualsButton(display: MutableState<String>, onClick: () -> Unit) {
    Button(
        onClick = {
            display.value = "0" // Set the display value to "0"
            onClick()
        },
        modifier = Modifier.padding(4.dp) // Add padding of 4 dp
    ) {
        Text(text = "=")
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}