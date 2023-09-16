package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.sections.about.*
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerDark
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerLight
import com.phoenixredwolf.prodweb.theme.shadowDark
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun AboutPage() {
    val title = "About Us - Your Trusted Partner in Digital Solutions | Phoenixredwolf DS"
    val description = "Discover the story behind PhoenixRedwolf Digital Services – a leading provider of web development, software solutions, and digital services. Learn about our mission, expertise, and commitment to transforming ideas into powerful realities."
    val breakpoint = rememberBreakpoint()

    PageLayout(title, description) {

        Column(
                modifier = Modifier
                    .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
        ) {
        Empower()
        Innovate(breakpoint = breakpoint)
        Collaborate()
        Citizenship(breakpoint = breakpoint)
        Success()


        }
    }
}

val AboutTitlePStyle by ComponentStyle {
    base {
        Modifier
            .textAlign(TextAlign.Center)
            .fillMaxWidth(90.percent)
            .fontSize(25.px)
            .fontWeight(FontWeight.SemiBold)
            .color(if (colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
    }
    Breakpoint.LG {
        Modifier
            .fontSize(45.px)
    }
}

val AboutBodyPStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Justify)
            .margin(left = 5.px, right = 5.px)
            .fontSize(15.px)
    }
    Breakpoint.MD {
        Modifier
            .textAlign(TextAlign.End)
            .margin(left = 10.px, right = 0.px)
    }
    Breakpoint.LG {
        Modifier
            .fontSize(25.px)
    }
}

val AboutImageStyle by ComponentStyle.base() {
    Modifier
        .fillMaxWidth(80.percent)
        .borderRadius(10.percent)
        .borderBottom(3.px, LineStyle.Solid, shadowDark)
        .borderRight(3.px, LineStyle.Solid, shadowDark)
        .boxShadow(5.px, 5.px, blurRadius = 10.px, color = shadowDark)
}

val AboutSpanStyle by ComponentStyle.base() {
    Modifier
        .color(if (colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
        .fontWeight(FontWeight.SemiBold)
}