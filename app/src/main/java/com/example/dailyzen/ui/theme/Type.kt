package com.example.dailyzen.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dailyzen.data.model.AgileFont

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)
val AppTypography = Typography(

    // 👑 App Title (e.g. "DailyZen")
    displayLarge = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp,
        lineHeight = 38.sp,
        letterSpacing = 0.sp
    ),

// 🏷️ Section Title / Headings (e.g. "Welcome Back, Kushagra", "Daily Task", "Cycling")
    titleLarge = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.6.sp
    ),

// 💬 Subheading / Label Text (e.g. "I am Feeling", "Make the day count!!")
    titleMedium = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.15.sp
    ),

// 📖 Body Text (e.g. longer descriptions or smaller info)
    bodyLarge = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),

// 🔢 Emphasis Numbers / Metrics (e.g. "128", "26", "10")
    headlineSmall = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

// ⚙️ Bottom Navigation & Small Labels (e.g. “home”, “analytics”)
    labelSmall = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.3.sp
    ),

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */



    // 🗓️ Month and Year (e.g. "October 2025")
    displayMedium = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = (22.sp * 1.2f), // 1.2x for balance
        letterSpacing = 0.sp
    ),

    // 🧭 Day Labels (Mon, Tue, Wed, etc.)
    titleSmall = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = (14.sp * 1.2f),
        letterSpacing = 0.1.sp
    ),

    // 🔢 Date Numbers (1–31)
    bodyMedium = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = (16.sp * 1.2f),
        letterSpacing = 0.1.sp
    ),

    // 📍 Small Notes or Subtext (like mood or task count under date)
    labelMedium = TextStyle(
        fontFamily = AgileFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = (12.sp * 1.2f),
        letterSpacing = 0.25.sp
    ),
)