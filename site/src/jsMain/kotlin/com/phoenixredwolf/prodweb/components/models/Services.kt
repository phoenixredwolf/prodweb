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
            get() = "https://sites.ziftsolutions.com/sandlerpartners.ziftsolutions.com/8a9983098ab12163018ab5e37b461309#z_section-contact"
        override val title: String
            get() = "Managed IT Services"
        override val desc: String
            get() = "Our MSP experts are ready to support your operations 24/7!"
        override val imgPath: String
            get() = Res.Image.managedservices
        override val imgDesc: String
            get() = "Managed IT Services Image"

        @Composable
        override fun menuIcon() = FaServer(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/standard-quality-control-collage-concept_30589253.htm#query=managed%20it%20services&position=38&from_view=keyword&track=ais"

        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true
        override val beneHeading: String
            get() = "Why choose Managed IT Services from PhoenixRedwolf? The benefits are clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Enhanced Security", "Protect your data and systems from cyber threats with our robust cybersecurity measures."),
                AddInfo("Reduced Downtime", "We keep your IT infrastructure running efficiently, minimizing downtime and maximizing productivity."),
                AddInfo("Cost Savings", "Our tailored solutions optimize your IT budget, reducing unexpected expenses."),
                AddInfo("Proactive Support", "Our team works tirelessly behind the scenes to prevent IT issues before they disrupt your operations.")
            )
        override val offeringsHead: String
            get() = "Our Managed IT Services encompass a comprehensive range of offerings, including:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Network Monitoring", "Continuous monitoring to identify and address issues before they impact your business."),
                AddInfo("Reduced Downtime", "Keeping your software up-to-date to enhance performance and security."),
                AddInfo("Cost Savings", "Protecting your data and systems with cutting-edge security measures."),
                AddInfo("Proactive Support", "Ensuring your critical data is securely backed up and recoverable."),
                AddInfo("IT Maintenance", "Proactive maintenance to keep your systems in peak condition."),
                AddInfo("24/7 Support", "Round-the-clock assistance for all your IT needs.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaServer(
                    size = IconSize.X8
                ) },"Customization", "We understand that every business is unique. Our Managed IT Services are tailored to match your specific needs. Whether you're a small startup or a large enterprise, we'll create a solution that fits you perfectly."),
                CardInfo({ FaLifeRing(
                    size = IconSize.X8
                ) }, "Proactive Support", "Our approach is all about staying ahead of the curve. We don't wait for issues to arise—we actively monitor, identify, and resolve potential problems before they disrupt your business operations."),
                CardInfo({ FaCloudscale(
                    size = IconSize.X8
                ) }, "Scalability", "Your business is dynamic, and your IT needs may change. Rest assured, our Managed IT Services are designed to scale with you. Whether you're expanding or streamlining, we'll adapt our solutions to match your evolving requirements."),
            )
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
        override fun menuIcon() = FaCircleQuestion(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-vector/flat-design-illustration-customer-support_12982910.htm#query=it%20support&position=6&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true
        override val beneHeading: String
            get() = "Why Choose Our IT Support Services? The Benefits Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Swift Issue Resolution", "Experience quick and effective issue resolution to minimize downtime."),
                AddInfo("Reduced Downtime", "Maximize productivity with minimal interruptions to your operations."),
                AddInfo("Cost-Effective", "Our solutions help you manage IT costs efficiently."),
                AddInfo("Enhanced Productivity", "A well-supported IT infrastructure leads to improved workflow and productivity gains.")
            )
        override val offeringsHead: String
            get() = "Our IT Support Services Include:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Helpdesk Support", "Prompt assistance from our knowledgeable helpdesk team."),
                AddInfo("Hardware & Software Troubleshooting", "Swift resolution of hardware and software-related issues."),
                AddInfo("Network Assistance", "Ensuring your network runs smoothly and securely."),
                AddInfo("Remote Support", "Quick solutions through remote assistance.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaClock(
                    size = IconSize.X8
                ) },"We're Here for You Around the Clock", "We understand that IT issues can occur at any time. That's why our IT support services are available 24/7, ensuring you have access to assistance whenever you need it."),
                CardInfo({ FaHouseLaptop(
                    size = IconSize.X8
                ) }, "Quick Solutions, No Matter Where You Are", "Our remote support capabilities allow us to diagnose and resolve issues efficiently, without the need for on-site visits. This means quicker solutions for you and less downtime for your business."),
                CardInfo({ FaBuilding(
                    size = IconSize.X8
                ) },"When In-Person Assistance is Needed", "For more complex issues that require on-site attention, our IT support team is ready to be at your location promptly to address any challenges your business faces."),
                CardInfo({ FaFingerprint(
                    size = IconSize.X8
                ) },"Tailored to Your Unique Needs", "We understand that every business is different. Our IT support solutions are customized to match your specific needs, ensuring a personalized experience and optimal IT performance."),
                CardInfo({ FaKeycdn(
                    size = IconSize.X8
                ) }, "Your Data, Our Priority", "We take the security and privacy of your data seriously. Our IT support interactions are conducted with the utmost care to protect your sensitive information."),
            )
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
        override fun menuIcon() = FaCloud(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-vector/two-developers-looking-gears-cloud-digital-data-storage-database-securiry-data-protection-cloud-technology-concept-vector-illustration-isolated_11668698.htm#query=Cloud%20Services&position=11&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true
        override val beneHeading: String
            get() = "Why Choose Our Cloud Services? The Benefits Are Enormous:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Scalability", "Seamlessly scale your resources up or down based on your needs."),
                AddInfo("Data Security", "Your data is protected with advanced encryption and robust firewall measures."),
                AddInfo("Anywhere Access", "Access your data and applications from anywhere, at any time.")
            )
        override val offeringsHead: String
            get() = "Our Cloud Services Portfolio:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Public Cloud", "Leverage the power of public cloud platforms for flexibility and accessibility."),
                AddInfo("Private Cloud", "Enjoy the security and control of a private cloud environment."),
                AddInfo("Hybrid Cloud", "Combine the benefits of public and private clouds for a tailored solution."),
                AddInfo("Cloud Migration", "Seamlessly transition your data and applications to the cloud."),
                AddInfo("Cloud Management", "Our experts ensure your cloud environment runs optimally.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaCloudscale(
                    size = IconSize.X8
                ) },"Grow with Confidence", "PhoenixRedwolf's cloud solutions are designed to scale alongside your business. Whether you're expanding rapidly or need to adjust resources, our cloud services provide the flexibility to accommodate your growth."),
                CardInfo({ FaShieldHalved(
                    size = IconSize.X8
                ) },"Protecting Your Digital Assets", "Data security is paramount. Our cloud services include robust security measures like data encryption and firewalls, ensuring your critical information remains safe and compliant with industry standards."),
                CardInfo({ FaCloudArrowUp(
                    size = IconSize.X8
                ) },"Cost-Effective IT Solutions", "Say goodbye to costly on-premises infrastructure. Our cloud services are a cost-efficient alternative, allowing you to pay only for the resources you use."),
                CardInfo({ FaDownload(
                    size = IconSize.X8
                ) },"Peace of Mind for Your Data", "We provide automated data backup and disaster recovery solutions to guarantee that your data is always protected and recoverable in case of unexpected events."),
                CardInfo({ FaCloudflare(
                    size = IconSize.X8
                ) },"Seamless Transition to the Cloud", "Trust our experienced team to handle the migration of your data and applications to the cloud with minimal disruption to your operations."),
                CardInfo({ FaFingerprint(
                    size = IconSize.X8
                ) },"Tailored to Your Needs", "Every business is unique. Our cloud solutions are fully customizable to match your specific requirements, ensuring you get the most out of the cloud."),
                CardInfo({ FaScaleBalanced(
                    size = IconSize.X8
                ) },"Meeting Regulatory Standards", "Our cloud services comply with industry regulations and data privacy standards, providing assurance that your data is handled securely."),
                CardInfo({ FaLightbulb(
                    size = IconSize.X8
                ) },"The Experts Behind the Cloud", "Our team boasts a wealth of technical expertise and certifications in cloud technologies, ensuring you receive top-tier service."),
                CardInfo({ FaHandshakeAngle(
                    size = IconSize.X8
                ) },"Support You Can Rely On", "We're not just a cloud provider; we're your partner. Our dedicated customer support is available to assist you whenever you need it, ensuring your cloud experience is seamless."),
            )
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
        override fun menuIcon() = FaNetworkWired(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/top-view-wi-fi-router-with-wireless-controlled-devices_11382734.htm#query=Wired%20and%20Wireless%20Network%20support&position=49&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true
        override val beneHeading: String
            get() = "Why Choose Our Network Services? The Benefits Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Improved Reliability", "Say goodbye to network downtime and interruptions."),
                AddInfo("Scalability", "Grow your network resources as your business expands."),
                AddInfo("Enhanced Security", "Protect your data with advanced firewall and encryption measures."),
                AddInfo("Productivity Boost", "Enjoy efficient operations with a reliable network infrastructure.")
            )
        override val offeringsHead: String
            get() = "Our Network Services Portfolio:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Wired Network Design", "Expert design and implementation of stable wired networks."),
                AddInfo("Wireless Network Setup", "Seamless Wi-Fi solutions and access point installations."),
                AddInfo("Network Security", "Robust security measures, including firewall and intrusion detection."),
                AddInfo("Network Monitoring", "Real-time insights and proactive issue resolution.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaNetworkWired(
                    size = IconSize.X8
                ) },"The Backbone of Reliable Connectivity", "We specialize in designing and implementing wired network solutions that provide unparalleled reliability and stability. Whether you're in the office or at a remote location, count on our wired networks to keep you connected."),
                CardInfo({ FaWifi(
                    size = IconSize.X8
                ) },"Seamless Wi-Fi Solutions", "Experience efficient wireless connectivity with our Wi-Fi solutions. From access point installation to network optimization, we ensure your wireless network performs flawlessly."),
                CardInfo({ FaCloudscale(
                    size = IconSize.X8
                ) },"Grow Your Connectivity with Confidence", "Our network solutions are designed to scale with your business. As you expand, we'll adjust your network infrastructure to meet your evolving connectivity needs."),
                CardInfo({ FaShieldHalved(
                    size = IconSize.X8
                ) },"Protecting Your Network and Data", "We take network security seriously. Our comprehensive measures, including firewall protection, intrusion detection, and encryption, ensure your data remains secure."),
                CardInfo({ FaStopwatch(
                    size = IconSize.X8
                ) },"Real-Time Oversight", "Our network monitoring services provide real-time insights into your network's performance. We proactively identify and resolve issues, minimizing downtime."),
                CardInfo({ FaFingerprint(
                    size = IconSize.X8
                ) },"Tailored Network Solutions", "Every business is unique. Our network solutions are customized to match your specific requirements, providing a personalized network infrastructure that suits your needs."),
                CardInfo({ FaClock(
                    size = IconSize.X8
                ) },"Reliable Assistance Anytime, Anywhere", "We're here to support you around the clock. Whether you have questions, need assistance, or face network issues, our 24/7 support team is just a call away."),
                CardInfo({ FaHandshakeAngle(
                    size = IconSize.X8
                ) },"Your Connectivity Partner", "Our customer support team is dedicated to ensuring your network experience is seamless. We're not just a service provider; we're your trusted partner in connectivity."),
            )
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
        override fun menuIcon() = FaCode(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val imgCreditPath: String
            get() = "https://www.freepik.com/free-photo/html-css-collage-concept_36295536.htm#query=Web%20Development&position=39&from_view=search&track=ais"
        override val imgCredit: String
            get() = "Freepic"

        override val freepikImg: Boolean
            get() = true
        override val beneHeading: String
            get() = "Why Choose Our Web Development Services? The Benefits Are Remarkable:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Enhanced User Experience", "Our designs prioritize user-friendly interfaces for increased engagement."),
                AddInfo("Improved Brand Visibility", "Stand out in the digital landscape and attract a wider audience."),
                AddInfo("Increased Engagement", "Engage your visitors with compelling website features and content."),
                AddInfo("Higher Conversion Rates", "Optimize your site for conversions with our data-driven approach.")
            )
        override val offeringsHead: String
            get() = "Our Web Development Services Include:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Custom Website Design", "Unique, tailor-made designs to reflect your brand identity."),
                AddInfo("E-commerce Development", "Powerful online stores with seamless payment solutions."),
                AddInfo("Content Management Systems (CMS)", "User-friendly platforms for easy content updates."),
                AddInfo("Web Application Development", "Innovative web apps to streamline business processes.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaFigma(
                    size = IconSize.X8
                ) },"Designs as Unique as Your Brand", "We specialize in creating custom website designs that capture the essence of your brand. Our designs are tailored to your unique needs and goals."),
                CardInfo({ FaStore(
                    size = IconSize.X8
                ) },"Unlock the Power of Online Sales", "Experience e-commerce solutions that drive sales and conversions. We'll help you set up online stores, integrate payment gateways, and manage product catalogs."),
                CardInfo({ FaFileArrowDown(
                    size = IconSize.X8
                ) },"Effortless Content Updates", "Keep your website content fresh and up-to-date with user-friendly CMS platforms like WordPress, Drupal, or Joomla."),
                CardInfo({ FaLaptopCode(
                    size = IconSize.X8
                ) },"Seamless Across All Devices", "We prioritize responsive web design, ensuring that your website functions flawlessly on all devices, from smartphones to desktops."),
                CardInfo({ FaMagnifyingGlassPlus(
                    size = IconSize.X8
                ) },"Boost Your Online Visibility", "Our web development incorporates SEO best practices to improve search engine rankings and drive organic traffic to your site."),
                CardInfo({ FaPeopleGroup(
                    size = IconSize.X8
                ) },"Putting Users First", "We focus on creating intuitive interfaces and seamless navigation to enhance the overall user experience and keep visitors engaged."),
                CardInfo({ FaTruckFast(
                    size = IconSize.X8
                ) },"Lightning-Fast Loading", "Our performance optimization strategies ensure that your website loads quickly, providing a smooth user experience."),
                CardInfo({ FaFileShield(
                    size = IconSize.X8
                ) },"Protecting Your Digital Assets", "We prioritize security, implementing measures such as SSL certificates and data encryption to safeguard your website and user data."),
                CardInfo({ FaBugSlash(
                    size = IconSize.X8
                ) },"Flawless Functionality", "Our rigorous testing processes ensure that your website functions flawlessly and is free of bugs before launch."),
                CardInfo({ FaPersonChalkboard(
                    size = IconSize.X8
                ) },"Your Vision, Our Expertise", "We collaborate closely with our clients, understanding their goals, preferences, and feedback throughout the development process to create a website that aligns with their vision."),
            )
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
        override fun menuIcon() = FaComputer(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val beneHeading: String
            get() = "Why Choose Our Software Development Services? The Benefits Are Numerous:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Increased Efficiency", "Streamline your processes with software solutions designed for your specific needs."),
                AddInfo("Automation", "Reduce manual tasks and optimize workflows, saving time and resources."),
                AddInfo("Cost Savings", "Invest in software that saves you time, resources, and money."),
                AddInfo("Enhanced Competitiveness", "Gain a competitive edge with cutting-edge software solutions.")
            )
        override val offeringsHead: String
            get() = "Our Software Development Portfolio Includes:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Custom Software Development", "Tailor-made solutions designed to address your unique challenges."),
                AddInfo("Web Application Development", "Robust web-based applications to enhance user experiences."),
                AddInfo("Mobile App Development", "Engaging mobile apps for iOS and Android platforms."),
                AddInfo("Software Integration", "Seamlessly connect and optimize your software ecosystem.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaFingerprint(
                    size = IconSize.X8
                ) },"Solutions as Unique as Your Business", "We specialize in creating custom software solutions that address your specific challenges and objectives. Your software will be designed from the ground up to meet your needs."),
                CardInfo({ FaHtml5(
                    size = IconSize.X8
                ) },"Empower Your Online Presence", "Our web application development expertise empowers your business to operate efficiently and serve users with dynamic, web-based applications."),
                CardInfo({ FaAndroid(
                    size = IconSize.X8
                ) },"Reach Users Anywhere, Anytime", "We design and develop mobile apps that connect with your audience on iOS and Android devices, ensuring a seamless user experience."),
                CardInfo({ FaCode(
                    size = IconSize.X8
                ) },"Masters of Modern Technology", "Our team boasts proficiency in the latest programming languages, frameworks, and technologies, ensuring your software is cutting-edge."),
                CardInfo({ FaArrowsRotate(
                    size = IconSize.X8
                ) },"Flexible, Collaborative, and Timely", "We follow Agile development methodologies, promoting flexibility, collaboration, and on-time project delivery."),
                CardInfo({ FaCloudscale(
                    size = IconSize.X8
                ) },"Grow with Confidence", "Our software solutions are built to scale alongside your business, accommodating future growth and expansion."),
                CardInfo({ FaArrowsToCircle(
                    size = IconSize.X8
                ) },"Seamless Data Flow", "We specialize in integrating new software with existing systems to optimize data flow and business processes."),
                CardInfo({ FaShieldHalved(
                    size = IconSize.X8
                ) },"Guardians of Your Data", "Security is paramount. Our software solutions feature robust measures, including data encryption and access controls, to protect your sensitive information."),
                CardInfo({ FaChalkboardUser(
                    size = IconSize.X8
                ) },"Maximizing the Benefits", "We offer user training services to ensure your team can effectively use and maximize the benefits of our software."),
                CardInfo({ FaGears(
                    size = IconSize.X8
                ) },"Ensuring Ongoing Software Excellence", "We provide comprehensive post-development maintenance and support services to ensure that your software remains up-to-date, secure, and fully functional."),
                CardInfo({ FaDownload(
                    size = IconSize.X8
                ) },"Continuous Improvements", "We stay on top of software updates and improvements to keep your solutions current and efficient."),
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
        override val beneHeading: String
            get() = "Why Choose Our Social Media Services? The Benefits Are Tremendous:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Increased Brand Visibility", "Enhance your brand's online visibility and reach a broader audience."),
                AddInfo("Engagement", "Foster meaningful connections with your audience through compelling content."),
                AddInfo("Lead Generation", "Leverage social media as a powerful lead generation tool."),
                AddInfo("Customer Loyalty", "Build and nurture customer relationships that lead to long-term loyalty.")
            )
        override val offeringsHead: String
            get() = "Our Social Media Portfolio Includes:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Social Media Strategy", "Customized strategies tailored to your goals and target audience."),
                AddInfo("Content Creation", "Engaging and relevant content across text, images, videos, and infographics."),
                AddInfo("Platform Management", "Expert management of various social media platforms"),
                AddInfo("Paid Advertising", "Effective paid advertising campaigns to expand your reach.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaFingerprint(
                    size = IconSize.X8
                ) },"Your Blueprint to Success", "We understand that every business is unique. Our social media strategies are customized to align with your specific goals, whether it's brand awareness, lead generation, or community building."),
                CardInfo({ FaWandMagicSparkles(
                    size = IconSize.X8
                ) },"Captivating Your Audience", "We create compelling content that resonates with your target audience, encouraging engagement and sparking conversations."),
                CardInfo({ FaHashtag(
                    size = IconSize.X8
                ) },"Mastering the Social Landscape", "Our expertise spans various social media platforms, from Facebook and Twitter to Instagram and LinkedIn. We know where your audience is and how to reach them effectively."),
                CardInfo({ FaPhotoFilm(
                    size = IconSize.X8
                ) },"Expand Your Reach", "Unlock the potential of paid social media advertising. We design and execute campaigns that maximize your ROI and broaden your brand's reach."),
                CardInfo({ FaChartLine(
                    size = IconSize.X8
                ) },"Data-Driven Success", "We continuously monitor and analyze social media performance metrics to fine-tune strategies and ensure you achieve the best possible results."),
                CardInfo({ FaPeopleArrows(
                    size = IconSize.X8
                ) },"Fostering Connections", "We actively engage with your online community, responding to comments, addressing concerns, and creating a positive online environment around your brand."),
                CardInfo({ FaBullhorn(
                    size = IconSize.X8
                ) },"Amplifying Your Voice", "If relevant, we identify and collaborate with social media influencers who align with your brand values, amplifying your message and expanding your reach."),
                CardInfo({ FaUsers(
                    size = IconSize.X8
                ) },"Turning Followers into Customers", "Our strategies are designed to convert social media followers into leads and, ultimately, loyal customers."),
                CardInfo({ FaUserShield(
                    size = IconSize.X8
                ) },"Protecting Your Brand Image", "We ensure your brand maintains a positive image by managing online reviews, addressing negative feedback, and promoting positive interactions."),
                CardInfo({ FaRectangleAd(
                    size = IconSize.X8
                ) },"Targeted Advertising Campaigns", "We have expertise in managing paid social media advertising campaigns on various platforms, ensuring precise targeting and maximum impact for your budget."),
            )
        @Composable
        override fun menuIcon() = FaHashtag(
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
        override fun menuIcon() = FaPhoneVolume(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

        override val beneHeading: String
            get() = "Why Choose Our VoIP Services? The Advantages Are Unmistakable:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Superior Call Quality", "Experience crystal-clear voice calls with exceptional audio quality."),
                AddInfo("Cost Savings", "Reduce your phone bills significantly compared to traditional landlines."),
                AddInfo("Scalability", "Grow your communication system seamlessly as your business expands."),
                AddInfo("Remote Work", "Enable your team to stay connected from anywhere, supporting modern work arrangements.")
            )
        override val offeringsHead: String
            get() = "Our VoIP Services Encompass:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Hosted VoIP", "Harness the power of cloud-based phone systems with our hosted VoIP solutions."),
                AddInfo("VoIP Phones", "Choose from our range of VoIP phones, including desk phones and software-based softphones."),
                AddInfo("Call Management", "Take control of your communication with features like call routing, auto-attendants, and call recording.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaPodcast(
                    size = IconSize.X8
                ) },"Enhancing Communication", "Elevate your communication with advanced features such as call forwarding, voicemail-to-email, call conferencing, and interactive voice response (IVR) systems."),
                CardInfo({ FaListCheck(
                    size = IconSize.X8
                ) },"Seamless Business Integration", "VoIP isn't just about calls; it's about enhancing your entire workflow. Our VoIP systems seamlessly integrate with your other business applications, including Customer Relationship Management (CRM) tools, email platforms, and more."),
                CardInfo({ FaMobileScreenButton(
                    size = IconSize.X8
                ) },"Stay Connected on the Go", "Embrace the freedom of mobility. Our VoIP solutions allow your team to stay connected and productive, whether they're in the office or on the move."),
                CardInfo({ FaShieldHalved(
                    size = IconSize.X8
                ) },"Protecting Your Communication", "Security is paramount. Rest assured, our VoIP services employ robust encryption and authentication measures to safeguard your sensitive conversations."),
                CardInfo({ FaPersonChalkboard(
                    size = IconSize.X8
                ) },"Your Success Is Our Priority", "We're not just here to provide VoIP services; we're here to ensure you get the most out of them. Our dedicated support team is ready to assist you, and we offer comprehensive training to help your team effectively utilize your VoIP systems."),
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
        override val beneHeading: String
            get() = "Why Choose Our UCaaS Solutions? The Benefits Are Exceptional:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Improved Collaboration", "Enhance teamwork and project management with integrated communication tools."),
                AddInfo("Increased Efficiency", "Streamline communication processes for faster decision-making."),
                AddInfo("Cost Savings", "Reduce expenses associated with traditional communication methods."),
                AddInfo("Scalability", "Our UCaaS solutions grow with your business, adapting to your changing needs."),
                AddInfo("Enhanced Customer Service", "Deliver exceptional customer experiences with efficient communication channels.")
            )
        override val offeringsHead: String
            get() = "Our UCaaS Services Include:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Voice and Video Conferencing", "Connect face-to-face or through voice calls, fostering meaningful interactions."),
                AddInfo("Messaging", "Enable instant messaging for quick communication within your team."),
                AddInfo("Presence Management", "Know the availability of team members in real-time, facilitating efficient communication."),
                AddInfo("Integration", "Seamlessly integrate UCaaS with other business applications to streamline workflows.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaIcons(
                    size = IconSize.X8
                ) },"Empowering Your Communication", "Our UCaaS solutions offer a range of communication features, including voice calls, high-definition video conferencing, instant messaging, and file sharing. Stay connected with your team, clients, and partners effortlessly."),
                CardInfo({ FaPersonChalkboard(
                    size = IconSize.X8
                ) },"Unlocking Team Productivity", "Collaborate effectively with tools like document sharing, screen sharing, virtual whiteboards, and project management capabilities. Transform ideas into action."),
                CardInfo({ FaHouseLaptop(
                    size = IconSize.X8
                ) },"Work Anywhere, Anytime", "Our UCaaS solutions support remote work, mobile devices, and BYOD policies, allowing your team to work from anywhere while staying connected and productive."),
                CardInfo({ FaArrowsToCircle(
                    size = IconSize.X8
                ) },"Seamless Workflow Integration", "Our UCaaS systems seamlessly integrate with your existing business applications, such as CRM systems and email platforms, to optimize processes and boost productivity."),
                CardInfo({ FaShieldHalved(
                    size = IconSize.X8
                ) },"Protecting Your Communications", "We prioritize security, implementing robust measures to safeguard your sensitive communications and ensure compliance with industry regulations."),
                CardInfo({ FaCloudscale(
                    size = IconSize.X8
                ) },"Adapt and Thrive", "Our UCaaS solutions are designed to scale with your business. Whether you're expanding or downsizing, we adapt to your communication needs."),
                CardInfo({ FaChalkboardUser(
                    size = IconSize.X8
                ) },"Your Success, Our Priority", "We provide comprehensive customer support and training to ensure you maximize the benefits of our UCaaS services. Our team is here to assist you at every step of the way."),
            )
        @Composable
        override fun menuIcon() = FaUsersRays(
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
        override val beneHeading: String
            get() = TODO("Not yet implemented")
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("", ""),
            )
        override val offeringsHead: String
            get() = TODO("Not yet implemented")
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("", ""),
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ Unit },"", ""),
            )
        @Composable
        override fun menuIcon() = FaSchool(
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
        override val beneHeading: String
            get() = TODO("Not yet implemented")
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("", ""),
            )
        override val offeringsHead: String
            get() = TODO("Not yet implemented")
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("", ""),
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ Unit },"", ""),
            )
        @Composable
        override fun menuIcon() = FaUserGroup(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )

    }
}
