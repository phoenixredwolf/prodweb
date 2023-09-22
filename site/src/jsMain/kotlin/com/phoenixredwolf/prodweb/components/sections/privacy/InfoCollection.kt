package com.phoenixredwolf.prodweb.components.sections.privacy

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun InfoCollection() {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        H2(
            content = { Text("Information We Collect") }
        )
        P(
            attrs = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text("What information do we collect from our customers?")
        }
        P(
            attrs = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "It is always up to you whether to disclose personally identifiable information to us, although " +
                        "if you elect not to do so, we reserve the right not to register you as a user or provide " +
                        "you with any products or services. This website collects various types of information, such as:"
            )
            Ul(
                attrs = Modifier.margin(top = 25.px).toAttrs()
            ) {
                Li {
                    Text(
                        "Voluntarily provided information which may include your name, address, email address, " +
                                "billing and/or credit card information etc. which may be used when you purchase products " +
                                "and/or services and to deliver the services you have requested."
                    )
                }
            }
        }
        P(
            attrs = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "In addition, PhoenixRedwolf Digital Services, L.L.C. may have the occasion to collect " +
                        "non-personal anonymous demographic information, such as age, gender, household income, " +
                        "political affiliation, race and religion, as well as the type of browser you are using, IP " +
                        "address, or type of operating system, which will assist us in providing and maintaining " +
                        "superior quality service."
            )
        }
        P(
            attrs = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "Please rest assured that this site will only collect personal information that you knowingly " +
                        "and willingly provide to us by way of surveys, completed membership forms, and emails. It " +
                        "is the intent of this site to use personal information only for the purpose for which it was " +
                        "requested, and any additional uses specifically provided for on this Policy."
            )
        }
    }

}
