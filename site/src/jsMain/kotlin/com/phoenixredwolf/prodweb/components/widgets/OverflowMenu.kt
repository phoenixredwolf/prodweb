package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.*
import com.phoenixredwolf.prodweb.components.sections.NavButtonVariant
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.dom.ElementTarget
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.overlay.PopupPlacement
import com.varabyte.kobweb.silk.components.overlay.Tooltip
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*

@Composable
fun OverflowMenu(onMenuClosed: () -> Unit) {
    val scope = rememberCoroutineScope()
    val breakpoint = rememberBreakpoint()
    var translateX by remember { mutableStateOf( (-100).percent ) }
    var opacity by remember { mutableStateOf(0.percent) }
    var colorMode by ColorMode.currentState

    LaunchedEffect(breakpoint) {
        translateX = 0.percent
        opacity = 100.percent
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.vh)
            .position(Position.Fixed)
            .zIndex(2)
            .opacity(opacity)
            .backgroundImage(primaryGradient)
            .transition(CSSTransition(property = "opacity", duration = 500.ms))
            .onClick {
                scope.launch {
                    translateX = (-100).percent
                    opacity = 0.percent
                    delay(250)
                    onMenuClosed()
                }
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(all = 25.px)
                .width(60.percent)
                .overflow(Overflow.Auto)
                .scrollBehavior(ScrollBehavior.Smooth)
                .backgroundColor(if (colorMode == ColorMode.LIGHT) primaryContainerLight else primaryContainerDark)
                .translateX(tx = translateX)
                .transition(CSSTransition(property = "translate", duration = 500.ms))
        ) {
            Row(
                modifier = Modifier.margin(bottom = 25.px).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaXmark(
                    modifier = Modifier
                        .cursor(Cursor.Pointer)
                        .margin(right = 20.px, bottom = 3.px)
                        .onClick {
                            scope.launch {
                                translateX = (-100).percent
                                opacity = 0.percent
                                delay(500)
                                onMenuClosed()
                            }
                        },
                    size = IconSize.LG
                )
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        modifier = Modifier.size(150.px),
                        src = Res.Image.logo2,
                        desc = "PhoenixRedwolf Digital Services Icon"
                    )
                }
            }
            Link(
                path = "/",
                text = "Home",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 10.px)
            )
            Link(
                path = "",
                text = "Services",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "",
                text = "Consulting",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "",
                text = "About",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Link(
                path = "",
                text = "Contact",
                modifier = LinkBaseStyle.toModifier()
                    .padding(topBottom = 5.px)
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom
            ) {
                Button(
                    onClick = { colorMode = colorMode.opposite },
                    NavItemStyle.toModifier(NavButtonVariant)
                ) {
                    Box(Modifier.margin(8.px)) {
                        when (colorMode) {
                            ColorMode.LIGHT -> FaMoon()
                            ColorMode.DARK -> FaSun()
                        }
                    }
                }
                Tooltip(ElementTarget.PreviousSibling, "Toggle color mode", placement = PopupPlacement.BottomRight)

            }
        }
    }
}