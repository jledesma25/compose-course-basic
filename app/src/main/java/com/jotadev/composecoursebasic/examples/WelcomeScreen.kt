package com.jotadev.composecoursebasic.examples

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jotadev.composecoursebasic.R
import com.jotadev.composecoursebasic.ui.theme.ComposeCourseBasicTheme

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.compose_header),
                contentDescription = "Compose Header",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Row {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Bienvenidos al curso de Jetpack Compose",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Black
                    ),
                    color = MaterialTheme.colorScheme.tertiary
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Aqui encontraras toda la información necesaria para aprender a como utilizar esta nueva herramienta declarativa para realizar interfaces",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontStyle = FontStyle.Italic
                ),
                color = MaterialTheme.colorScheme.tertiary
            )

            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                Button(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = "Favorite"
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "Empezar")
                }
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Divider(
                    modifier = Modifier.width(24.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )
                Text(
                    text = "Encuentranos en nuestras redes sociales",
                    modifier = Modifier.padding(4.dp),
                    color = MaterialTheme.colorScheme.tertiary
                )
                Divider(
                    modifier = Modifier.width(24.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )
            }

            val image = if(isSystemInDarkTheme()) R.drawable.pokemon2 else R.drawable.pokemon1

            Image(
                painter = painterResource(id = image),
                contentDescription = "Pokemon"
            )

            /*if(isSystemInDarkTheme()){
                Image(
                    painter = painterResource(id = R.drawable.pokemon2),
                    contentDescription = "Pokemon"
                )
            }else{
                Image(
                    painter = painterResource(id = R.drawable.pokemon1),
                    contentDescription = "Pokemon"
                )
            }*/


        }
    }
}



@Preview(name = "Welcome Light", showSystemUi = true)
@Preview(name = "Welcome Dark", showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun WelcomeScreenPreview() {
    ComposeCourseBasicTheme {
        WelcomeScreen()
    }

}