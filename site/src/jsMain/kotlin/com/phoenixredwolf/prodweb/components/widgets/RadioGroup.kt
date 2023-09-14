package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.primaryDark
import com.phoenixredwolf.prodweb.theme.primaryLight
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.css.VerticalAlign
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.after
import com.varabyte.kobweb.silk.components.style.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.RadioGroupScope
import org.jetbrains.compose.web.dom.RadioInput
import org.jetbrains.compose.web.dom.Span

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun <T> RadioGroupScope<T>.FluentRadioInput(
    value: T,
    label: String,
    onClick: (T) -> Unit
) {
    Row(
        Modifier
            .cursor(Cursor.Pointer)
            .onClick { onClick(value) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Label(
            attrs = Modifier
                .cursor(Cursor.Pointer)
                .toAttrs {
                    onClick { it.preventDefault()
                    }
                }
        ) {
            RadioInput(
                value,
                attrs = Modifier
                    .display(DisplayStyle.None)
                    .toAttrs()
            )
            Span(
                radioButtonStyle.toAttrs()
            )
            SpanText(
                label,
                Modifier
                    .verticalAlign(VerticalAlign.Super)
                    .margin(left = .5.cssRem)
            )
        }
    }
}


val radioButtonStyle by ComponentStyle {
    base {
        Modifier
            .border { style(LineStyle.Solid) }
            .borderRadius(30.px)
            .border {
                color(if (colorMode == ColorMode.LIGHT) primaryLight else primaryDark)
            }
            .border { width(1.px) }
            .width(24.px)
            .height(24.px)
            .display(DisplayStyle.InlineBlock)
            .position(Position.Relative)
            .cursor(Cursor.Pointer)
    }
    after {
        Modifier
            .content("\"\"")
            .display(DisplayStyle.Block)
            .position(Position.Absolute)
            .top(50.percent)
            .left(50.percent)
            .translate((-50).percent, (-50).percent)
            .scale(0)
            .width(16.px)
            .height(16.px)
            .backgroundColor(primaryLight)
            .borderRadius(30.px)
            .transition(CSSTransition(TransitionProperty.All, duration = 0.3.s))
    }
    cssRule(".x, input[type=\"radio\"]:checked + :after") {
        Modifier
            .translate((-50).percent, (-50).percent)
            .scale(1)
    }
}