package com.phoenixredwolf.prodweb.components.sections

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.widgets.SocialBar
import com.phoenixredwolf.prodweb.theme.LinkBaseStyle
import com.phoenixredwolf.prodweb.theme.primaryGradient
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.dom.ref
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaCopyright
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import kotlinx.browser.document
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import kotlin.js.Date

@Composable
fun Footer(modifier: Modifier = Modifier, breakpoint: Breakpoint) {
    Row(Modifier.fillMaxWidth().then(modifier)) {
        Box(
            modifier = Modifier
                .classNames("footer")
                .fillMaxSize()
                .backgroundImage(primaryGradient),
            contentAlignment = Alignment.Center
        ) {
            SimpleGrid(
                modifier = Modifier
                    .fillMaxWidth(90.percent),
                numColumns = numColumns(base = 1, md=3)
            ){
                Row(
                    modifier = Modifier.padding(topBottom = 10.px),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SocialBar(true)
                }
                Row(
                    modifier = Modifier.padding(topBottom = 10.px),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    FooterMenu()

                }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.margin(bottom = 15.px),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Copyright()
                        PrivacyPolicyLink()
                        CreditPage()
                    }
                }
            }
        }
    }
    Box (
        ref = ref {
            val script = document.createElement("script")
            script.asDynamic().src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
            it.appendChild(script)
        }
    )
}

@Composable
private fun FooterMenu() {
    SimpleGrid(
        modifier = Modifier.width(auto),
        numColumns = numColumns(base = 1, lg = 2)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Medium),
                path = "/",
                text = "Home"
            )
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Medium),
                path = "/services",
                text = "Services"
            )
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Medium),
                path = "/consult",
                text = "Consult"
            )
        }
        Row(
            modifier = GridRowStyle.toModifier(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Medium),
                path = "/about",
                text = "About"
            )
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Medium),
                path = "/contact",
                text = "Contact"
            )
        }
    }
}

@Composable
private fun PrivacyPolicyLink() {
    Link(
        modifier = LinkBaseStyle.toModifier()
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Small),
        path = "/privacy"
    ) {
        Text("Privacy Policy")
    }
}

@Composable
private fun CreditPage() {
    Link(
        modifier = LinkBaseStyle.toModifier()
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Small),
        path = "/credits",
        content = { Text("Credits") }
    )
}

@Composable
private fun Copyright() {
    P(
        attrs = CopyrightStyle.toModifier()
            .toAttrs()
    ) {
        FaCopyright(
            modifier = Modifier.padding(right = 10.px)
        )
        Text("${Date().getFullYear()} All Rights Reserved")
    }
}

// Style
val CopyrightStyle by ComponentStyle {
    base {
        Modifier
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Small)
            .padding(top = 15.px)
    }
    Breakpoint.MD {
        Modifier
            .padding(top = 25.px)
    }
}

val GridRowStyle by ComponentStyle {
    base {
        Modifier.width(auto)
    }
    Breakpoint.LG {
        Modifier.width(Width.MinContent)
    }
}