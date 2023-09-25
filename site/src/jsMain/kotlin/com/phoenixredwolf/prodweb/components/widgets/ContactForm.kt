package com.phoenixredwolf.prodweb.components.widgets

import androidx.compose.runtime.*
import com.phoenixredwolf.prodweb.theme.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.KeyboardEvent

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun ContactForm(breakpoint: Breakpoint) {

    var phoneType by remember { mutableStateOf("") }

        Form(
            action = "https://formspree.io/f/mdorgnrv",
            attrs = ContactFormStyle.toModifier()
                .attrsModifier {
                    attr("method", "POST")
                    attr("autocomplete", "off")
                }
                .toAttrs()
        ) {
            SimpleGrid(
                modifier = Modifier
                    .columnGap(10.px)
                    .alignContent(AlignContent.SpaceEvenly),
                numColumns = numColumns(1, lg = 2)
            ) {
                Div{
                    Label(
                        forId = "fname",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("First Name") }
                    )
                    Input(
                        type = InputType.Text,
                        attrs = FormInputStyle.toModifier()
                            .id("fname")
                            .classNames("form-control")
                            .attrsModifier {
                                attr("required", "true")
                                attr("name", "fname")
                            }
                            .toAttrs()
                    )
                }
                Div{
                    Label(
                        forId = "lname",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("Last Name") }
                    )
                    Input(
                        type = InputType.Text,
                        attrs = FormInputStyle.toModifier()
                            .id("lastName")
                            .classNames("form-control")
                            .attrsModifier {
                                attr("required", "true")
                                attr("name", "lname")
                            }
                            .toAttrs()
                    )
                }
                Div(
                    attrs = Modifier
                        .gridColumn(1,if(breakpoint >= Breakpoint.LG) 3 else 1)
                        .toAttrs()
                ){
                    Label(
                        forId = "cname",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("Company Name") }
                    )
                    Input(
                        type = InputType.Text,
                        attrs = FormInputStyle.toModifier()
                            .id("cname")
                            .classNames("form-control")
                            .attrsModifier {
                                attr("required", "true")
                                attr("name", "cname")
                            }
                            .toAttrs()
                    )
                }
                Div(
                    attrs = Modifier
                        .gridColumn(1,if(breakpoint >= Breakpoint.LG) 3 else 1)
                        .toAttrs()
                ){
                    Label(
                        forId = "email",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("Email Address") }
                    )
                    Input(
                        type = InputType.Email,
                        attrs = FormInputStyle.toModifier()
                            .id("email")
                            .classNames("form-control")
                            .attrsModifier {
                                attr("required", "true")
                                attr("email", "email")
                                attr("autoComplete", "givenName")
                            }
                            .toAttrs()
                    )
                }
                Div {
                    Label(
                        forId = "phone",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-label")
                            .toAttrs(),
                        content = { Text("Phone Number") }
                    )
                    Input(
                        type = InputType.Text,
                        attrs = FormInputStyle.toModifier()
                            .id("phone")
                            .classNames("form-control")
                            .onKeyDown {
                                phoneMask()
                            }
                            .attrsModifier {
                                attr("placeholder", "(###) ###-####")
                                attr("required", "true")
                                attr("name", "phone")
                            }
                            .toAttrs()
                    )
                }
                Div {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .margin(top = 25.px)
                            .padding(left = 10.px),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center
                    ) {
                        RadioGroup(
                            checkedValue = phoneType,
                            name = "Phone Type",
                            content = {
                                Row(
                                    modifier = Modifier
                                        .cursor(Cursor.Pointer),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioInput(
                                        value = "Mobile",
                                        id = "mobile",
                                        attrs = Modifier
                                            .padding(right = 10.px)
                                            .onClick {
                                                phoneType = "Mobile"
                                            }
                                            .toAttrs()
                                    )
                                    Label(
                                        forId = "mobile",
                                        attrs = FormCheckLabelStyle.toModifier()
                                            .classNames("form-check-label")
                                            .toAttrs(),
                                        content = { Text("Mobile") }
                                    )
                                }
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioInput(
                                        value = "Landline",
                                        id = "landline",
                                        attrs = Modifier
                                            .padding(right = 10.px)
                                            .onClick {
                                                phoneType = "Landline"
                                            }
                                            .toAttrs()
                                    )
                                    Label(
                                        forId = "landline",
                                        attrs = FormCheckLabelStyle.toModifier()
                                            .classNames("form-check-label")
                                            .toAttrs(),
                                        content = { Text("Landline") }
                                    )
                                }
                            }
                        )
                    }
                }

                P(
                    attrs = PContactFormStyle.toModifier()
                        .gridColumn(1,if(breakpoint >= Breakpoint.LG) 3 else 1)
                        .toAttrs(),
                ) {
                    Span(
                        attrs = Modifier
                            .fontSize(FontSize.Large)
                            .fontWeight(FontWeight.SemiBold)
                            .toAttrs(),
                        content = { Text("How can we help?") }
                    )
                    Br()
                    Span(
                        attrs = Modifier
                            .fontSize(FontSize.Smaller)
                            .toAttrs(),
                        content = { Text("Check all that apply") }
                    )
                }
                SimpleGrid(
                    modifier = Modifier
                        .classNames("form-check")
                        .gridColumn(1,if(breakpoint >= Breakpoint.LG) 3 else 1),
                    numColumns = numColumns(1, md = 2)
                ) {
                    Row {
                        Input(
                            type = InputType.Checkbox,
                            attrs = CheckBoxStyle.toModifier()
                                .classNames("form-check-input")
                                .attrsModifier {
                                    attr("value", "IT Services")
                                    attr("name", "itServices")
                                }
                                .id("checkIt")
                                .toAttrs()
                        )
                        Label(
                            forId = "checkIt",
                            attrs = FormCheckLabelStyle.toModifier()
                                .classNames("form-check-label")
                                .toAttrs(),
                            content = { Text("IT Services") }
                        )
                    }
                    Row {
                        Input(
                            type = InputType.Checkbox,
                            attrs = CheckBoxStyle.toModifier()
                                .classNames("form-check-input")
                                .attrsModifier {
                                    attr("value", "Software")
                                    attr("name", "software")
                                }
                                .id("checkSoft")
                                .toAttrs()
                        )
                        Label(
                            forId = "checkSoft",
                            attrs = FormCheckLabelStyle.toModifier()
                                .classNames("form-check-label")
                                .toAttrs(),
                            content = { Text("Software Development") }
                        )
                    }
                    Row {
                        Input(
                            type = InputType.Checkbox,
                            attrs = CheckBoxStyle.toModifier()
                                .classNames("form-check-input")
                                .attrsModifier {
                                    attr("value", "Cloud")
                                    attr("name", "cloud")
                                }
                                .id("checkCloud")
                                .toAttrs()
                        )
                        Label(
                            forId = "checkCloud",
                            attrs = FormCheckLabelStyle.toModifier()
                                .classNames("form-check-label")
                                .toAttrs(),
                            content = { Text("Cloud Services") }
                        )
                    }
                    Row {
                        Input(
                            type = InputType.Checkbox,
                            attrs = CheckBoxStyle.toModifier()
                                .classNames("form-check-input")
                                .attrsModifier {
                                    attr("value", "Web")
                                    attr("name", "web")
                                }
                                .id("checkWeb")
                                .toAttrs()
                        )
                        Label(
                            forId = "checkWeb",
                            attrs = FormCheckLabelStyle.toModifier()
                                .classNames("form-check-label")
                                .toAttrs(),
                            content = { Text("Web Development") }
                        )
                    }
                    Row {
                        Input(
                            type = InputType.Checkbox,
                            attrs = CheckBoxStyle.toModifier()
                                .classNames("form-check-input")
                                .attrsModifier {
                                    attr("value", "Network")
                                    attr("name", "network")
                                }
                                .id("checkNet")
                                .toAttrs()
                        )
                        Label(
                            forId = "checkNet",
                            attrs = FormCheckLabelStyle.toModifier()
                                .classNames("form-check-label")
                                .toAttrs(),
                            content = { Text("Networking") }
                        )
                    }
                    Row {
                        Input(
                            type = InputType.Checkbox,
                            attrs = CheckBoxStyle.toModifier()
                                .classNames("form-check-input")
                                .attrsModifier {
                                    attr("value", "Other")
                                    attr("name", "other")
                                }
                                .id("checkOther")
                                .toAttrs()
                        )
                        Label(
                            forId = "checkOther",
                            attrs = FormCheckLabelStyle.toModifier()
                                .classNames("form-check-label")
                                .toAttrs(),
                            content = { Text("Other") }
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(topBottom = 10.px)
                        .gridColumn(1,if(breakpoint >= Breakpoint.LG) 3 else 1)
                        .fillMaxWidth()
                ) {
                    Label(
                        forId = "commentsbox",
                        attrs = FormLabelsStyle.toModifier()
                            .classNames("form-check-label")
                            .toAttrs(),
                        content = { Text("Additional Information (optional)")}
                    )
                    TextArea(
                        attrs = FormInputStyle.toModifier()
                            .id("commentsbox")
                            .classNames("form-control")
                            .height(150.px)
                            .attrsModifier {
                                attr("name","comments")
                            }
                            .toAttrs()
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 10.px)
                        .gridColumn(1,if(breakpoint >= Breakpoint.LG) 3 else 1)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        attrs = FormButtonStyle.toModifier()
                            .classNames("btn", "btn-primary")
                            .attrsModifier {
                                attr("type","submit")
                            }
                            .toAttrs(),
                        content = { Text("Submit") }
                    )
                    Button(
                        attrs = FormButtonStyle.toModifier()
                            .classNames("btn")
                            .attrsModifier {
                                attr("type","reset")
                            }
                            .toAttrs(),
                        content = { Text("Reset") }
                    )
                }
            }
        }
}

fun phoneMask() {
    val phoneInput = document.getElementById("phone") as? HTMLInputElement

    phoneInput?.addEventListener("keydown", { event ->
        val keyCode = (event as? KeyboardEvent)?.keyCode ?: 0
        val inputValue = phoneInput.value

        // Allow only numeric keys and backspace
        if (
            ((keyCode in 48..57 || keyCode in 96..105 || keyCode == 8 || keyCode == 37 || keyCode == 39) && inputValue.length < 14) ||
            ((keyCode == 8 || keyCode == 46 || keyCode == 37 || keyCode == 39) && inputValue.length == 14)
            ) {
            val unmaskedValue = inputValue.replace(Regex("[^0-9]"), "")

            val maskedValue = buildString {
                for (i in unmaskedValue.indices) {
                    if (i == 0) append("(")
                    if (i == 3) append(") ")
                    if (i == 6) append("-")
                    append(unmaskedValue[i])
                }
            }

            phoneInput.value = maskedValue
        } else {
            event.preventDefault()
        }
    })
}


val FormButtonStyle by ComponentStyle {
    base{
        Modifier
            .width(75.px)
            .color(if(colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
            .background(if(colorMode == ColorMode.LIGHT) primaryContainerLight else primaryContainerDark)
            .border {
                color(if(colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark)
            }
            .transition(CSSTransition("background", 500.ms))
    }
    hover {
        Modifier
            .color(if(colorMode == ColorMode.LIGHT) onSecondaryContainerLight else onSecondaryContainerDark)
            .background(if(colorMode == ColorMode.LIGHT) secondaryContainerLight else secondaryContainerDark)
            .boxShadow(5.px, 5.px, 10.px, color = Colors.Black)
            .border { width(0.px) }
    }
}

val FormInputStyle by ComponentStyle {
    focus {
        Modifier
            .border {
                width(2.px)
                color(primaryLight)
            }
            .boxShadow(0.px)
            .color(primaryLight)
    }
}

val FormLabelsStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .color(if(colorMode == ColorMode.LIGHT) Colors.Black else onPrimaryContainerDark)
            .padding(left = 5.px)
            .margin(top = 10.px)
            .textAlign(TextAlign.Start)
    }
}

val FormCheckLabelStyle by ComponentStyle.base() {
    Modifier
        .fillMaxWidth()
        .color(if(colorMode == ColorMode.LIGHT) Colors.Black else onPrimaryContainerDark)
        .padding(left = 5.px)
        .textAlign(TextAlign.Start)
}

val CheckBoxStyle by ComponentStyle {
    base {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = if(colorMode == ColorMode.LIGHT) onPrimaryContainerLight else onPrimaryContainerDark
            )
            .boxShadow(0.px)
    }
    checked {
        Modifier
            .border(width = 0.px)
            .boxShadow(0.px)
            .color(Colors.Black)
            .backgroundColor(onSecondaryContainerLight)
    }
}

val ContactFormStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth(90.percent)
            .borderRadius(r = 10.px)
            .backgroundColor(if (colorMode == ColorMode.LIGHT) primaryContainerLight else primaryContainerDark)
//            .margin(20.px)
            .padding(20.px)
    }
}

val PContactFormStyle by ComponentStyle {
    base {
        Modifier
            .padding(top = 10.px)
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .color(if(colorMode == ColorMode.LIGHT) Colors.Black else onPrimaryContainerDark)
    }
}