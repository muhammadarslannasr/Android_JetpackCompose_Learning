package com.example.jetpackcompose_learning.utils

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.jetpackcompose_learning.R

class Utils {

    companion object {
        val fontFamily = FontFamily(
            Font(R.font.lexend_thin, FontWeight.Thin),
            Font(R.font.lexend_light, FontWeight.Light),
            Font(R.font.lexend_regular, FontWeight.Normal),
            Font(R.font.lexend_medium, FontWeight.Medium),
            Font(R.font.lexend_semibold, FontWeight.SemiBold),
            Font(R.font.lexend_bold, FontWeight.Bold),
            Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
        )
    }
}