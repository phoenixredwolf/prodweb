package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.widgets.CircleCard
import com.phoenixredwolf.prodweb.components.widgets.NavButton
import com.phoenixredwolf.prodweb.components.widgets.PageTitle
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerLight
import com.phoenixredwolf.prodweb.theme.onTertiaryContainerLight
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
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun HomePage() {
    val title = "Your Partner in Digital Solutions | Web and Software Development Services"
    val description = "We offer expert web and software development, hosting, and administration services. Transform your ideas into reality with our cutting-edge solutions."
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
                        attrs = IndexH1Style.toModifier()
                            .classNames("w-full")
                            .toAttrs(),
                        content = { Text("IT Solutions") }
                    )
                    H3(
                        attrs = IndexH3Style.toModifier()
                            .toAttrs(),
                        content = { Text("Implementation, Consulting, & Support") }
                    )
                    Picture(
                        attrs = Modifier.fillMaxWidth().toAttrs()
                    ) {
                        Source(
                            attrs = Modifier
                                .attrsModifier {
                                    attr("media", "(min-width:577px)")
                                    attr("srcset", Res.Image.tag1)
                                }
                                .toAttrs()
                        )
                        Image(
                            src = Res.Image.tag2,
                            modifier = Modifier
                                .width(90.percent)
                        )
                    }
                }
            }
            P(
                attrs = IndexMainPStyle.toModifier()
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
            ServiceButtons()
            Row(
                modifier = Modifier
                    .padding(topBottom = 20.px)
                    .fillMaxWidth()
                    .height(Height.MaxContent),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IndexCircleCards()
            }
            ContactOrSched()
        }

    }
}
@Composable
fun ServiceButtons() {
    SimpleGrid(
        modifier = Modifier.fillMaxWidth()
            .height(Height.MaxContent),
        numColumns = numColumns(base = 1, md = 2)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(10.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            P(
                attrs = ServiceButtonStyle.toModifier()
                    .toAttrs()
            ) {
                Text("I'm not sure what I need.")
            }
            NavButton("Consultations", "/consult")
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(10.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            P(
                attrs = ServiceButtonStyle.toModifier()
                    .toAttrs()
            ) {
                Text("I know what service I want.")
            }
            NavButton("Services", "/service")
        }
    }
}

@Composable
private fun IndexCircleCards() {
    SimpleGrid(
        modifier = Modifier.fillMaxWidth().columnGap(10.px),
        numColumns = numColumns(base = 1, lg = 3)
    ) {
        Column(
            modifier = Modifier.padding(topBottom = 20.px).height(460.px),
            verticalArrangement = Arrangement.Center
        ) {
            CircleCard("Initial Consultation", Constants.CONSULT, Res.Image.collaboration)

        }
        Column(
            modifier = Modifier.padding(topBottom = 20.px).height(460.px),
            verticalArrangement = Arrangement.Center
        ) {
            CircleCard("Implement Solutions", Constants.IMPLEMENT, Res.Image.webdev)

        }
        Column(
            modifier = Modifier.padding(topBottom = 20.px).height(460.px),
            verticalArrangement = Arrangement.Center
        ) {
            CircleCard("Train & Support", Constants.SUPPORT, Res.Image.empower)

        }
    }
}

@Composable
private fun ContactOrSched() {
    P(
        attrs = ContactPStyle.toModifier()
            .toAttrs()
    ) {
        Link(
            modifier = ContactLinkStyle.toModifier(),
            path = "/contact",
            text = "Contact Us "
        )
        Text(" or ")
        Link(
            modifier = ContactLinkStyle.toModifier(),
            path = CONTACT,
            text = "Schedule a call"
        )
        Br()
        Text("To Get Started!")
    }

}

// Style

val IndexH1Style by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .fontWeight(FontWeight.Bold)
            .fontSize(2.cssRem)
            .textAlign(TextAlign.Center)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(5.cssRem)
    }
}

val IndexH3Style by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .fontSize((1.5).cssRem)
            .textAlign(TextAlign.Center)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(3.cssRem)
    }
}

val IndexMainPStyle by ComponentStyle {
    base {
        Modifier
            .padding(top = 10.px)
            .fillMaxWidth()
            .fontSize((1.25).cssRem)
            .fontStyle(FontStyle.Italic)
            .textAlign(TextAlign.Center)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(2.cssRem)
    }
}

val ServiceButtonStyle by ComponentStyle {
    base {
        Modifier
            .fontSize(FontSize.Medium)
            .fontWeight(FontWeight.SemiBold)
            .textAlign(TextAlign.Center)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(FontSize.XLarge)
            .fontWeight(FontWeight.SemiBold)
            .textAlign(TextAlign.Center)
    }
}

val ContactPStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Medium)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(FontSize.XLarge)
    }
}

val ContactLinkStyle by ComponentStyle {
    base {
        Modifier
            .color(onPrimaryContainerLight)
            .fontWeight(FontWeight.SemiBold)
            .fontSize(FontSize.Large)
            .textDecorationLine(TextDecorationLine.None)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(onPrimaryContainerLight)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier
            .color(onTertiaryContainerLight)
    }
    (Breakpoint.MD + anyLink) {
        Modifier
            .fontSize(FontSize.XXLarge)
    }
}