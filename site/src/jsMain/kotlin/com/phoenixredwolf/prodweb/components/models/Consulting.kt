package com.phoenixredwolf.prodweb.components.models

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.icons.fa.*
import org.jetbrains.compose.web.css.px

enum class Consulting: BaseService {
    POS {
        override val id: String
            get() = "pos"
        override val path: String
            get() = "http://localpartners.toasttab.com/register-advocate/referred-by/BarretVogtman/"
        override val title: String
            get() = "Point of Sale Systems"
        override val desc: String
            get() = "Excellent and efficient Point of Sale Systems are available through our partner."
        override val imgPath: String
            get() = Res.Image.possystem
        override val imgDesc: String
            get() = "Point of Sale Systems Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/close-up-hand-paying-with-smartphone_21745149.htm#page=3&query=Point%20of%20Sale%20Systems&position=11&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepik"
        override val freepikImg: Boolean
            get() = true

        @Composable
        override fun icon() = FaCreditCard(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    ITC{
        override val id: String
            get() = "itcon"
        override val path: String
            get() = "/itconsult"
        override val title: String
            get() = "IT Consulting"
        override val desc: String
            get() = "Our consultants will guid you through the process of setting up or converting your it infrastructure."
        override val imgPath: String
            get() = Res.Image.itconsult
        override val imgDesc: String
            get() = "IT Consulting Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/standard-quality-control-collage-concept_30589262.htm#page=2&query=IT%20Consulting&position=3&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepik"
        override val freepikImg: Boolean
            get() = true

        @Composable
        override fun icon() = FaListCheck(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    Oper{
        override val id: String
            get() = "itoper"
        override val path: String
            get() = "/itoper"
        override val title: String
            get() = "IT Operations"
        override val desc: String
            get() = "Helping you discover the best technologies for your business."
        override val imgPath: String
            get() = Res.Image.itoper
        override val imgDesc: String
            get() = "IT Operations image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/standard-quality-control-concept-m_36027736.htm#query=IT%20Operations&position=1&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepik"
        override val freepikImg: Boolean
            get() = true

        @Composable
        override fun icon() = FaGears(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    CYBER{
        override val id: String
            get() = "cyber"
        override val path: String
            get() = "/cyber"
        override val title: String
            get() = "Cyber Security"
        override val desc: String
            get() = "We have the proactive and preventive security solutions for any size business. Let's talk about how we can protect your data."
        override val imgPath: String
            get() = Res.Image.cyber
        override val imgDesc: String
            get() = "CyberSecurity Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/medium-shot-man-typing-laptop_20824743.htm#page=4&query=Cybersecurity&position=32&from_view=search&track=sph"
        override val imgCredit: String
            get() = "Freepik"
        override val freepikImg: Boolean
            get() = true

        @Composable
        override fun icon() = FaShield(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    RISK {
        override val id: String
            get() = "risk"
        override val path: String
            get() = "/risk"
        override val title: String
            get() = "Risk Assessments"
        override val desc: String
            get() = "Understand the risks your business face everyday and take preventative action now."
        override val imgPath: String
            get() = Res.Image.risk
        override val imgDesc: String
            get() = "Risk Assessment Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/risk-protection-eliminating-risk-top-view_41128114.htm#page=2&query=Risk%20Assessments&position=19&from_view=search&track=ais"
        override val imgCredit: String
            get() = "atlascompany"
        override val freepikImg: Boolean
            get() = false

        @Composable
        override fun icon() = FaHurricane(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

    }

}