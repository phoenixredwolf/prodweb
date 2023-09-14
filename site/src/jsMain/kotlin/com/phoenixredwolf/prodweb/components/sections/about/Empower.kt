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
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun Empower(breakpoint: Breakpoint, colorMode: ColorMode) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .margin(top = 140.px)
            .padding(top = 20.px,bottom = 30.px),
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
            Text ("Empower Your Digital Success")
        }
        SimpleGrid(modifier = Modifier
            .fillMaxWidth(90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            EmpowerText(breakpoint, colorMode)
            EmpowerImage()
        }
    }
}

@Composable
private fun EmpowerText(breakpoint: Breakpoint, colorMode: ColorMode) {
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
            Text("At ")
            Span(
                attrs = Modifier
                    .color(if (colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
                    .fontWeight(FontWeight.SemiBold)
                    .toAttrs()
            ){
                Text("PhoenixRedwolf Digital Services")
            }
            Text(", we believe in the transformative power of technology. Our mission is to empower businesses " +
                    "and organizations to thrive in the digital age by delivering exceptional technical consulting, " +
                    "web development and administration, cloud migration, and network installation and " +
                    "administration services.")
        }
    }
}

@Composable
private fun EmpowerImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.empower,
            desc = "Empowerment Image",
            modifier =     Modifier
                .fillMaxWidth(80.percent)
                .borderRadius(20.px)
                .borderBottom(5.px, LineStyle.Solid, shadowDark)
                .borderRight(5.px, LineStyle.Solid, shadowDark)
        )
    }
}
