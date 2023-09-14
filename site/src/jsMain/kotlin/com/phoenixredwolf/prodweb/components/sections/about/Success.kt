package com.phoenixredwolf.prodweb.components.sections.about

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerDark
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerLight
import com.phoenixredwolf.prodweb.theme.shadowDark
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Success(breakpoint: Breakpoint, colorMode: ColorMode) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 30.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P(
            attrs = Modifier
                .textAlign(TextAlign.Center)
                .fillMaxWidth(90.percent)
                .fontSize(if(breakpoint >= Breakpoint.LG) 45.px else 25.px)
                .fontWeight(FontWeight.SemiBold)
                .color(if (colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
                .toAttrs()
        ) {
            Text("Your Partner for Success")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            SuccessText(breakpoint)
            SuccessImage()
        }
    }
}

@Composable
private fun SuccessText(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(topBottom = 10.px)
    ) {
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(if(breakpoint >= Breakpoint.MD) TextAlign.End else TextAlign.Justify)
                .margin(
                    left = if(breakpoint >= Breakpoint.MD) 10.px else 5.px,
                    right = if(breakpoint >= Breakpoint.MD) 0.px else 5.px)
                .fontSize(if (breakpoint >= Breakpoint.LG) 25.px else 15.px)
                .toAttrs()
        ) {
            Text(
                "With integrity and passion, we forge enduring partnerships with our clients, seeking to become " +
                        "an extension of your teams. Together, we embrace challenges, conquer complexities, and " +
                        "transform possibilities into realities. At PhoenixRedwolf Digital Services, we are the " +
                        "catalyst for your digital journey, igniting the power of technology to drive lasting and " +
                        "meaningful success for your business."
            )
        }
    }
}

@Composable
private fun SuccessImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.success,
            desc = "Success Image",
            modifier =     Modifier
                .fillMaxWidth(80.percent)
                .borderRadius(20.px)
                .borderBottom(5.px, LineStyle.Solid, shadowDark)
                .borderRight(5.px, LineStyle.Solid, shadowDark)
        )
    }
}
