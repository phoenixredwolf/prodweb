package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.widgets.CircleCard
import com.phoenixredwolf.prodweb.components.widgets.NavButton
import com.phoenixredwolf.prodweb.components.widgets.PageTitle
import com.phoenixredwolf.prodweb.theme.NavItemStyle
import com.phoenixredwolf.prodweb.utility.Constants
import com.phoenixredwolf.prodweb.utility.Constants.CONTACT
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.css.*
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
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun HomePage() {
    val title = "Your Partner in Digital Solutions | Web and Software Development Services"
    val description = "We offer expert web and software development, hosting, and administration services. Transform your ideas into reality with our cutting-edge solutions."
    val breakpoint = rememberBreakpoint()
    val colorMode by ColorMode.currentState

    PageLayout(title = title, description = description) {
        Column(
            modifier = Modifier
                .margin(top = 150.px)
                .padding(top = 25.px, bottom = 20.px)
                .fillMaxWidth(90.percent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth(50.percent)
                            .opacity(0.5),
                        src = Res.Image.icon
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .zIndex(1),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    H1(
                        attrs = Modifier
                            .classNames("w-full")
                            .fillMaxWidth()
                            .fontWeight(FontWeight.Bold)
                            .fontSize(if(breakpoint >= Breakpoint.MD) 5.cssRem else 2.cssRem)
                            .textAlign(TextAlign.Center)
                            .toAttrs(),
                        content = { Text("IT Solutions") }
                    )
                    H3(
                        attrs = Modifier
                            .fillMaxWidth()
                            .fontSize(if(breakpoint >= Breakpoint.MD) 3.cssRem else (1.5).cssRem)
                            .textAlign(TextAlign.Center)
                            .toAttrs(),
                        content = { Text("Implementation, Consulting, & Support") }
                    )
                    Image(
                        src = if (breakpoint <= Breakpoint.SM) Res.Image.tag2 else Res.Image.tag1,
                        modifier = Modifier
                            .width(90.percent)
                            .padding(topBottom = 10.px)
                    )
                }
            }
            P(
                attrs = Modifier
                    .padding(top = 10.px)
                    .fillMaxWidth()
                    .fontSize(if(breakpoint >= Breakpoint.MD) 2.cssRem else (1.25).cssRem)
                    .fontStyle(FontStyle.Italic)
                    .textAlign(TextAlign.Center)
                    .toAttrs(),
                content = { Text("We'll add value to your business and help grow your bottom line!") }
            )
        }
        PageTitle(title = "Home", subtitle = "How We Can Help You", colormode = colorMode)
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(topBottom = 20.px)
                .fillMaxWidth(90.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .padding(topBottom = 20.px)
                    .fillMaxWidth()
            ) {
                if (breakpoint >= Breakpoint.MD) {
                    ServiceButtons()
                } else {
                    ServiceButtons(true)
                }
            }
            Row(
                modifier = Modifier
                    .padding(topBottom = 20.px)
                    .fillMaxWidth()
                    .height(Height.MaxContent),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (breakpoint <= Breakpoint.MD) {
                    IndexCircleCards(true)
                } else {
                    IndexCircleCards()
                }
            }
            ContactOrSched(breakpoint)
        }

    }
}

@Composable
private fun ServiceButtons(compact: Boolean = false) {
    if (compact) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.Medium)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I'm not sure what I need.")
                }
                NavButton("Consultations", "")
            }
            Column(
                modifier = Modifier.fillMaxWidth().padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.Medium)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I know what service I want.")
                }
                NavButton("Services", "/services")
            }
        }
    } else {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(Height.MaxContent),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(right =5.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.XLarge)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I'm not sure what I need.")
                }
                NavButton("Consultations", "")
            }
            Column(
                modifier = Modifier.fillMaxWidth().padding(left = 5.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.XLarge)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I know what service I want.")
                }
                NavButton("Services", "/services")
            }
        }
    }
}

@Composable
private fun IndexCircleCards(vertical : Boolean = false) {
    if (vertical) {
        Column(
            modifier = Modifier
                .fillMaxWidth(90.percent),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.padding(topBottom = 20.px)
            ) {
                CircleCard("Initial Consultation", Constants.CONSULT, Res.Image.collaboration)

            }
            Column(
                modifier = Modifier.padding(topBottom = 20.px)
            ) {
                CircleCard("Implement Solutions", Constants.IMPLEMENT, Res.Image.webdev)

            }
            Column(
                modifier = Modifier.padding(topBottom = 20.px)
            ) {
                CircleCard("Train & Support", Constants.SUPPORT, Res.Image.empower)

            }

        }
    } else {
        Row(
            modifier = Modifier
                .fillMaxWidth(90.percent),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.height(500.px).padding(leftRight = 10.px)
            ) {
                CircleCard("Initial Consultation", Constants.CONSULT, Res.Image.collaboration)

            }
            Column(
                modifier = Modifier.height(500.px).padding(leftRight = 10.px)
            ) {
                CircleCard("Implement Solutions", Constants.IMPLEMENT, Res.Image.webdev)

            }
            Column(
                modifier = Modifier.height(500.px).padding(leftRight = 10.px)
            ) {
                CircleCard("Train & Support", Constants.SUPPORT, Res.Image.empower)

            }

        }

    }
}

@Composable
private fun ContactOrSched(breakpoint: Breakpoint) {
    P(
        attrs = Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.XLarge)
            .toAttrs()
    ) {
        Link(
            modifier = NavItemStyle.toModifier()
                .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Large else FontSize.XXLarge)
                .fontWeight(FontWeight.SemiBold)
                .textDecorationLine(TextDecorationLine.None),
            path = "/contact",
            text = "Contact"
        )
        Text(" or ")
        Link(
            modifier = NavItemStyle.toModifier()
                .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Large else FontSize.XXLarge)
                .fontWeight(FontWeight.SemiBold)
                .textDecorationLine(TextDecorationLine.None),
            path = CONTACT,
            text = "Schedule a call"
        )
        Br()
        Text("To Get Started!")
    }

}