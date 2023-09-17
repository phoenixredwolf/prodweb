package com.phoenixredwolf.prodweb.components.models

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.icons.fa.*
import org.jetbrains.compose.web.css.px

enum class Services: BaseService {
    MIS {
        override val id: String
            get() = "mis"
        override val path: String
            get() = "/managed"
        override val title: String
            get() = "Managed IT Services"
        override val desc: String
            get() = "Our MSP experts are ready to support your operations 24/7!"
        override val imgPath: String
            get() = Res.Image.managedservices
        override val imgDesc: String
            get() = "Managed IT Services Image"

        @Composable
        override fun icon() = FaServer(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/standard-quality-control-collage-concept_30589253.htm#query=managed%20it%20services&position=38&from_view=keyword&track=ais"

        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true

    },
    ITSUP {
        override val id: String
            get() = "itsup"
        override val path: String
            get() = "/itsupport"
        override val title: String
            get() = "IT Support"
        override val desc: String
            get() = "Immediate IT support 24/7. We are committed to providing your company with stress-free IT support services."
        override val imgPath: String
            get() = Res.Image.itsupport
        override val imgDesc: String
            get() = "IT Support Image"

        @Composable
        override fun icon() = FaCircleQuestion(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-vector/flat-design-illustration-customer-support_12982910.htm#query=it%20support&position=6&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true

    },
    CLOUD {
        override val id: String
            get() = "cloud"
        override val path: String
            get() = "/cloud"
        override val title: String
            get() = "Cloud Services"
        override val desc: String
            get() = "We'll help you move existing systems and implement new solutions leveraging cloud technologies for greater productivity."
        override val imgPath: String
            get() = Res.Image.cloudserv
        override val imgDesc: String
            get() = "Cloud Services Image"

        @Composable
        override fun icon() = FaCloud(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-vector/two-developers-looking-gears-cloud-digital-data-storage-database-securiry-data-protection-cloud-technology-concept-vector-illustration-isolated_11668698.htm#query=Cloud%20Services&position=11&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true

    },
    NETWORK {
        override val id: String
            get() = "network"
        override val path: String
            get() = "/network"
        override val title: String
            get() = "Wired & Wireless Networks"
        override val desc: String
            get() = "Whether installing and configuring a wired network or setting up your wifi, we'll ensure your network is stable and secure."
        override val imgPath: String
            get() = Res.Image.network
        override val imgDesc: String
            get() = "Wired & Wireless Network Services Image"

        @Composable
        override fun icon() = FaNetworkWired(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/top-view-wi-fi-router-with-wireless-controlled-devices_11382734.htm#query=Wired%20and%20Wireless%20Network%20support&position=49&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true

    },
    WEB {
        override val id: String
            get() = "webdev"
        override val path: String
            get() = "/webdev"
        override val title: String
            get() = "Web Development"
        override val desc: String
            get() = "From updating your site to a complete build from the ground up, we have the expertise to get the job done."
        override val imgPath: String
            get() = Res.Image.webdevcard
        override val imgDesc: String
            get() = "Web Development Image"

        @Composable
        override fun icon() = FaCode(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/html-css-collage-concept_36295536.htm#query=Web%20Development&position=39&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true

    },
    SOFTWARE {
        override val id: String
            get() = "software"
        override val path: String
            get() = "/software"
        override val title: String
            get() = "Software Development"
        override val desc: String
            get() = "Whether you need an Android app or new legacy software, we have the experts to create what you need."
        override val imgPath: String
            get() = Res.Image.softwaredev
        override val imgDesc: String
            get() = "Software Development Image"

        @Composable
        override fun icon() = FaComputer(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

       override val imgCreditPath: String
           get() = "https://www.freepik.com/free-vector/software-development-isometric-landing-page-website-program-coding-cross-platform-algorithm-programming-languages-interface-computer-screen-technology-process-app-creation-3d-banner_11582461.htm#query=Web%20Development&position=23&from_view=search&track=ais"
       override val imgCredit: String
           get() = "upklyak"
       override val freepikImg: Boolean
           get() = false
    },
    SOCMED{
        override val id: String
            get() = "socmed"
        override val path: String
            get() = "/social"
        override val title: String
            get() = "Social Media"
        override val desc: String
            get() = "We'll help you setup and maintain a social media presence."
        override val imgPath: String
            get() = Res.Image.socmed
        override val imgDesc: String
            get() = "Social Media Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/social-media-influencer-receiving-likes-positive-reactions_12195249.htm#query=Social%20media&position=40&from_view=search&track=ais"
        override val imgCredit: String
            get() = "rawpixel.com"
        override val freepikImg: Boolean
            get() = false

        @Composable
        override fun icon() = FaHashtag(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    VOIP{
        override val id: String
            get() = "voip"
        override val path: String
            get() = "/voip"
        override val title: String
            get() = "Voice over IP"
        override val desc: String
            get() = "We can assist you in acquiring business phone systems that match your needs."
        override val imgPath: String
            get() = Res.Image.voip
        override val imgDesc: String
            get() = "Phone Systems Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/businessman-presenting-project-office_10887850.htm#query=VoIP&position=1&from_view=search&track=sph"
        override val imgCredit: String
            get() = "Freepik"
        override val freepikImg: Boolean
            get() = true
        @Composable
        override fun icon() = FaPhoneVolume(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    UCAAS{
        override val id: String
            get() = "ucaas"
        override val path: String
            get() = "/ucaas"
        override val title: String
            get() = "Unified Communications"
        override val desc: String
            get() = "Need to up your Video Meeting game? We have the hardware and software solutions to fit your situation."
        override val imgPath: String
            get() = Res.Image.ucaas
        override val imgDesc: String
            get() = "UCaaS image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/successful-business-people-with-speech-bubbles_2978556.htm#query=communication&from_query=UCaaS&position=3&from_view=search&track=sph"
        override val imgCredit: String
            get() = "rawpixel.com"
        override val freepikImg: Boolean
            get() = false

        @Composable
        override fun icon() = FaUsersRays(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    TRAIN{
        override val id: String
            get() = "train"
        override val path: String
            get() = "/contact"
        override val title: String
            get() = "Training"
        override val desc: String
            get() = "Let us create customized training for your staff. From MS Office to cyber security, we have what you need!"
        override val imgPath: String
            get() = Res.Image.train
        override val imgDesc: String
            get() = "Training Image"
        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/beginner-average-skilled-expert-productivity_16459783.htm#query=technology%20training&position=19&from_view=search&track=ais"
        override val imgCredit: String
            get() = "rawpixel.com"
        override val freepikImg: Boolean
            get() = false

        @Composable
        override fun icon() = FaSchool(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    STAFF{
        override val id: String
            get() = "staff"
        override val path: String
            get() = "/contact"
        override val title: String
            get() = "Technical Staffing"
        override val desc: String
            get() = "We can fulfill your short or long term technical staffing needs. Let's talk about the skills your looking for."
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

    }
}