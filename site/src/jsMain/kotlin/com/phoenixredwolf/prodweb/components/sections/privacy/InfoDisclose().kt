package com.phoenixredwolf.prodweb.components.sections.privacy

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.AlignContent
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun InfoDisclose() {
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
                Text("Information Sharing")
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
                Text("Do we share our information?")
            }
        }
    }
    Row(
        modifier = Modifier
            .classNames("content", "d-flex", "flex-column", "mb-3")
            .fillMaxWidth()
            .textAlign(TextAlign.Justify)
    ) {
        H4(
            attrs = Modifier
                .classNames("mt-3")
                .toAttrs()
        ) {
            Text("Disclosure of Information")
        }
        P(
            attrs = Modifier
                .classNames("fs-6", "mt-3")
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C. may not use or disclose the information provided by " +
                        "you except under the following circumstances:")
            Br()
            Br()
            Ul {
                Li {
                    Text("as necessary to provide services or products you have ordered;")
                }
                Li {
                    Text("in other ways described in this Policy or to which you have otherwise consented;")
                }
                Li {
                    Text(
                        "in the aggregate with other information in such a way so that your identity cannot " +
                                "reasonably be determined;"
                    )
                }
                Li {
                    Text("as required by law, or in response to a subpoena or search warrant;")
                }
                Li {
                    Text("to outside auditors who have agreed to keep the information confidential;")
                }
                Li {
                    Text("as necessary to enforce the Terms of Service;")
                }
                Li {
                    Text(
                        "as necessary to maintain, safeguard and preserve all the rights and property of " +
                                "PhoenixRedwolf Digital Services, L.L.C..")
                }
            }
        }
        H4 {
            Text("Non-Marketing Purposes")
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C. greatly respects your privacy. We do maintain and " +
                        "reserve the right to contact you if needed for non-marketing purposes (such as bug alerts, " +
                        "security breaches, account issues, and/or changes in PhoenixRedwolf Digital Services, L.L.C. " +
                        "products and services). In certain circumstances, we may use our website, newspapers, or " +
                        "other public means to post a notice."
            )
        }
        H4 {
            Text("Children under the age of 13")
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C.'s website is not directed to, and does not knowingly " +
                        "collect personal identifiable information from, children under the age of thirteen (13). If " +
                        "it is determined that such information has been inadvertently collected on anyone under the " +
                        "age of thirteen (13), we shall immediately take the necessary steps to ensure that such " +
                        "information is deleted from our system's database, or in the alternative, that verifiable " +
                        "parental consent is obtained for the use and storage of such information. Anyone under the " +
                        "age of thirteen (13) must seek and obtain parent or guardian permission to use this website."
            )
        }

    }
}