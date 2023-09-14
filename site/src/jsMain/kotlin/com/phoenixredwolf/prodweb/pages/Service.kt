package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.models.Services
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
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun Service() {
    val title = "Digital Services | Web & Software Development, Cloud Solutions, Networking"
    val description = "Explore our comprehensive range of digital services at PhoenixRedwolf. From web and software development to cloud solutions and networking, our expertise fuels your digital success. Learn more!"
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
                    content = { Text("Business Technology Services") }
                )
            }
            PageTitle("", "Services We Offer", colormode = colorMode)
            SimpleGrid(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxWidth(90.percent)
                    .alignContent(AlignContent.Center),
                numColumns = numColumns( 1, md = 2, lg = 3, xl = 4)
            ) {
                Services.values().forEach {service ->
                    ServiceCard(service)
                }
            }
        }
    }
}