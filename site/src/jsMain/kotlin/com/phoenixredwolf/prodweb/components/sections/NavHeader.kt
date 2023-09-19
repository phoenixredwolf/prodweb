package com.phoenixredwolf.prodweb.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.phoenixredwolf.prodweb.components.widgets.ConsultDropdown
import com.phoenixredwolf.prodweb.components.widgets.ServicesDropdown
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Constants.CONTACT
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.dom.ElementTarget
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.overlay.PopupPlacement
import com.varabyte.kobweb.silk.components.overlay.Tooltip
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.addVariant
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun NavHeader(
    breakpoint: Breakpoint,
    onMenuClicked: () -> Unit
) {
    var colorMode by ColorMode.currentState

    Row(
        modifier = NavHeaderStyle.toModifier()
            .padding(top=5.px)
            .fillMaxWidth()
            .backgroundColor(if(colorMode == ColorMode.LIGHT) surfaceLight else surfaceDark)
            .position(Position.Fixed)
            .zIndex(2),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(90.percent),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                PhoneWidget()
                if (breakpoint > Breakpoint.MD) {
                    Button(
                        onClick = { colorMode = colorMode.opposite },
                        NavItemStyle.toModifier(NavButtonVariant)
                    ) {
                        Box(Modifier.margin(8.px)) {
                            when (colorMode) {
                                ColorMode.LIGHT -> FaMoon()
                                ColorMode.DARK -> FaSun()
                            }
                        }
                    }
                    Tooltip(ElementTarget.PreviousSibling, "Toggle color mode", placement = PopupPlacement.BottomRight)
                }
            }
            Row(
                Modifier.fillMaxSize(90.percent)
                    .margin(topBottom = 25.px),
                verticalAlignment = Alignment.CenterVertically
            ) {
                HeaderLogo(breakpoint, onMenuClicked)
                if (breakpoint > Breakpoint.MD) {
                    RightSide()
                }
            }
        }
    }
}

// Components
@Composable
private fun HeaderLogo(
    breakpoint: Breakpoint,
    onMenuClicked: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint <= Breakpoint.MD) {
            FaBars(
                modifier = Modifier
                    .margin(right = 25.px)
                    .onClick { onMenuClicked() },
                size = IconSize.XL
            )
        }
        A(
            attrs = Modifier
                .attrsModifier {
                    attr("href", "/")
                }
                .toAttrs()
        ) {
            Image(
                src = Res.Image.logo,
                desc = "Logo Image",
                modifier = Modifier
                    .cursor(Cursor.Pointer)
            )
        }

    }
}

@Composable
private fun RightSide() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(50.px)
            .backgroundColor(surfaceLight)
            .padding(all = 10.px)
            .margin(left = 40.px),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Link(
            path = "/",
            text = "Home",
            modifier = NavItemStyle.toModifier().padding(leftRight = 10.px)
        )
        Div(
            attrs = NavStyle.toModifier()
                .width(Width.FitContent)
                .classNames("navbar")
                .padding(leftRight = 10.px, topBottom = 0.px).toAttrs()
        ) {
            Div(
                attrs = NavStyle.toModifier()
                    .classNames("navbaritems", "dropdown")
                    .padding(topBottom = 0.px)
                    .toAttrs()
            ) {
                A(
                    attrs = NavItemStyle.toModifier()
                        .attrsModifier {
                            attr("href", "/service")
                        }
                        .cursor(Cursor.Pointer)
                        .padding(right = 10.px)
                        .toAttrs(),
                    content = { Text("Services") }
                )
                Div(
                    attrs = NavItemStyle.toModifier()
                        .classNames("services")
                        .toAttrs()
                ) {
                    Div(
                        attrs = NavItemStyle.toModifier()
                            .classNames("dropitems")
                            .width(Width.FitContent)
                            .toAttrs()
                    ) {
                        ServicesDropdown()
                    }
                }
            }
        }
        Div(
            attrs = NavStyle.toModifier()
                .width(Width.FitContent)
                .classNames("navbar")
                .padding(leftRight = 10.px, topBottom = 0.px).toAttrs()
        ) {
            Div(
                attrs = NavStyle.toModifier()
                    .classNames("navbaritems", "dropdown")
                    .padding(topBottom = 0.px)
                    .toAttrs()
            ) {
                A(
                    attrs = NavItemStyle.toModifier()
                        .attrsModifier {
                            attr("href", "/consult")
                        }
                        .cursor(Cursor.Pointer)
                        .padding(right = 10.px)
                        .toAttrs(),
                    content = { Text("Consult") }
                )
                Div(
                    attrs = NavItemStyle.toModifier()
                        .classNames("services")
                        .toAttrs()
                ) {
                    Div(
                        attrs = NavItemStyle.toModifier()
                            .classNames("dropitems")
                            .width(Width.FitContent)
                            .toAttrs()
                    ) {
                        ConsultDropdown()
                    }
                }
            }
        }
        Link(
            path = "/about",
            text = "About",
            modifier = NavItemStyle.toModifier().padding(leftRight = 10.px)
        )
        Link(
            path = "/contact",
            text = "Contact",
            modifier = NavItemStyle.toModifier().padding(left = 10.px, right = 20.px)
        )
    }
}

@Composable
private fun PhoneWidget() {
    Div(
        attrs = Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.End)
            .alignContent(AlignContent.Center)
            .toAttrs()
    ) {
        FaPhone(
            modifier = Modifier
                .padding(top = 10.px, right = 10.px)
                .color(secondaryLight),
            size = IconSize.LG
        )
        A(
            attrs = LinkBaseStyle.toModifier()
                .attrsModifier {
                    attr("href", "tel:8563470392")
                }
                .toAttrs(),
            content = { Text("(856) 347-0392") }
        )
        Text(" or ")
        Link(
            modifier = LinkBaseStyle.toModifier().padding(right = 10.px),
            path = CONTACT,
            text = "Schedule a Call!"
        )
    }
}

// Styles

val NavButtonVariant by NavItemStyle.addVariant {
    base { Modifier.padding(0.px).borderRadius(50.percent) }
}

val NavHeaderStyle by ComponentStyle.base(extraModifiers = { SmoothColorStyle.toModifier() }) {
    Modifier
        .fillMaxWidth()
        .backgroundImage(primaryGradient)
}