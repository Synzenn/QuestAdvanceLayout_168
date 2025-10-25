package com.example.questadvancelayout_168

import androidx.compose.foundation.Image
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questadvancelayout_168.ui.theme.PrimaryBackground
import com.example.questadvancelayout_168.ui.theme.MenuCardBg
import com.example.questadvancelayout_168.ui.theme.IconCircleBg
import com.example.questadvancelayout_168.ui.theme.TextPrimary
import com.example.questadvancelayout_168.ui.theme.TextSecondary
import com.example.questadvancelayout_168.ui.theme.CopyrightText
import com.example.questadvancelayout_168.ui.theme.SocialIconBg


@Composable
fun Aktivitaskedua(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .padding(top = 48.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.jihyo),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.White)
        )

}

