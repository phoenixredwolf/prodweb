package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerDark
import com.phoenixredwolf.prodweb.theme.onSecondaryContainerDark
import com.phoenixredwolf.prodweb.theme.primaryContainerDark
import com.phoenixredwolf.prodweb.theme.secondaryContainerDark
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text

@Composable
fun ContactButton() {
    A(
        attrs = ContactButtonStyle.toModifier()
            .width(Width.MaxContent)
            .borderRadius(r=10.px)
            .zIndex(1)
            .attrsModifier {
                attr("href", "/contact")
            }
            .toAttrs()
    ) {

        Button(
            attrs = ContactButtonStyle.toModifier()
                .attrsModifier {
                    attr("href", "/contact")
                }
                .fillMaxWidth()
                .borderRadius(r = 10.px)
                .toAttrs(),
            content = {
                Text("Contact Us!")
            }
        )
    }
}

val ContactButtonStyle by ComponentStyle {
    base {
        Modifier
            .width(45.percent)
            .height(40.px)
            .backgroundColor(primaryContainerDark)
            .textDecorationLine(TextDecorationLine.None)
            .color(onPrimaryContainerDark)
            .fontSize(FontSize.Large)
            .fontWeight(FontWeight.SemiBold)
            .transition(
                CSSTransition(property = "backgroundColor", duration = 200.ms)
            )
    }
    anyLink{
        Modifier
            .color(onPrimaryContainerDark)
            .transition(
                CSSTransition(property = "backgroundColor", duration = 200.ms),
                CSSTransition(property = "color", duration = 200.ms)
            )
    }
    hover {
        Modifier
            .textDecorationLine(TextDecorationLine.None)
            .backgroundColor(secondaryContainerDark)
            .color(onSecondaryContainerDark)
            .boxShadow(3.px, 3.px, color = Colors.Black, blurRadius = 8.px)
    }
}