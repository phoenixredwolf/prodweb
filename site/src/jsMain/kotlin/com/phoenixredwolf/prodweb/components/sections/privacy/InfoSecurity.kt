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
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun InfoSecurity() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        H2(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.Center)
                .toAttrs(),
            content = { Text("Protecting Your Data") }
        )
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.Center)
                .fontSize(FontSize.Large)
                .toAttrs(),
            content = { Text("How do we protect your data?") }
        )
        P(
            attrs = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "PhoenixRedwolf Digital Services, L.L.C. takes precautions to protect your information. When " +
                        "you submit sensitive information via the website, your information is protected both online " +
                        "and offline. Wherever we collect sensitive information (e.g. credit card information), that " +
                        "information is encrypted and transmitted to us in a secure way. You can verify this by " +
                        "looking for a lock icon in the address bar and looking for \"https\" at the beginning of the " +
                        "address of the webpage."
            )
        }
        P(
            attrs = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "While we use encryption to protect sensitive information transmitted online, we also protect " +
                        "your information offline. Only employees who need the information to perform a specific job " +
                        "(for example, billing or customer service) are granted access to personally identifiable " +
                        "information. The computers and servers in which we store personally identifiable information " +
                        "are kept in a secure environment. This is all done to prevent any loss, misuse, unauthorized " +
                        "access, disclosure or modification of the user's personal information under our control."
            )
        }
        P(
            attrs = Modifier
                .fontSize(FontSize.Large)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "The company also uses Secure Socket Layer (SSL) for authentication and private communications " +
                        "to build users' trust and confidence in the internet and website use by providing simple and " +
                        "secure access and communication of credit card and personal information"
            )
        }

    }
}