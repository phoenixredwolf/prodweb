package com.phoenixredwolf.prodweb.components.models

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.icons.fa.*
import org.jetbrains.compose.web.css.px

enum class Consulting: BaseService {
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
    INNOVATE{
        override val id: String
            get() = "innovate"
        override val path: String
            get() = "/innovate"
        override val title: String
            get() = "Business Innovations"
        override val desc: String
            get() = "Evolving your business to match changing consumer needs and market landscapes. Launching your business to the future."
        override val imgPath: String
            get() = Res.Image.transform
        override val imgDesc: String
            get() = "Business Innovations images"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/innovation-technology-be-creative-futuristic-concept_18125596.htm#query=Business%20Transformations&position=0&from_view=search&track=ais"
        override val imgCredit: String
            get() = "rawpixel.com"
        override val freepikImg: Boolean
            get() = false

        @Composable
        override fun icon() = FaRightLeft(
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

    },
    RECRUIT{
        override val id: String
            get() = "recruit"
        override val path: String
            get() = "/recruiting"
        override val title: String
            get() = "Technical Recruiting"
        override val desc: String
            get() = "Need help finding the right technical people to add to your team? Let our experts help you!"
        override val imgPath: String
            get() = Res.Image.recruit
        override val imgDesc: String
            get() = "Recruiting Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/human-resources-concept-with-hand_42089111.htm#query=technical%20recruiting&position=2&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepik"
        override val freepikImg: Boolean
            get() = true

        @Composable
        override fun icon() = FaUserGroup(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    BRAND{
        override val id: String
            get() = "brand"
        override val path: String
            get() = "/branding"
        override val title: String
            get() = "Brand Marketing Strategy"
        override val desc: String
            get() = "Helping you create a memorable brand! We can help with slogans, logos, and icons!"
        override val imgPath: String
            get() = Res.Image.brand
        override val imgDesc: String
            get() = "Branding Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/business-marketing-strategy_15438607.htm#query=Branding&position=14&from_view=search&track=sph"
        override val imgCredit: String
            get() = "rawpixel.com"
        override val freepikImg: Boolean
            get() = false

        @Composable
        override fun icon() = FaRankingStar(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    POS {
        override val id: String
            get() = "pos"
        override val path: String
            get() = "/possystems"
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
    }
}