package com.example.businesscardsultani

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardsultani.ui.theme.darkGreen
import com.example.businesscardsultani.ui.theme.lightGreen
import com.example.businesscardsultani.ui.theme.transparentBlack

@Composable
fun About(
    name: String,
    title: String,
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontFamily = FontFamily.SansSerif,
            color = transparentBlack,
            fontSize = 36.sp,
            fontWeight = FontWeight.Light,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = title,
            fontFamily = FontFamily.SansSerif,
            color = darkGreen,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}