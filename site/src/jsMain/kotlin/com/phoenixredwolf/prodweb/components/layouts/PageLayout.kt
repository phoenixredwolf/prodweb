package com.phoenixredwolf.prodweb.components.layouts

import androidx.compose.runtime.*
import com.phoenixredwolf.prodweb.components.sections.Footer
import com.phoenixredwolf.prodweb.components.sections.NavHeader
import com.phoenixredwolf.prodweb.components.widgets.BackToTopButton
import com.phoenixredwolf.prodweb.components.widgets.OverflowMenu
import com.phoenixredwolf.prodweb.theme.onSurfaceDark
import com.phoenixredwolf.prodweb.theme.onSurfaceLight
import com.phoenixredwolf.prodweb.theme.surfaceDark
import com.phoenixredwolf.prodweb.theme.surfaceLight
import com.varabyte.kobweb.compose.css.AlignSelf
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*

@Composable
fun PageLayout(
    title: String,
    description: String,
    content: @Composable () -> Unit
) {
    LaunchedEffect(title, description) {
        document.title = title
        document.querySelector("""meta[name="description"]""")!!.setAttribute("content", description)
    }
    val breakpoint = rememberBreakpoint()
    var menuOpened by remember { mutableStateOf(false) }
    var colorMode by ColorMode.currentState

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .backgroundColor(if(colorMode == ColorMode.LIGHT) surfaceLight else surfaceDark)
            .color(if(colorMode == ColorMode.LIGHT) onSurfaceLight else onSurfaceDark)
            // Create a box with two rows: the main content (fills as much space as it can) and the footer (which reserves
            // space at the bottom). "min-content" means the use the height of the row, which we use for the footer.
            // Since this box is set to *at least* 100%, the footer will always appear at least on the bottom but can be
            // pushed further down if the first row grows beyond the page.
            .gridTemplateRows { size(1.fr); size(minContent) }
    ) {
        Column(
            modifier = Modifier.fillMaxSize().textAlign(TextAlign.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader(breakpoint = breakpoint, onMenuClicked = { menuOpened = true })
            content()
        }
        BackToTopButton()
        if (menuOpened) {
            OverflowMenu( onMenuClosed = { menuOpened = false} )
        }
        // Associate the footer with the row that will get pushed off the bottom of the page if it can't fit.
        Footer(
            FooterStyle.toModifier()
                .align(Alignment.Center)
                .fillMaxWidth()
                .padding(0.px)
                .gridRow(2, 5), breakpoint)
    }
}

val FooterStyle by ComponentStyle.base {
    Modifier
        .margin(top = 2.cssRem)
        .borderTop(1.px, LineStyle.Solid, SilkTheme.palettes[colorMode].border)
        .padding(topBottom = 1.cssRem, leftRight = 4.cssRem)
        .alignSelf(AlignSelf.Center)
}