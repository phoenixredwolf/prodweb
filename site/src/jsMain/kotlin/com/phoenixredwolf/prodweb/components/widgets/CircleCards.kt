package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Constants.CONTACT
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun CircleCard(headline: String, body: String, image: String) {
    Div(
        attrs = CardStyle.toModifier()
            .classNames("card", "transition")
            .toAttrs()
    ) {
        H2(
            attrs = H2CircleCardStyle.toModifier()
                .classNames("transition")
                .toAttrs()
        ) { Text(headline) }
        P(
            attrs = PCircleCardStyle.toModifier()
                .toAttrs()
        ) {
            Text(body)
        }
        Div(
            attrs = CtaContainerStyle.toModifier()
                .classNames("cta-container", "transition")
                .toAttrs()
        ) {
            A(
                attrs = CtaStyle.toModifier()
                    .attrsModifier { attr("href", CONTACT) }
                    .toAttrs()
            ) {
                Text("Schedule a Call")
            }
        }
        Div(
            attrs = Card_circleStyle.toModifier()
                .classNames("card_circle", "transition")
                .background(
                    secondaryLight,
                    CSSBackground(
                        image = BackgroundImage.of(url(image)),
                        repeat = BackgroundRepeat.NoRepeat,
                        size = BackgroundSize.Cover,
                        position = BackgroundPosition.of(CSSPosition.Bottom)
                    )
                )
                .toAttrs()
        )
    }
}

val CardStyle by ComponentStyle {
    base {
        Modifier
            .backgroundColor(surfaceLight)
            .boxShadow(0.px, 0.px, 10.px, 2.px, Colors.DarkGray)
            .overflow(Overflow.Hidden)
            .position(Position.Relative)
            .height(300.px)
            .width(300.px)
            .margin(numericAuto)
            .transition(CSSTransition("all", duration = 500.ms))

    }
    hover {
        Modifier
            .height(450.px)
    }
    cssRule(" .transition") {
        Modifier
            .transition(CSSTransition("all", duration = 300.ms))
    }
    cssRule(":hover .cta-container") {
        Modifier
            .display(DisplayStyle.Inline)
            .margin(top = 360.px)
    }
    cssRule(":hover .card_circle") {
        Modifier
            .backgroundSize(BackgroundSize.Cover)
            .borderRadius(0.px)
            .margin(top = (-130).px)
    }
    cssRule(":hover h2") {
        Modifier
            .background(primaryContainerLight)
            .color(onPrimaryContainerLight)
            .padding(5.px)
            .margin(top = 100.px)
    }
    cssRule(":hover h2 small") {
        Modifier
            .color(Colors.White)
    }
    cssRule(":hover p") {
        Modifier
            .margin(top = 275.px)
    }
}

val Card_circleStyle by ComponentStyle{
    base {
        Modifier
            .borderRadius(50.percent)
            .height(400.px)
            .position(Position.Absolute)
            .width(450.px)
            .margin(top = (-270).px, left = (-75).px)
    }
    cssRule(" .transition") {
        Modifier
            .transition(CSSTransition("all", duration = 300.ms))
    }

}

val H2CircleCardStyle by ComponentStyle{
    base {
        Modifier
            .color(onPrimaryContainerLight)
            .fontFamily("Raleway", "sans-serif")
            .fontSize(24.px)
            .fontWeight(200)
            .position(Position.Relative)
            .textAlign(TextAlign.Center)
            .fillMaxWidth()
            .zIndex(1)
            .margin(top = 150.px)
    }
    cssRule(" .transition") {
        Modifier
            .transition(CSSTransition("all", duration = 300.ms))
    }
}

val PCircleCardStyle by ComponentStyle {
    base {
        Modifier
            .color(secondaryLight)
            .fontFamily("Raleway", "sans-serif")
            .fontSize(100.percent)
            .fontWeight(FontWeight.Normal)
            .padding(leftRight = 5.px)
            .position(Position.Absolute)
            .textAlign(TextAlign.Center)
            .margin(top = 200.px)
    }
}

val CtaContainerStyle by ComponentStyle{
    base {
        Modifier
            .display(DisplayStyle.None)
            .position(Position.Absolute)
            .textAlign(TextAlign.Center)
            .fillMaxWidth()
            .margin( bottom = 20.px)
    }
    cssRule(" .transition") {
        Modifier
            .transition(CSSTransition("all", duration = 300.ms))
    }
}

val CtaStyle by ComponentStyle {
    base {
        Modifier
            .backgroundClip(BackgroundClip.PaddingBox)
            .backgroundColor(primaryContainerLight)
            .border(2.px, LineStyle.Solid, primaryLight)
            .borderRadius(2.px)
            .color(onPrimaryDark)
            .display(DisplayStyle.InlineBlock)
            .fontFamily("Raleway", "sans-serif")
            .fontSize(17.px)
            .fontWeight(400)
            .height(36.px)
            .letterSpacing(0.5.px)
            .lineHeight(36.px)
            .padding(0.px, 2.cssRem)
            .textDecorationLine(TextDecorationLine.None)
            .transition(CSSTransition("all", 200.ms, TransitionTimingFunction.EaseOut))
            .margin(bottom = 25.px)
    }
    hover {
        Modifier
            .backgroundColor(secondaryLight)
            .boxShadow( 0.px, 8.px, 17.px, 0.px, Colors.LightGray)
            .color(onSecondaryLight)
    }
}