package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.primaryLight
import com.phoenixredwolf.prodweb.theme.shadowDark
import com.phoenixredwolf.prodweb.theme.surfaceLight
import com.varabyte.kobweb.compose.css.CSSFloat
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

@Composable
fun FlipCard() {

}

private val sharedModifier3 = Modifier
    .position(Position.Absolute)
    .background(Colors.White)
    .lineHeight(300.px)
    .color(primaryLight)
    .textAlign(TextAlign.Center)
    .fontSize(60.px)
    .borderRadius(5.px)
    .visibility(Visibility.Hidden)
    .fillMaxSize()
@OptIn(ExperimentalComposeWebApi::class)
val FlipCardStyle by ComponentStyle {
    base {
        Modifier
            .position(Position.Absolute)
            .top(50.percent)
            .left(50.percent)
            .margin((-150).px)
            .float(CSSFloat.Left)
            .styleModifier {
                property("perspective", "500px")
            }
            .size(300.px)
    }
    cssRule(":hover .content") {
        Modifier
            .transform { rotateY(180.deg) }
            .transition(CSSTransition("transform", 0.5.s))
    }
}
val ContentStyle by ComponentStyle.base {
    Modifier
        .position(Position.Absolute)
        .boxShadow(0.px, 0.px, 15.px, color = shadowDark)
        .transition(CSSTransition("transform", 1.s))
        .styleModifier {
            property("transform-style", "preserve-3d")
        }
        .fillMaxSize()
}
val FrontStyle by ComponentStyle.base {
    sharedModifier3
}
@OptIn(ExperimentalComposeWebApi::class)
val BackStyle by ComponentStyle.base {
    sharedModifier3
        .background(surfaceLight)
        .color(Colors.White)
        .transform { rotateY(180.deg) }
}
