package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.widgets.ContactForm
import com.phoenixredwolf.prodweb.components.widgets.PageTitle
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Constants
import com.phoenixredwolf.prodweb.utility.Constants.TOAST_LINK
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun Contact() {
    val title = "Contact Us | Get in Touch with PhoenixRedwolf Digital Services"
    val description = "Have questions or inquiries? Feel free to reach out to PhoenixRedwolf Digital Services. We're here to assist you. Contact us today and let's start your digital journey together."
    val breakpoint = rememberBreakpoint()
    val colorMode by ColorMode.currentState

    PageLayout(title, description) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 150.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PageTitle("Contact PRDS", "Let's Talk About How We Can Help!", colormode = colorMode)

            SimpleGrid(
                modifier = Modifier.fillMaxWidth(90.percent),
                numColumns = numColumns(1, md = 2)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .margin(top = 20.px)
                        .padding(20.px)
                        .borderRight(
                            width = if(breakpoint >= Breakpoint.MD) 2.px else 0.px,
                            style = LineStyle.Solid,
                            color = if(colorMode == ColorMode.LIGHT) primaryLight else primaryDark
                        )
                ) {
                    ContactForm(breakpoint)
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .margin(top = 20.px)
                        .padding(leftRight = 20.px, top = 50.px),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(90.percent),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.Top
                    ) {
                        P(
                            attrs = Modifier
                                .margin(topBottom = 20.px)
                                .toAttrs()
                        ) {
                            H4(
                                attrs = Modifier
                                    .toAttrs(),
                                content = { Text("Feel free to give us a call") }
                            )
                            A(
                                attrs = LinkBaseStyle.toModifier()
                                    .classNames("fs-5")
                                    .padding(topBottom = 10.px)
                                    .attrsModifier {
                                        attr("href", "tel:+1-856-314-0392")
                                    }
                                    .toAttrs(),
                                content = { Text("(856) 347-0392") }
                            )
                            H5(
                                attrs = Modifier
                                    .padding(topBottom = 10.px)
                                    .margin(0.px)
                                    .toAttrs()
                            ) { Text("OR") }
                            Link(
                                modifier = LinkBaseStyle.toModifier()
                                    .padding(bottom = 10.px)
                                    .classNames("fs-5"),
                                path = Constants.CONTACT,
                                text = "Schedule a Call!"
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .height(2.px)
                            .width(200.px)
                            .backgroundColor(if (colorMode == ColorMode.LIGHT) primaryContainerLight else primaryContainerDark)
                            .borderRadius(r = 50.px)
                    )
                    P(
                        attrs = Modifier
                            .classNames("fs-5")
                            .margin(topBottom = 20.px)
                            .fontWeight(FontWeight.SemiBold)
                            .toAttrs()
                    ) {
                        Text("Looking for Restaurant POS Systems? ")
                        Link(
                            modifier = LinkBaseStyle.toModifier()
                                .padding(left = 10.px),
                            path = TOAST_LINK,
                            text = "Click Here!"

                        )
                    }
                }
            }
        }
    }

}