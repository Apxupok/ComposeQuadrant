package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

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