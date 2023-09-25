package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.theme.errorLight
import com.phoenixredwolf.prodweb.theme.onPrimaryContainerLight
import com.phoenixredwolf.prodweb.theme.primaryContainerLight
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextTransform
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun EmailAd() {
    Column(
        modifier = Modifier
            .width(300.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(90.percent)
                .background(primaryContainerLight)
        ) {
            Image(
                src = Res.Image.icon,
                modifier = Modifier
                    .height(50.px)
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.8),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    src = Res.Image.logo,
//                    modifier = Modifier
//                        .height(100.px)
                )
            }
        }
        Spacer()
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            H1(
                attrs = Modifier
                    .color(onPrimaryContainerLight)
                    .textTransform(TextTransform.Uppercase)
                    .toAttrs(),
                content = { Text("Sign up for our newsletter") }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            H2(
                attrs = Modifier
                    .color(onPrimaryContainerLight)
                    .textTransform(TextTransform.Uppercase)
                    .toAttrs(),
                content = { Text("enjoy 20% off web or software development services.") }
            )
        }
        Form(
            action = "",
            attrs = ContactFormStyle.toModifier()
                .toAttrs()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(90.percent)
            ) {
                Div(
                    attrs = Modifier.fillMaxWidth().toAttrs()
                ) {
                    Label(
                        forId = "company",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("Company") }
                    )
                    Input(
                        type = InputType.Text,
                        attrs = FormInputStyle.toModifier()
                            .id("company")
                            .classNames("form-control")
                            .attrsModifier {
                                attr("required", "true")
                                attr("name", "company")
                            }
                            .toAttrs()
                    )
                }
                Div(
                    attrs = Modifier.fillMaxWidth().toAttrs()
                ) {
                    Label(
                        forId = "name",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("Name") }
                    )
                    Input(
                        type = InputType.Text,
                        attrs = FormInputStyle.toModifier()
                            .id("name")
                            .classNames("form-control")
                            .attrsModifier {
                                attr("required", "true")
                                attr("name", "name")
                            }
                            .toAttrs()
                    )
                }
                Div(
                    attrs = Modifier.fillMaxWidth().toAttrs()
                ) {
                    Label(
                        forId = "email",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("Email") }
                    )
                    Input(
                        type = InputType.Email,
                        attrs = FormInputStyle.toModifier()
                            .id("email")
                            .classNames("form-control")
                            .attrsModifier {
                                attr("required", "true")
                                attr("name", "email")
                            }
                            .toAttrs()
                    )
                }
                Div(
                    attrs = Modifier.fillMaxWidth().toAttrs()
                ) {
                    Label(
                        forId = "phone",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = {
                            Text("Phone ")
                            Span(
                                attrs = Modifier
                                    .fontSize(FontSize.XSmall)
                                    .color(errorLight)
                                    .toAttrs(),
                                content = { Text("(optional)") }
                            )
                        }
                    )
                    Input(
                        type = InputType.Email,
                        attrs = FormInputStyle.toModifier()
                            .id("phone")
                            .classNames("form-control")
                            .onKeyDown {
                                phoneMask()
                            }
                            .attrsModifier {
                                attr("placeholder", "(###) ###-####")
                                attr("name", "true")
                            }
                            .toAttrs()
                    )
                }
            }
        }
    }
}