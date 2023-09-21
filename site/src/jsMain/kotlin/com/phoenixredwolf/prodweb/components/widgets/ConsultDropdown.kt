package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.models.Consulting
import com.phoenixredwolf.prodweb.theme.Dropdowncardstyle
import com.phoenixredwolf.prodweb.theme.NavItemStyle
import com.phoenixredwolf.prodweb.theme.NavStyle
import com.phoenixredwolf.prodweb.theme.primaryLight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaEllipsis
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text

@Composable
fun ConsultDropdown() {
    Column(
        modifier = NavStyle.toModifier()
            .classNames("drop-item")
            .margin(10.px)
            .padding(10.px)
            .width(Width.FitContent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .classNames("drop-item")
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            H3(
                attrs = Modifier
                    .color(primaryLight)
                    .toAttrs(),
                content = { Text("Consulting Services") }
            )
        }
        Row(
            modifier = NavStyle.toModifier()
                .classNames("drop-item"),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier
                    .margin(leftRight = 5.px)
            ) {
                Consulting.values().take(4).forEach { consult ->
                    Row(
                        modifier = Dropdowncardstyle.toModifier(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        consult.menuIcon()
                        Link(
                            path = consult.path,
                            text = consult.title,
                            modifier = NavItemStyle.toModifier()
                                .textDecorationLine(TextDecorationLine.None)
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .margin(leftRight = 5.px)
            ) {
                Consulting.values().drop(4).take(3).forEach { consult ->
                    Row(
                        modifier = Dropdowncardstyle.toModifier(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            modifier = Modifier.width(50.px)
                        ) {
                            consult.menuIcon()
                        }
                        Link(
                            path = consult.path,
                            text = consult.title,
                            modifier = NavItemStyle.toModifier()
                                .textDecorationLine(TextDecorationLine.None)
                        )
                    }
                }
                Row(
                    modifier = Dropdowncardstyle.toModifier(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier.width(50.px)
                    ) {
                        FaEllipsis(
                            modifier = Modifier.padding(right = 20.px),
                            size = IconSize.LG
                        )
                    }
                    Link(
                        path = "/consult",
                        text = "Other Services",
                        modifier = NavItemStyle.toModifier()
                            .textDecorationLine(TextDecorationLine.None)
                    )
                }
            }
        }
    }
}