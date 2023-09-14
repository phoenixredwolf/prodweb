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
fun PrivacyIntro() {
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
                Text("Introduction")
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
                Text("An overview of what our policy does and does not cover.")
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
                "PhoenixRedwolf Digital Services, L.L.C. ( PRDS, LLC) values its users' privacy. This Privacy " +
                        "Policy (\"Policy\") will help you understand how we collect and use personal information from those " +
                        "who visit our website or make use of our online facilities and services, and what we will and will " +
                        "not do with the information we collect. Our Policy has been designed and created to ensure those " +
                        "affiliated with PhoenixRedwolf Digital Services, L.L.C. of our commitment and realization of our " +
                        "obligation not only to meet, but to exceed, most existing privacy standards."
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "We reserve the right to make changes to this Policy at any given time. If you want to make sure " +
                        "that you are up to date with the latest changes, we advise you to frequently visit this page. If " +
                        "at any point in time PhoenixRedwolf Digital Services, L.L.C. decides to make use of any personally " +
                        "identifiable information on file, in a manner vastly different from that which was stated when this " +
                        "information was initially collected, the user or users shall be promptly notified by email. Users at " +
                        "that time shall have the option as to whether to permit the use of their information in this separate " +
                        "manner."
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "This Policy applies to PhoenixRedwolf Digital Services, L.L.C., and it governs any and all data " +
                        "collection and usage by us. Through the use of https://www.phoenixredwolf.com, you are therefore " +
                        "consenting to the data collection procedures expressed in this Policy."
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "Please note that this Policy does not govern the collection and use of information by companies " +
                        "that PhoenixRedwolf Digital Services, L.L.C.does not control, nor by individuals not employed or " +
                        "managed by us. If you visit a website that we mention or link to, be sure to review its privacy " +
                        "policy before providing the site with information. It is highly recommended and suggested that you " +
                        "review the privacy policies and statements of any website you choose to use or frequent to better " +
                        "understand the way in which websites garner, make use of and share the information collected."
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text("Specifically, this Policy will inform you of the following")
            Ol {
                Li {
                    Text("What personally identifiable information is collected from you through our website")
                }
                Li {
                    Text("Why we collect personally identifiable information and the legal basis for such collection;")
                }
                Li {
                    Text("How we use the collected information and with whom it may be shared;")
                }
                Li {
                    Text("What choices are available to you regarding the use of your data; and")
                }
                Li {
                    Text("The security procedures in place to protect the misuse of your information")
                }
            }
        }
    }
}
