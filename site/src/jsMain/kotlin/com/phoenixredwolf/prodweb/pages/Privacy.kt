package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.sections.privacy.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun Privacy() {
    val title = "Privacy Policy - Your Privacy Matters to Us | PhoenixRedwolf DS"
    val description = "Learn how PhoenixRedwolf Digital Services values your privacy and safeguards your personal information. Explore our privacy policy to understand how we collect, use, and protect your data in compliance with regulations."

    PageLayout(title = title, description = description) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .margin(top = 150.px)
                .padding(top = 20.px)
                .fillMaxWidth(90.percent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PrivacyContenct()
        }
    }
}

@Composable
private fun PrivacyContenct() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        PrivacyIntro()
        InfoCollection()
        InfoUse()
        InfoDisclose()
        InfoSecurity()
        Acceptance()
    }
}
