package com.example.businesscardsultani

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Contact() {
    Column(
        modifier = Modifier.fillMaxWidth().wrapContentSize(
            Alignment.BottomEnd
        ),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContactItem(
            icon = R.drawable.baseline_call_24,
            info = "+62 821-9317-9080"
        )
        ContactItem(
            icon = R.drawable.baseline_account_circle_24,
            info = "@ahmadsultanid"
        )
        ContactItem(
            icon = R.drawable.baseline_mail_24,
            info = "ahmadsultanxyz@gmail.com"
        )
    }
}