package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.models.CardInfo
import com.phoenixredwolf.prodweb.theme.*
import com.varabyte.kobweb.compose.css.CSSFloat
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun BottomCards(cardInfo: CardInfo) {
    Column(
        modifier = Modifier.margin(top = 150.px)
    ) {
        Column(
            modifier = FlipCardStyle.toModifier(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = ContentStyle.toModifier()
            ) {
                Column(
                    modifier = FrontStyle.toModifier(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    cardInfo.icon()
                    H3(
                        attrs = Modifier.fillMaxWidth().margin(top = 25.px).toAttrs(),
                        content = { Text(cardInfo.title) }
                    )
                }
                Column(
                    modifier = BackStyle.toModifier(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    P(
                        attrs = Modifier
                            .textAlign(TextAlign.Justify)
                            .toAttrs(),
                        content = { Text(cardInfo.desc) }
                    )
                    A(
                        attrs = ServiceCtaStyle.toModifier()
                            .attrsModifier { attr("href", "/contact") }
                            .toAttrs()
                    ) {
                        Text("Contact Us")
                    }

                }
            }
        }
    }
}


private val sharedModifier3 = Modifier
    .position(Position.Absolute)
    .padding(20.px)
    .textAlign(TextAlign.Center)
    .borderRadius(20.px)
    .styleModifier {
        property("backface-visibility", "hidden")
    }
    .fillMaxSize()
@OptIn(ExperimentalComposeWebApi::class)
val FlipCardStyle by ComponentStyle {
    base {
        Modifier
            .position(Position.Relative)
            .top(50.percent)
            .left(50.percent)
            .margin((-150).px)
            .borderRadius(20.px)
            .float(CSSFloat.Left)
            .styleModifier {
                property("perspective", "500.px")
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
        .borderRadius(20.px)
        .transition(CSSTransition("transform", 1.s))
        .styleModifier {
            property("transform-style", "preserve-3d")
        }
        .fillMaxSize()
}
val FrontStyle by ComponentStyle.base {
    sharedModifier3
        .background(if(colorMode == ColorMode.LIGHT) primaryLight else primaryDark)
        .color(if(colorMode==ColorMode.LIGHT) onPrimaryLight else onPrimaryDark)
}
@OptIn(ExperimentalComposeWebApi::class)
val BackStyle by ComponentStyle.base {
    sharedModifier3
        .background(if(colorMode==ColorMode.LIGHT) secondaryLight else secondaryDark)
        .color(if(colorMode==ColorMode.LIGHT) onSecondaryLight else onSecondaryDark)
        .fontSize(FontSize.Large)
        .transform { rotateY(180.deg) }
}