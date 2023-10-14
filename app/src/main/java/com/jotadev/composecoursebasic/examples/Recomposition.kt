package com.jotadev.composecoursebasic.examples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise01() {

    var text by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
        }
    )

}

@Composable
@Preview(showSystemUi = true)
fun Exercise01Preview() {
    Exercise01()
}

@Composable
fun CounterContent() {

    var counter by remember {
        mutableStateOf(0)
    }
    var isEnabled by remember{
        mutableStateOf(true)
    }

    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

        Button(onClick = { isEnabled = !isEnabled }) {
            Text(text = "Habilitar y Deshabilitar")
        }
        Button(
            onClick = { counter++ },
            enabled = isEnabled
        ) {
            Text(text = "+")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "$counter", fontSize = 18.sp)
        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = { counter-- }) {
            Text(text = "-")
        }
        
    }

}

@Composable
@Preview(showSystemUi = true)
fun CounterContentPreview() {
    CounterContent()
}