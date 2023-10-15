package com.example.businesscardsultani

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardsultani.ui.theme.darkGreen
import com.example.businesscardsultani.ui.theme.transparentBlack

@Composable
fun ContactItem(icon: Int, info: String) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null, // Provide a proper description
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(darkGreen)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = info,
                color = transparentBlack,
                fontSize = 12.sp,
                modifier = Modifier.width(160.dp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
}