package com.example.jetpackcompose_learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_learning.ui.theme.JetPackCompose_LearningTheme

class ListViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // scrolling via Column and adding a for loop in column
//            val verticalScrollState = rememberScrollState()
//            Column(modifier = Modifier.verticalScroll(verticalScrollState)) {
//                for (i in 1..10){
//                    Text(text = "item $i",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(24.dp),
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 24.sp
//                    )
//                }
//            }

            // Scrolling via Lazy Column and adding static count in here
//            LazyColumn {
//                items(count = 5000) {
//                    Text(text = "item $it",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(24.dp),
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 24.sp
//                    )
//                }
//            }

            // Scrolling via Lazy Column and adding a list
            LazyColumn{
                itemsIndexed(
                    listOf("Muhammad", "Arslan", "Nasr", "Mobile Developer")
                ){ _, item ->
                    Text(text = item,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                }
            }


        }
    }
}