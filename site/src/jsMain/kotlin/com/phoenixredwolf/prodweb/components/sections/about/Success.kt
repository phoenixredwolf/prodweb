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
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Success() {
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
            Text("Your Partner for Success")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            SuccessText()
            SuccessImage()
        }
    }
}

@Composable
private fun SuccessText() {
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
            modifier = AboutImageStyle.toModifier()
        )
    }
}
