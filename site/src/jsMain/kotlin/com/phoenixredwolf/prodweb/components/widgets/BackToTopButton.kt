package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.*
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerDark
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerLight
import com.phoenixredwolf.prodweb.theme.primaryContainerDark
import com.phoenixredwolf.prodweb.theme.primaryContainerLight
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*

@Composable
fun BackToTopButton(){
    val breakpoint = rememberBreakpoint()
    var scroll: Double? by remember { mutableStateOf(null) }
    val colorMode by ColorMode.currentState

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
                .size(50.px)
                .visibility(
                    if(scroll != null && scroll!! > 400.0) Visibility.Visible
                    else Visibility.Hidden
                )
                .borderRadius(20.percent)
                .margin(
                    right = if(breakpoint <= Breakpoint.SM) 25.px else 40.px,
                    bottom = if(breakpoint <= Breakpoint.SM) 25.px else 40.px
                )
                .backgroundColor(if(colorMode == ColorMode.LIGHT) primaryContainerDark else primaryContainerLight)
                .cursor(Cursor.Pointer)
                .pointerEvents(PointerEvents.Auto)
                .onClick {
                    document.documentElement?.scroll(x = 0.0, y = 0.0)
                },
            contentAlignment = Alignment.Center
        ) {
            FaArrowUp(
                modifier = Modifier.color(
                    if(colorMode == ColorMode.LIGHT) onPrimaryContainerDark else onPrimaryContainerLight
                ),
                size = IconSize.LG
            )
        }
    }
}

val BackToTopButtonStyle by ComponentStyle {
    base {
        Modifier
            .rotate(a = 0.deg)
            .transition(CSSTransition(property = "rotate", duration = 300.ms))
    }
    hover {
        Modifier.rotate(0.deg)
    }
}