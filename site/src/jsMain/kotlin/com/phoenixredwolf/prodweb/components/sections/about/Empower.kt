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
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun Empower() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .margin(top = 140.px)
            .padding(top = 20.px,bottom = 30.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P(
            attrs = AboutTitlePStyle.toModifier()
                .toAttrs()
        ) {
            Text ("Empower Your Digital Success")
        }
        SimpleGrid(modifier = Modifier
            .fillMaxWidth(90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            EmpowerText()
            EmpowerImage()
        }
    }
}

@Composable
private fun EmpowerText() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(topBottom = 10.px)
    ) {
        P(
            attrs = AboutBodyPStyle
                .toAttrs()
        ) {
            Text("At ")
            Span(
                attrs = AboutSpanStyle
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
            modifier = AboutImageStyle.toModifier()
        )
    }
}
