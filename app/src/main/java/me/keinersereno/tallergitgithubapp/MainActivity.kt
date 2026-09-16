package me.keinersereno.tallergitgithubapp

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fitInside
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.keinersereno.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                }
            }
        }




@Preview(showBackground = true)
@Composable
fun primera_pantalla() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
            Spacer(modifier = Modifier.height((25.dp)))
            Image(
                painter = painterResource(R.drawable.micara),
                contentDescription = "foto de perfil",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(
                        width = 4.dp,
                        color = Color.Blue
                    )
            )
            Text(
                text = "keiner sereno",
                fontSize = 27.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()

            )
            Text(
                text = "ing.sistemas",
                fontSize = 27.sp,
                color = Color.Cyan,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier


            )
        Text(
            text = "--------------------------------",
            fontSize = 27.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    all = 25.dp
                )

        )
        Text(
            text = "Edad",
            fontSize = 25.sp,
            color = Color.Gray,

            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    horizontal = 25.dp
                )
                .fillMaxWidth()
        )
        Text(
            text = "19 años",
            fontSize = 27.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(
                    horizontal = 25.dp
                )
                .fillMaxWidth()
        )
        Text(
            text = "correo",
            fontSize = 25.sp,
            color = Color.Gray,

            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    horizontal = 25.dp
                )
                .fillMaxWidth()
        )
        Text(
            text = "[email protected]",
            fontSize = 27.sp,
            color = Color.Blue,
            modifier = Modifier
                .padding(
                    horizontal = 25.dp
                )
                .fillMaxWidth()
        )
        Text(
            text = "ciudad",
            fontSize = 25.sp,
            color = Color.Gray,

            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    horizontal = 25.dp
                )
                .fillMaxWidth()
        )
        Text(
            text = "Flordiablanca, Colombia",
            fontSize = 27.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(
                    horizontal = 25.dp
                )
                .fillMaxWidth()
        )
        Text(
            text = "--------------------------------",
            fontSize = 27.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    all = 25.dp
                )

        )
    }
}

