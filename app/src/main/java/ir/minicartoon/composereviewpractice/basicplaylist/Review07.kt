package ir.minicartoon.composereviewpractice.basicplaylist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

class Review07 : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var textfaildState = remember { mutableStateOf("") }
            val snackbarHostState = remember { SnackbarHostState() }
            val scope = rememberCoroutineScope()
            Scaffold(
                snackbarHost = { SnackbarHost(snackbarHostState) },
                modifier= Modifier.fillMaxSize()
            ) {

                Column {
                    TextField(
                        value = textfaildState.value,
                        onValueChange = {
                        textfaildState.value=it
                    })

                    Button(
                        onClick = {
                        scope.launch { snackbarHostState.showSnackbar(
                            message=textfaildState.value
                        ) }
                    }) {


                    }

                }
            }


        }
    }
}
