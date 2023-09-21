package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.models.Consulting
import com.phoenixredwolf.prodweb.components.widgets.PageTitle
import com.phoenixredwolf.prodweb.components.widgets.ServiceCard
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun Consult() {
    val title = "Expert Consulting Services | Strategic Business Solutions | PhoenixRedwolf DS"
    val description = "Unlock the full potential of your business with our expert consulting services at [Your Company Name]. We offer strategic guidance and solutions to drive growth and success. Explore our consulting expertise today."
    val colorMode by ColorMode.currentState

    PageLayout(title, description) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .margin(top = 150.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(90.percent),
                horizontalArrangement = Arrangement.Center
            ){
                H1(
                    attrs = Modifier
                        .fontWeight(FontWeight.Bold)
                        .toAttrs(),
                    content = { Text("Business Consulting Services") }
                )
            }
            PageTitle("", "Expert Recommendations To Get Your Best Solutions", colormode = colorMode)
            SimpleGrid(
                modifier = Modifier
                    .margin(top = 25.px)
                    .rowGap(20.px)
                    .fillMaxWidth(90.percent)
                    .alignContent(AlignContent.Center),
                numColumns = numColumns( 1, md = 2, lg = 3, xl = 4)
            ) {
                Consulting.values().forEach { consult->
                    Div(
                        attrs = Modifier
                            .height(450.px)
                            .toAttrs()
                    ) {
                        ServiceCard(consult)
                    }
                }
            }
        }
    }
}