package com.tomato.composeanimationdisney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tomato.composeanimationdisney.ui.theme.DisneyPlusLogoAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisneyPlusLogoAnimationTheme {
                // A surface container using the 'background' color from the theme
                DisneyLogoAnimation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DisneyPlusLogoAnimationTheme {
        DisneyLogoAnimation()
    }
}