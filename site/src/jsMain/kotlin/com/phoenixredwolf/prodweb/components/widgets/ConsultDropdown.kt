package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.Dropdowncardstyle
import com.phoenixredwolf.prodweb.theme.NavItemStyle
import com.phoenixredwolf.prodweb.theme.NavStyle
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun ConsultDropdown() {
    Column(
        modifier = NavStyle.toModifier()
            .classNames("drop-item")
            .margin(10.px)
            .padding(10.px)
            .width(Width.FitContent),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = Dropdowncardstyle.toModifier(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FaLaptop(
                modifier = Modifier.padding(right = 20.px),
                size = IconSize.LG
            )
            Link(
                path = "/consult/itconsult",
                text = "IT Consulting",
                modifier = NavItemStyle.toModifier()
                    .textDecorationLine(TextDecorationLine.None)
            )
        }
        Row(
            modifier = Dropdowncardstyle.toModifier(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FaGears(
                modifier = Modifier.padding(right = 20.px),
                size = IconSize.LG
            )
            Link(
                path = "/consult/itoper",
                text = "Operations",
                modifier = NavItemStyle.toModifier()
                    .textDecorationLine(TextDecorationLine.None)
            )
        }
        Row(
            modifier = Dropdowncardstyle.toModifier(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FaShield(
                modifier = Modifier.padding(right = 20.px),
                size = IconSize.LG
            )
            Link(
                path = "/consult/cyber",
                text = "Cyber Security",
                modifier = NavItemStyle.toModifier()
                    .textDecorationLine(TextDecorationLine.None)
            )
        }
        Row(
            modifier = Dropdowncardstyle.toModifier(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FaHurricane(
                modifier = Modifier.padding(right = 20.px),
                size = IconSize.LG
            )
            Link(
                path = "/consult/risk",
                text = "Risk Assessments",
                modifier = NavItemStyle.toModifier()
                    .textDecorationLine(TextDecorationLine.None)
            )
        }
    }
}