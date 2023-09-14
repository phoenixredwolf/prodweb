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
fun InfoUse(){
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
                Text("Information Use")
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
                Text("How do we use the information we collect?")
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
            Text("Why we collect information and for how long")
        }
        P(
            attrs = Modifier
                .classNames("fs-6", "mt-3")
                .toAttrs()
        ) {
            Text("We are collecting your data for several reasons:")
            Br()
            Br()
            Ul {
                Li {
                    Text("To better understand your needs and provide you with the services you have requested;")
                }
                Li {
                    Text("To fulfill our legitimate interest in improving our services and products;")
                }
                Li {
                    Text("To send you promotional emails containing information we think you may like when we " +
                            "have your consent to do so;")
                }
                Li {
                    Text("To contact you to fill out surveys or participate in other types of market research, " +
                            "when we have your consent to do so;")
                }
                Li {
                    Text("To customize our website according to your online behavior and personal preferences.")
                }
            }
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "The data we collect from you will be stored for no longer than necessary. The length of time " +
                        "we retain said information will be determined based upon the following criteria: the length " +
                        "of time your personal information remains relevant; the length of time it is reasonable to " +
                        "keep records to demonstrate that we have fulfilled our duties and obligations; any " +
                        "limitation periods within which claims might be made; any retention periods prescribed by " +
                        "law or recommended by regulators, professional bodies or associations; the type of contract " +
                        "we have with you, the existence of your consent, and our legitimate interest in keeping such" +
                        "information as stated in this Policy."
            )
        }
        H4 {
            Text("How we use your information")
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C. does not now, nor will it in the future, sell, rent or" +
                        " lease any of its customer lists and/or names to any third parties."
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C. may collect and may make use of personal information " +
                        "to assist in the operation of our website and to ensure delivery of the services you need " +
                        "and request. At times, we may find it necessary to use personally identifiable information " +
                        "as a means to keep you informed of other possible products and/or services that may be " +
                        "available to you from https://www.phoenixredwolf.com"
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C. may also be in contact with you with regards to " +
                        "completing surveys and/or research questionnaires related to your opinion of current or " +
                        "potential future services that may be offered."
            )
        }
        P(
            attrs = Modifier
                .classNames("fs-6")
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C.uses various third-party social media features " +
                        "including but not limited to Facebook, LinkedIn and other interactive programs. These may " +
                        "collect your IP address and require cookies to work properly. These services are governed " +
                        "by the privacy policies of the providers and are not within PhoenixRedwolf Digital Services, " +
                        "L.L.C.'s control."
            )
        }
    }
}