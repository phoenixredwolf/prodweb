package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.sections.about.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode

@Page
@Composable
fun AboutPage() {
    val title = "About Us - Your Trusted Partner in Digital Solutions | Phoenixredwolf DS"
    val description = "Discover the story behind PhoenixRedwolf Digital Services – a leading provider of web development, software solutions, and digital services. Learn about our mission, expertise, and commitment to transforming ideas into powerful realities."
    val breakpoint = rememberBreakpoint()
    val colorMode by ColorMode.currentState

    PageLayout(title, description) {

        Column(
                modifier = Modifier
                    .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
        ) {
        Empower(breakpoint = breakpoint, colorMode = colorMode)
        Innovate(breakpoint = breakpoint, colorMode = colorMode)
        Collaborate(breakpoint = breakpoint, colorMode = colorMode)
        Citizenship(breakpoint = breakpoint, colorMode = colorMode)
        Success(breakpoint = breakpoint, colorMode = colorMode)


        }
    }
}
