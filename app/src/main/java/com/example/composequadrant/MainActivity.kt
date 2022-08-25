package com.example.composequadrant

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import com.example.composequadrant.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background){
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            take_text(
                art = stringResource(id = R.string.first_art),
                descripion = stringResource(id = R.string.first_text),
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Green

            )
            take_text(
                art = stringResource(id = R.string.second_art),
                descripion = stringResource(id = R.string.second_text),
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Yellow
            )
        }
        Row(Modifier.weight(1f)) {
            take_text(
                art = stringResource(id = R.string.third_art),
                descripion = stringResource(id = R.string.third_text),
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Cyan
            )
            take_text(
                art = stringResource(id = R.string.fifth_art),
                descripion = stringResource(id = R.string.fifth_text),
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Gray
            )
        }
    }
    ExtendedFloatingActionButton(
        onClick = { /* ... */ },
        contentColor = Color.Red,

                icon = {
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Favorite",
                modifier = Modifier.size(50.dp)

            )
        },
        text = { Text("Like", modifier = Modifier.size(50.dp)) }
    )
}


    @Composable
fun take_text(art:String,
              descripion:String,
              modifier: Modifier = Modifier,
              backgroundColor: Color
) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(backgroundColor)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = art,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descripion,
            textAlign = TextAlign.Justify
        )

    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Screen()

    }
}