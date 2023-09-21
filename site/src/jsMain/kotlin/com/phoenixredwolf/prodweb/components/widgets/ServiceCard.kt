package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.models.BaseService
import com.phoenixredwolf.prodweb.theme.*
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
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceCard(
    service: BaseService
) {
    Div(
        attrs = ServiceCardStyle.toModifier()
            .classNames("card", "transition")
            .toAttrs()
    ) {
        H2(
            attrs = ServiceH2CircleCardStyle.toModifier()
                .classNames("transition")
                .toAttrs()
        ) { Text(service.title) }
        Div(
            attrs = ServiceCtaContainerStyle.toModifier()
                .classNames("cta-container", "transition")
                .toAttrs()
        ) {
            Div(
                attrs = Modifier
                    .height(100.px)
                    .margin(bottom = 10.px).toAttrs()
            ) {
                Text(service.desc)
            }
            Div(
                attrs = Modifier
                    .alignContent(org.jetbrains.compose.web.css.AlignContent.Baseline)
                    .toAttrs()
            ){
                A(
                    attrs = ServiceCtaStyle.toModifier()
                        .attrsModifier { attr("href", service.path) }
                        .toAttrs()
                ) {
                    Text("Learn More")
                }
            }
        }
        Div(
            attrs = ServiceCard_circleStyle.toModifier()
                .classNames("card_circle", "transition")
                .background(
                    secondaryLight,
                    CSSBackground(
                        image = BackgroundImage.of(url(service.imgPath)),
                        repeat = BackgroundRepeat.NoRepeat,
                        size = BackgroundSize.Cover,
                        position = BackgroundPosition.of(CSSPosition.Bottom)
                    )
                )
                .toAttrs()
        )
    }
}

val ServiceCardStyle by ComponentStyle {
    base {
        Modifier
            .backgroundColor(surfaceVariantLight)
            .boxShadow(0.px, 0.px, 10.px, 2.px, shadowDark)
            .overflow(Overflow.Hidden)
            .position(Position.Relative)
            .margin(numericAuto)
            .width(300.px)
            .height(200.px)
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
            .margin(top = 275.px)
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
            .zIndex(1)
    }
}

val ServiceCard_circleStyle by ComponentStyle{
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

val ServiceH2CircleCardStyle by ComponentStyle{
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

val ServicePCircleCardStyle by ComponentStyle {
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

val ServiceCtaContainerStyle by ComponentStyle{
    base {
        Modifier
            .height(175.px)
            .color(secondaryLight)
            .fontFamily("Raleway", "sans-serif")
            .fontSize(100.percent)
            .fontWeight(FontWeight.Normal)
            .padding(leftRight = 5.px)
            .textAlign(TextAlign.Center)
            .display(DisplayStyle.None)
            .position(Position.Absolute)
            .textAlign(TextAlign.Center)
            .fillMaxWidth()
            .margin(bottom = 20.px)
    }
    cssRule(" .transition") {
        Modifier
            .transition(CSSTransition("all", duration = 300.ms))
    }
}

val ServiceCtaStyle by ComponentStyle {
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
            .transition(CSSTransition("all", duration = 200.ms, TransitionTimingFunction.EaseOut))
            .margin(bottom = 15.px)
    }
    hover {
        Modifier
            .backgroundColor(secondaryLight)
            .boxShadow(0.px, 8.px, 17.px, 0.px, shadowLight)
            .color(onSecondaryLight)
    }
}