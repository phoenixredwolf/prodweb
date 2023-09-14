package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.models.Consulting
import com.phoenixredwolf.prodweb.components.models.Services
import com.phoenixredwolf.prodweb.theme.onPrimaryLight
import com.phoenixredwolf.prodweb.theme.primaryGradient
import com.phoenixredwolf.prodweb.theme.secondaryGradient
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import kotlinx.browser.window
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceCard(
    services: Services? = null,
    consulting: Consulting? = null
) {
    val service = services ?: consulting
    if (service != null) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Div(
                attrs = ServicesCardStyle.toModifier()
                    .id(service.id)
                    .attrsModifier {
                        attr("href", service.path)
                    }
                    .onClick {
                        window.location.href = service.path
                    }
                    .cursor(Cursor.Pointer)
                    .padding(10.px)
                    .toAttrs()
            ) {
                Image(
                    src = service.imgPath,
                    modifier = Modifier.classNames("img"),
                    desc = service.imgDesc
                )
                H3(
                    attrs = H3ServiceCardStyle.toModifier()
                        .padding(top = 20.px)
                        .toAttrs(),
                    content = { Text(service.title) }
                )
                P(
                    attrs = PServiceCardStyle
                        .toModifier()
                        .toAttrs(),
                    content = { Text(service.desc) }
                )
            }
        }
    } else {
        Text("Under Construction")
    }
}


@OptIn(ExperimentalComposeWebApi::class)
val ServicesCardStyle by ComponentStyle {
    base {
        Modifier
            .textAlign(TextAlign.Center)
            .position(Position.Relative)
            .width(250.px)
            .height(350.px)
            .borderRadius(r = 20.px)
            .backgroundImage(primaryGradient)
            .transition(CSSTransition("all", 0.6.s))
            .transform {
                rotateX(75.deg)
                translateY((-200).px)
                translateZ((-100).px)
            }
            .boxShadow(0.px, 20.px, 60.px, color = Colors.DarkGray)
            .margin(top = 10.px, bottom = 10.px)
    }
    hover {
        Modifier
            .transform { rotateZ(0.deg) }
            .backgroundImage(secondaryGradient)
            .transition(CSSTransition("all", 700.ms))
            .boxShadow(0.px, 0.px, 20.px, color = Colors.DarkGray)
    }
    cssRule(" img") {
        Modifier
            .transform { translateY(15.px) }
            .width(200.px)
            .height(120.px)
    }
}
@OptIn(ExperimentalComposeWebApi::class)
val H3ServiceCardStyle by ComponentStyle.base {
    Modifier
        .fontSize(25.px)
        .textShadow(0.px, 0.px, 2.px, color = Colors.DarkGray)
        .transform { translateY(10.px) }
}
@OptIn(ExperimentalComposeWebApi::class)
val PServiceCardStyle by ComponentStyle.base {
    Modifier
        .color(onPrimaryLight)
        .textAlign(TextAlign.Center)
        .width(200.px)
        .transform { translateX(12.px) }
}