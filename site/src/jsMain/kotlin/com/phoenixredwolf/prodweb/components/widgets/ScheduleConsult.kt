package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Constants
import com.phoenixredwolf.prodweb.utility.Constants.CONTACT
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun ScheduleConsult() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        A(
            attrs = ScheduleRowStyle.toModifier()
                .attrsModifier {
                    attr("href", CONTACT)
                }
                .toAttrs()
        ) {
            H3(
                attrs = Modifier.toAttrs(),
                content = {
                    Link(
                        modifier = ScheduleContactLinkStyle.toModifier(),
                        path = Constants.CONTACT,
                        text = "Schedule a call"
                    )
                    Br()
                    Text("For A Quote Today!!!")
                }
            )
        }
    }
}

val ScheduleRowStyle by ComponentStyle {
    base {
        Modifier
            .backgroundColor(if (colorMode == ColorMode.LIGHT) primaryLight else primaryDark)
            .borderRadius(10.px)
            .textDecorationLine(TextDecorationLine.None)
            .padding(10.px)
            .margin(leftRight = 20.px, topBottom = 30.px)
            .color(if(colorMode == ColorMode.LIGHT) onSecondaryLight else onSecondaryDark)
            .cursor(Cursor.Pointer)
            .transition(
                CSSTransition(property = "all", duration = 200.ms)
            )
    }
    hover {
        Modifier
            .textDecorationLine(TextDecorationLine.None)
            .backgroundColor(secondaryContainerDark)
            .color(if(colorMode == ColorMode.LIGHT) onSecondaryContainerDark else onSecondaryContainerLight)
            .borderRight(2.px, LineStyle.Solid, color = Colors.Black)
            .borderBottom(2.px, LineStyle.Solid, color = Colors.Black)
            .boxShadow(5.px, 5.px, blurRadius = 8.px, color = shadowDark)

    }
}

val ScheduleH3Style by ComponentStyle {
    base {
        Modifier
    }
}

val ScheduleContactLinkStyle by ComponentStyle {
    base {
        Modifier
            .color(onSurfaceDark)
            .fontWeight(FontWeight.SemiBold)
            .fontSize(FontSize.Large)
            .textDecorationLine(TextDecorationLine.None)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT) onPrimaryContainerDark else onPrimaryContainerLight)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT) onTertiaryContainerDark else onTertiaryContainerDark)
    }
    (Breakpoint.MD + anyLink) {
        Modifier
            .fontSize(FontSize.XXLarge)
    }
}