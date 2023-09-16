package com.phoenixredwolf.prodweb.theme

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.keywords.auto

// Links
val LinkBaseStyle by ComponentStyle {
    base {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
            .fontWeight(FontWeight.SemiBold)
            .fontSize(FontSize.Large)
            .textDecorationLine(TextDecorationLine.None)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT) onSecondaryContainerDark else onTertiaryContainerDark)
    }
}

// Navigation
val NavItemStyle by ComponentStyle {
    base {
        Modifier
            .color(onPrimaryContainerLight)
            .fontWeight(FontWeight.SemiBold)
            .fontSize(FontSize.Large)
            .textDecorationLine(TextDecorationLine.None)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(onPrimaryContainerLight)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier
            .color(onTertiaryContainerLight)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val NavStyle by ComponentStyle{
    base {
        Modifier
            .fillMaxWidth()
            .display(DisplayStyle.Flex)
            .fontWeight(FontWeight.SemiBold)
            .fontSize(FontSize.Large)
            .justifyContent(JustifyContent.SpaceBetween)
    }
        cssRule(".navbar") {
        Modifier
            .display(DisplayStyle.Flex)
    }
    cssRule(".nav-bar .navbaritem") {
        Modifier
            .listStyle(ListStyleType.None)
            .borderRadius(r = 10.px)
            .padding(leftRight =  20.px)
    }
    cssRule(".navbar .navbaritem .dropdown") {
        Modifier
            .position(Position.Absolute)
            .display(DisplayStyle.None)
            .top(100.percent)
            .right(0.px)
            .overflow { y(Overflow.Hidden) }
    }
    cssRule(".dropdown .services") {
        Modifier
            .position(Position.Absolute)
            .right((-100).px)
            .width(Width.MaxContent)
            .backgroundColor(surfaceLight)
            .padding(5.px)
            .borderRadius(10.px)
            .height(0.px)
            .overflow(Overflow.Hidden)
            .visibility(Visibility.Hidden)
    }
    cssRule(".dropdown:hover .services") {
        Modifier
            .height(Height.MinContent)
            .margin(top = 60.px)
            .visibility(Visibility.Visible)
            .overflow(Overflow.Hidden)
    }
    cssRule(".navbar .dropdown:hover .services") {
        Modifier
            .height(Height.MinContent)
            .margin(top = 20.px)
            .visibility(Visibility.Visible)
            .overflow(Overflow.Hidden)
    }
    cssRule(".dropdown .services .dropitems") {
        Modifier
            .top(100.percent)
            .margin(bottom = 5.px)
    }
    cssRule(".navbar .dropdown:after") {
        Modifier
            .content("")
            .position(Position.Absolute)
            .right((-5).px)
            .top(8.px)
            .cursor(Cursor.Pointer)
            .transform { rotate((-45).deg) }
            .borderLeft(2.px, LineStyle.Solid, Colors.Black)
            .borderBottom(2.px, LineStyle.Solid, Colors.Black)
            .transition(CSSTransition("all", 0.2.s, TransitionTimingFunction.EaseIn))
            .size(7.px)
    }
    cssRule(".navbar .dropdown:hover:after") {
        Modifier
            .transform { rotate(135.deg) }
    }
}

// Dropdowns
val Dropdowncardstyle by ComponentStyle {
    base {
        Modifier
            .backgroundColor(surfaceLight)
            .border(0.px)
            .margin(topBottom = 5.px)
            .borderRadius(10.px)
            .height(Height.MinContent)
            .padding(10.px)
            .fillMaxWidth()
            .transition(
                CSSTransition(property = "backgroundColor", duration = 500.ms),
                CSSTransition(property = "boxShadow", duration = 500.ms)
            )
    }
    hover {
        Modifier
            .boxShadow(3.px, 3.px, blurRadius = 5.px, color = Colors.DarkGray)
    }
}

// Services
val ServicePHeadingStyle by ComponentStyle {
    base {
        Modifier
            .fontWeight(FontWeight.SemiBold)
            .textAlign(TextAlign.Justify)
            .zIndex(1)
            .fillMaxWidth()
    }
    Breakpoint.MD {
        Modifier
            .fillMaxWidth(40.percent)
    }

}

val ServiceCBRowStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .margin(bottom = 25.px)
            .transition(CSSTransition("all", duration = 500.ms))
    }
    Breakpoint.MD {
        Modifier
            .fillMaxWidth(40.percent)
    }
}

val ServiceH1Style by ComponentStyle {
    base {
        Modifier
            .width(100.percent)
            .textAlign(TextAlign.Center)
            .fontWeight(FontWeight.SemiBold)
            .zIndex(1)
            .color(if (colorMode == ColorMode.LIGHT) primaryLight else primaryDark)
            .transition(CSSTransition("all", duration = 500.ms))
    }
    Breakpoint.MD {
        Modifier
            .width(Width.FitContent)
            .textAlign(TextAlign.Start)
    }
}

val ServiceImageStyle by ComponentStyle {
    base {
        Modifier
            .margin(top = (-30).px)
            .width(100.percent)
            .opacity(50.percent)
            .height(auto)
            .transition(CSSTransition("all", duration = 500.ms))
    }
    Breakpoint.MD {
        Modifier
            .borderRadius(bottomLeft = 50.percent)
            .margin(top = (-30).px)
            .maxWidth(50.percent)
            .opacity(100.percent)
            .height(auto)
    }
}

val ServiceH3Style by ComponentStyle {
    base {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT) secondaryLight else secondaryDark)
    }
}

val ServiceH5Style by ComponentStyle {
    base {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT)tertiaryLight else tertiaryDark)
            .padding(bottom = 10.px)
            .textAlign(TextAlign.Center)
    }
}



val ServiceBPStyle by ComponentStyle {
    base {
        Modifier
            .gridColumn(1,2)
    }
    Breakpoint.MD {
        Modifier
            .gridColumn(2,5)
    }
}

val ServiceColumnStyle by ComponentStyle {
    base {
        Modifier
            .width(100.percent)
            .padding(10.px)
            .margin(topBottom = 10.px)
            .fillMaxHeight()
            .boxShadow(3.px,3.px, blurRadius = 8.px, color = Colors.Black)
            .borderRadius(r = 20.px)
            .transition(CSSTransition("all", duration = 500.ms))
    }
    Breakpoint.MD {
        Modifier
            .width(90.percent)

    }
}