package com.phoenixredwolf.prodweb.components.sections.about

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.pages.AboutBodyPStyle
import com.phoenixredwolf.prodweb.pages.AboutImageStyle
import com.phoenixredwolf.prodweb.pages.AboutSpanStyle
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
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun Collaborate() {
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
            Text ("Collaboration and Continuous Learning")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            CollaborateText()
            CollaborateImage()
        }
    }
}

@Composable
private fun CollaborateText() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(topBottom = 10.px)
    ) {
        P(
            attrs = AboutBodyPStyle.toModifier()
                .toAttrs()
        ) {
            Text("At ")
            Span(
                attrs = AboutSpanStyle.toModifier()
                    .toAttrs()
            ){
                Text("PhoenixRedwolf")
            }
            Text(", we foster a culture of collaboration and continuous learning. We stay at the forefront of " +
                    "the rapidly evolving digital landscape to provide you with the most up-to-date and effective " +
                    "strategies for success. Our transparent and customer-centric approach ensures open " +
                    "communication and complete client satisfaction at every stage of the engagement.")
        }
    }
}

@Composable
private fun CollaborateImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.collaboration,
            desc = "Collaboration Image",
            modifier = AboutImageStyle.toModifier()
        )
    }
}
