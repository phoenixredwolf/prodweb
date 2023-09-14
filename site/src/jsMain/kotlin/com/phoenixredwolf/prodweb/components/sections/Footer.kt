package com.phoenixredwolf.prodweb.components.sections

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.widgets.SocialBar
import com.phoenixredwolf.prodweb.theme.LinkBaseStyle
import com.phoenixredwolf.prodweb.theme.primaryGradient
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
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
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import kotlinx.browser.document
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
            if (breakpoint >= Breakpoint.MD) {
                FooterHorizontal(breakpoint)
            } else {
                FooterVertical(breakpoint)
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
private fun FooterHorizontal(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxSize(90.percent)
            .padding(topBottom = 20.px)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialBar(true)
            Column {
                PrivacyPolicyLink()
                CreditPage()
            }
            Copyright(breakpoint)
            FooterMenu(breakpoint)
        }
    }
}

@Composable
private fun FooterVertical(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxWidth(90.percent)
            .fillMaxHeight()
            .padding(topBottom = 25.px)
            .margin(topBottom = 25.px),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialBar(true)
        FooterMenu(breakpoint, true)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                PrivacyPolicyLink()
                CreditPage()
            }
            Copyright(breakpoint)
        }
    }
}

@Composable
private fun FooterMenu(breakpoint: Breakpoint, vert:Boolean = false) {
    if (vert) {
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
    } else {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Large),
                path = "/",
                text = "Home"
            )
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Large),
                path = "/services",
                text = "Services"
            )
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Large),
                path = "/consult",
                text = "Consult"
            )
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Large),
                path = "/about",
                text = "About"
            )
            Link(
                modifier = LinkBaseStyle.toModifier()
                    .padding(leftRight = 10.px)
                    .fontSize(FontSize.Large),
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
private fun Copyright(breakpoint: Breakpoint) {
    P(
        attrs = Modifier
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Small)
            .padding( top = if (breakpoint >= Breakpoint.MD) 25.px else 15.px)
            .toAttrs()
    ) {
        FaCopyright(
            modifier = Modifier.padding(right = 10.px)
        )
        Text("${Date().getFullYear()} All Rights Reserved")
    }
}

