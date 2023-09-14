package com.phoenixredwolf.prodweb.components.sections.privacy

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.NavItemStyle
import com.phoenixredwolf.prodweb.utility.Constants.CALL_LINK
import com.phoenixredwolf.prodweb.utility.Constants.PRIVACYMAIL
import com.varabyte.kobweb.compose.css.AlignContent
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun Acceptance() {
    Row(
        modifier = Modifier
            .classNames("collapsible", "d-flex", "flex-row")
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .classNames("p-2")
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            H2(
                attrs = Modifier
                    .toAttrs()
            ) {
                Text("Acceptance")
            }
            P(
                attrs = Modifier
                    .classNames("flex-fill", "align-middle")
                    .fillMaxHeight()
                    .alignContent(AlignContent.Center)
                    .textAlign(TextAlign.End)
                    .padding(top = 10.px)
                    .toAttrs()
            ) {
                Text("Your acceptance of the policy.")
            }
        }
    }
    Row(
        modifier = Modifier
            .classNames("content", "d-flex", "flex-column", "mb-3")
            .fillMaxWidth()
            .textAlign(TextAlign.Justify)
    ) {
        P(
            attrs = Modifier
                .classNames("fs-6", "mt-3")
                .toAttrs()
        ) {
            Text(
                "By using this website, you are hereby accepting the terms and conditions stipulated within the " +
                        "Privacy Policy Agreement. If you are not in agreement with our terms and conditions, then " +
                        "you should refrain from further use of our sites. In addition, your continued use of our " +
                        "website following the posting of any updates or changes to our terms and conditions shall " +
                        "mean that you agree and acceptance of such changes."
            )
        }
        H4(
            attrs = Modifier
                .classNames("mt-3")
                .toAttrs()
        ) {
            Text("How to Contact Us")
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "If you have any questions or concerns regarding the Privacy Policy Agreement related to our " +
                        "website, please feel free to contact us at the following email, telephone number or mailing " +
                        "address."
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text("Email: ")
            Link(
                path = PRIVACYMAIL,
                content = {
                    Text("contact@phoenixredolf.com")
                },
                modifier = NavItemStyle.toModifier()
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text("Telephone Number: ")
            Link(
                path = CALL_LINK,
                content = {
                    Text("+1 (856) 347-0392")
                },
                modifier = NavItemStyle.toModifier()
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text("Mailing Address: ")
            Br()
            Text("PhoenixRedwolf Digital Services, L.L.C.")
            Br()
            Text("1301 Lafayette Avenue")
            Br()
            Text("West Deptford, New Jersey 08096")
        }
    }
}