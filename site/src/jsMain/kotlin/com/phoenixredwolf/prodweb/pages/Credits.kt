package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.models.Consulting
import com.phoenixredwolf.prodweb.components.models.Services
import com.phoenixredwolf.prodweb.components.widgets.PageTitle
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun CreditPage() {
    val title = "Image Credits & Attribution | Recognizing the Talented Creators Behind Our Visuals"
    val description = "We believe in honoring creativity. Discover the talented individuals whose images adorn our website. Proper credit and attribution ensure respect for their artistry. Explore our image credits here."
    val colorMode by ColorMode.currentState

    PageLayout(title,description) {
        Row(
            modifier = Modifier.fillMaxWidth().margin(top=150.px),
            horizontalArrangement = Arrangement.Center
        ){
            Column(
                modifier = Modifier.fillMaxWidth(90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PageTitle("Attribution for Creators","Those that helped make this site possible", colormode = colorMode)
            }
        }
        Row(
            modifier = Modifier.fillMaxSize(90.percent),
            horizontalArrangement = Arrangement.Center
        ) {
            SimpleGrid(
                numColumns = numColumns(1, 1,2,3,4),
                modifier = Modifier.columnGap(10.px).rowGap(10.px)
            ) {
                Services.values().forEach { service ->
                    Column(
                        modifier = Modifier.padding(topBottom = 20.px)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            content = {
                                Image(
                                    src = service.imgPath,
                                    modifier = Modifier.width(300.px)
                                )
                            }
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text("Image by ")
                            A(
                                attrs = Modifier
                                    .padding(leftRight = 6.px)
                                    .attrsModifier {
                                        attr("href", service.imgCreditPath)
                                    }
                                    .toAttrs(),
                                content = { Text(service.imgCredit) }
                            )
                            if (!service.freepikImg) Text(" on Freepik")
                        }
                    }
                }
                Consulting.values().forEach {consult ->
                    Column(
                        modifier = Modifier.padding(topBottom = 20.px)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            content = {
                                Image(
                                    src = consult.imgPath,
                                    modifier = Modifier.width(300.px)
                                )
                            }
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text("Image by ")
                            A(
                                attrs = Modifier
                                    .padding(leftRight = 6.px)
                                    .attrsModifier {
                                        attr("href", consult.imgCreditPath)
                                    }
                                    .toAttrs(),
                                content = { Text(consult.imgCredit) }
                            )
                            if (!consult.freepikImg) Text(" on Freepik")
                        }
                    }
                }
            }
        }
    }

}