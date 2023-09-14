package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.*
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Composable
fun PageTitle(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    colormode: ColorMode,
    alignment: Alignment.Horizontal = Alignment.CenterHorizontally
) {
    Column(
        modifier = modifier,
        horizontalAlignment = alignment
    ) {
        if (title != "About" && title != "Home") {
            Title(title, alignment, colormode)
        }
        Subtitle(subtitle, alignment, colormode)
        Box(
            modifier = Modifier
                .height(2.px)
                .width(80.px)
                .backgroundColor(if (colormode == ColorMode.LIGHT) primaryContainerLight else primaryContainerDark)
                .borderRadius(r = 50.px)
        )

    }
}

@Composable
private fun Title(
    title: String,
    alignment: Alignment.Horizontal,
    colormode: ColorMode
) {
    H2(
        attrs = Modifier
            .fillMaxWidth()
            .margin(topBottom = 0.px)
            .textAlign(
                if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start
            )
            .fontWeight(FontWeight.Normal)
            .color(if (colormode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
            .toAttrs()
    ) {
        Text(title)
    }
}

@Composable
private fun Subtitle(
    subtitle: String,
    alignment: Alignment.Horizontal,
    colormode: ColorMode
) {
    H2(
        attrs = Modifier
            .fillMaxWidth()
            .margin(top = 0.px, bottom = 10.px)
            .textAlign(
                if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start
            )
            .fontWeight(FontWeight.SemiBold)
            .color(if (colormode == ColorMode.LIGHT) secondaryLight else secondaryDark)
            .toAttrs()
    ) {
        Text(subtitle)
    }
}