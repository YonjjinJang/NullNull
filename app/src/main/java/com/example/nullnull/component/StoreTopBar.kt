package com.example.nullnull.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nullnull.R

@Composable
fun StoreTopBar(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Black)
            .padding(8.dp),

        ) {
        Row(
            verticalAlignment = CenterVertically
        ) {
            Image(
                modifier = Modifier.size(40.dp),
                painter = painterResource(R.drawable.outline_android_24),
                contentDescription = "",
            )

            Spacer(Modifier.size(10.dp))

            Text(
                text = "NullNull",
                color = Color.White,
                fontSize = 20.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(2.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "족발",
                // TODO 컬러 및 폰트 사이즈 수정
                color = Color.White
            )

            Text(
                text = "과",
                color = Color.White
            )

            Text(
                text = "보쌈",
                // TODO 컬러 및 폰트 사이즈 수정
                color = Color.White
            )

            Text(
                text = "리스트",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun StoreTopBarPreview() {
    StoreTopBar(
        modifier = Modifier.fillMaxWidth()
    )
}
