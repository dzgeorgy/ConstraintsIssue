package ru.dzgeorgy.constraintsissue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.dzgeorgy.constraintsissue.ui.theme.ConstraintsIssueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConstraintsIssueTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box {
                        Form()
                    }
                }
            }
        }
    }
}

@Composable
private fun Form() {
    var login by rememberSaveable {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .width(IntrinsicSize.Max)
    ) {
        OutlinedTextField(
            value = login,
            onValueChange = { login = it },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Outlined.Person,
//                    contentDescription = null
//                )
//            }
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Log In")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ConstraintsIssueTheme {
    }
}