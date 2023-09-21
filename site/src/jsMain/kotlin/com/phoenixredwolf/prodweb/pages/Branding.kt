package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.models.Consulting.BRAND
import com.phoenixredwolf.prodweb.components.widgets.*
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun Branding() {
    val title = "Brand Marketing Services | Elevate Your Brand | PhoenixRedwolf Digital Services"
    val description = "Transform your brand with our expert brand marketing services at PhoenixRedwolf Digital Services. Build brand awareness, loyalty, and success today!"

    PageLayout(title, description) {
        Column(
            modifier = Modifier
                .margin(top = 150.px)
                .padding(bottom = 20.px)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        src = Res.Image.brandlg,
                        modifier = ServiceImageStyle.toModifier()
                    )
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(90.percent),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        H1(
                            attrs = ServiceH1Style.toModifier()
                                .toAttrs(),
                            content = { Text("Brand Marketing Strategies") }
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(90.percent),
                        horizontalAlignment = Alignment.Start
                    ) {
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("Transform your brand with PhoenixRedwolf's Brand Marketing. We craft compelling strategies to elevate brand visibility, engage audiences, and foster loyalty.")
                        }
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("With PhoenixRedwolf's Brand Marketing services, you gain a partner dedicated to elevating your brand's presence, increasing visibility, and fostering strong connections with your audience. Your brand's success is our mission.")
                        }
                        Row(
                            modifier = ServiceCBRowStyle.toModifier(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            ContactButton()
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                H3(
                    attrs = ServiceH3Style.toModifier().toAttrs(),
                    content = { Text("Elevate Your Brand with Effective Marketing") }
                )
                P(
                    attrs = Modifier
                        .classNames("fs-4")
                        .textAlign(TextAlign.Justify)
                        .padding(bottom = 10.px)
                        .toAttrs(),
                    content = {
                        Text("At PhoenixRedwolf Digital Services, our Brand Marketing services are designed to help you unlock the full potential of your brand. We understand that building and maintaining a strong brand presence is crucial for success in today's competitive market.")
                    }
                )
                Benefits(BRAND)
                ServiceOfferings(BRAND)
                ScheduleConsult()
                SimpleGrid(
                    modifier = Modifier
                        .margin(top = 10.px, bottom = 200.px)
                        .rowGap(200.px)
                        .fillMaxWidth(),
                    numColumns = numColumns(1, md=2, lg=3, xl = 4)
                ) {
                    BRAND.cards.forEach { cardInfo ->
                        Div {
                            BottomCards(cardInfo)
                        }
                    }
                }
            }
        }
    }
}