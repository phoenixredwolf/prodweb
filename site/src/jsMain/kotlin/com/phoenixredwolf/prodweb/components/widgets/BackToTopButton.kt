package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.*
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerDark
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerLight
import com.phoenixredwolf.prodweb.theme.primaryGradient
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun BackToTopButton(){
    var scroll: Double? by remember { mutableStateOf(null) }

    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll", callback = {
            scroll = document.documentElement?.scrollTop
        })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .pointerEvents(PointerEvents.None),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Box(
            modifier = BackToTopButtonStyle.toModifier()
                .visibility(
                    if(scroll != null && scroll!! > 400.0) Visibility.Visible
                    else Visibility.Hidden
                )
                .onClick {
                    document.documentElement?.scroll(x = 0.0, y = 0.0)
                },
            contentAlignment = Alignment.Center
        ) {
            FaArrowUp(
                modifier = ArrowStyle.toModifier(),
                size = IconSize.LG
            )
        }
    }
}

val BackToTopButtonStyle by ComponentStyle {
    base {
        Modifier
            .backgroundImage(primaryGradient)
            .size(50.px)
            .opacity(85.percent)
            .borderRadius(20.percent)
            .margin(right = 25.px, bottom = 25.px)
            .cursor(Cursor.Pointer)
            .pointerEvents(PointerEvents.Auto)
            .transition(CSSTransition(property = "rotate", duration = 300.ms))
    }
    hover {
        Modifier
            .boxShadow(3.px, 3.px, blurRadius = 8.px, color = Colors.Black)
    }
    Breakpoint.SM {
        Modifier
            .margin(right = 40.px, bottom = 40.px)
    }
}

val ArrowStyle by ComponentStyle {
    base {
        Modifier
            .opacity(100.percent)
            .color( if(colorMode == ColorMode.LIGHT) onPrimaryContainerDark else onPrimaryContainerLight)
            .zIndex(2)
    }
}