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
fun Citizenship(breakpoint: Breakpoint) {
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
            Text("Responsible Corporate Citizenship")
        }
        SimpleGrid(modifier = Modifier
            .fillMaxWidth(90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            if (breakpoint < Breakpoint.MD) {
                CitizenshipText()
                CitizenshipImage()
            } else {
                CitizenshipImage()
                CitizenshipText()
            }
        }
    }
}

@Composable
private fun CitizenshipText() {
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
                "As a responsible corporate citizen, we are committed to minimizing our environmental impact " +
                        "and supporting sustainable business practices. We strive to make a positive difference in " +
                        "the communities we serve, promoting inclusivity and diversity in all aspects of our operations."
            )
        }
    }
}

@Composable
private fun CitizenshipImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.corporate,
            desc = "Corporate Citizenship Image",
            modifier = AboutImageStyle.toModifier()
        )
    }
}
