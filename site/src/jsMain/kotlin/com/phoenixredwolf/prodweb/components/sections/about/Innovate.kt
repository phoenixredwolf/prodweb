package com.phoenixredwolf.prodweb.components.sections.about

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.pages.AboutBodyPStyle
import com.phoenixredwolf.prodweb.pages.AboutImageStyle
import com.phoenixredwolf.prodweb.pages.AboutTitlePStyle
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Innovate(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 30.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P(
            attrs = AboutTitlePStyle.toModifier()
                .toAttrs()
        ) {
            Text("Innovative Solutions for Your Success")
        }
        SimpleGrid(modifier = Modifier
            .fillMaxWidth(90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            if (breakpoint < Breakpoint.MD) {
                InnovateText()
                InnovateImage()
            } else {
                InnovateImage()
                InnovateText()
            }
        }
    }
}

@Composable
private fun InnovateText() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(topBottom = 10.px)
    ) {
        P(
            attrs = AboutBodyPStyle.toModifier()
                .toAttrs()
        ) {
            Text(
                "Our team of skilled professionals is dedicated to understanding your unique needs and " +
                        "challenges.By leveraging cutting-edge technologies and industry best practices, we tailor our " +
                        "services to offer bespoke solutions that optimize efficiency, enhance productivity, and foster " +
                        "growth. You can trust us to deliver on time and within budget while maintaining the highest " +
                        "standards of quality and security."
            )
        }
    }
}

@Composable
private fun InnovateImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.solution,
            desc = "Solution Image",
            modifier = AboutImageStyle.toModifier()
        )
    }
}
