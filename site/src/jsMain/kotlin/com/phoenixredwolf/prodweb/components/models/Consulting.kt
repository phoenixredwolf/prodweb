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
        override val beneHeading: String
            get() = "Why Choose Our IT Consulting Services? The Advantages Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Strategic Technology Planning", "Our IT consultants work closely with your team to create "),
                AddInfo("Cost Optimization", "We analyze your current IT setup and identify areas where cost savings can be realized without compromising quality."),
                AddInfo("Efficiency Enhancement", "Our solutions are geared toward streamlining processes, reducing downtime, and boosting overall productivity."),
                AddInfo("Risk Mitigation", "We conduct thorough security audits and develop strategies to safeguard your data and systems."),
                AddInfo("Scalability", "Our recommendations and solutions are scalable, ensuring they grow with your business.")
            )
        override val offeringsHead: String
            get() = "Our IT Consulting Services Cover:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Strategic Planning", "We help you create a roadmap that aligns IT initiatives with your business goals."),
                AddInfo("Infrastructure Assessment:", "Our experts evaluate your existing IT infrastructure, identifying areas for improvement."),
                AddInfo("Security Audits", "We assess your cybersecurity measures, recommending enhancements to protect your digital assets."),
                AddInfo("Cloud Strategy", "We guide you in adopting cloud technologies to enhance agility and reduce costs.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaMicrochip(
                    size = IconSize.X8
                ) } , "Customized Technology Solutions", "Our consultants offer tailored technology solutions, including software recommendations, hardware upgrades, and network improvements. We ensure that every solution we propose aligns with your unique business requirements."),
                CardInfo({ FaHandshakeAngle(
                    size = IconSize.X8
                ) } , "Choosing the Right Partners", "We assist you in selecting the best IT vendors and solutions, ensuring they fit seamlessly into your ecosystem. We have established partnerships with trusted providers to simplify the selection process."),
                CardInfo({ FaClipboardCheck(
                    size = IconSize.X8
                ) }, "Staying Compliant", "We ensure that your IT environment adheres to industry regulations and compliance standards, reducing risks and potential legal issues."),
                CardInfo({ FaListCheck(
                    size = IconSize.X8
                ) }, "Efficient Implementation", "Our project management expertise guarantees efficient implementation of IT initiatives. We handle all aspects, from planning to execution, so you can focus on your core business."),
                CardInfo({ FaLightbulb(
                    size = IconSize.X8
                ) }, "Knowledge Transfer", "Our commitment doesn't end with recommendations. We provide training and ongoing support to empower your team with the skills and knowledge needed to maximize the benefits of your technology investments.")
            )
        @Composable
        override fun menuIcon() = FaListCheck(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    },
    OPER{
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
        override val beneHeading: String
            get() = "Why Choose Our IT Operations Services? The Advantages Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Infrastructure Management", "Our experts excel in the management and maintenance of IT infrastructure, guaranteeing it functions at its peak."),
                AddInfo("Cost Efficiency", "We help you reduce operational costs without compromising on performance."),
                AddInfo("Reliability and Availability", "Count on us to maintain high system reliability and availability to minimize disruptions."),
                AddInfo("Scalability", "Our solutions are scalable, allowing your technology to grow with your business.")
            )
        override val offeringsHead: String
            get() = "Our IT Operations Services Cover:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Infrastructure Monitoring", "With 24/7 monitoring, we proactively identify and resolve issues before they affect your operations."),
                AddInfo("System Maintenance", "We conduct regular maintenance to prevent downtime and ensure your systems operate flawlessly."),
                AddInfo("Backup and Disaster Recovery", "Our robust backup and disaster recovery plans protect your data and ensure business continuity."),
                AddInfo("Performance Optimization", "Count on us to fine-tune your systems for optimal performance.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaBuildingLock(
                    size = IconSize.X8
                ) }, "Securing Your Operations", "Our IT Operations services include robust security measures such as vulnerability assessments, patch management, and advanced threat detection to safeguard your systems and data."),
                CardInfo({ FaClipboardCheck(
                    size = IconSize.X8
                ) }, "Staying Compliant", "We ensure that your IT operations align with industry regulations and compliance standards, mitigating risks and ensuring legal compliance."),
                CardInfo({ FaArrowUpRightDots(
                    size = IconSize.X8
                ) }, "Adapt and Grow", "Our solutions are designed to adapt and grow alongside your business, ensuring technology keeps pace with your evolving needs."),
                CardInfo({ FaHandshakeAngle(
                    size = IconSize.X8
                ) }, "Effective Vendor Partnerships", "We manage vendor relationships on your behalf, optimizing services and negotiating costs to benefit your business."),
                CardInfo({ FaHouseChimneyCrack(
                    size = IconSize.X8
                ) }, "Prepare for the Unexpected", "Our disaster recovery planning ensures that your business remains operational even in the face of unexpected disruptions, protecting your continuity."),
                CardInfo({ FaListCheck(
                    size = IconSize.X8
                ) }, "Efficient Implementation", "We excel at project management, overseeing IT infrastructure upgrades and implementations to ensure efficient and effective execution."),
                CardInfo({ FaPeopleGroup(
                    size = IconSize.X8
                ) }, "Empowering Your Team", "To empower your team, we offer training and knowledge transfer services, equipping them with the skills and knowledge needed to manage IT operations efficiently."),
            )
        @Composable
        override fun menuIcon() = FaGears(
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
        override val beneHeading: String
            get() = "Why Choose Our Cybersecurity Consulting Services? The Advantages Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Comprehensive Threat Assessment", "Our consultants conduct meticulous assessments to identify and understand potential threats."),
                AddInfo("Customized Solutions", "We don't believe in one-size-fits-all solutions; our strategies are tailored to address the specific vulnerabilities of each client."),
                AddInfo("Data Protection", "Your data is your most valuable asset; we prioritize its protection."),
                AddInfo("Incident Response", "Our rapid incident response plans are designed to mitigate the damage and minimize downtime in the event of a security breach.")
            )
        override val offeringsHead: String
            get() = "Our Cybersecurity Consulting Services Cover:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Security Audits", "We evaluate your existing security measures, identifying strengths and areas for improvement."),
                AddInfo("Risk Assessment", "Our risk assessments delve into your organization's unique threat landscape, pinpointing vulnerabilities and potential risks."),
                AddInfo("Security Policies", "We assist in crafting robust security policies and procedures, tailored to your industry and organization."),
                AddInfo("Training and Awareness", "Education is key; we provide training programs to empower your team with cybersecurity best practices.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaShieldHalved(
                    size = IconSize.X8
                ) },"Defending Against Cyber Threats", "Our strategies employ cutting-edge technologies and methodologies to protect against a wide range of cyber threats, including malware, phishing, and ransomware."),
                CardInfo({ FaIndustry(
                    size = IconSize.X8
                ) },"Meeting Industry Standards", "We ensure that your cybersecurity practices align with industry regulations and compliance standards, keeping you on the right side of the law and minimizing potential legal issues."),
                CardInfo({ FaStopwatch(
                    size = IconSize.X8
                ) },"Prepared for the Worst", "Our comprehensive incident response plans equip you to handle security incidents with efficiency and effectiveness, minimizing their impact on your operations."),
                CardInfo({ FaIdCardClip(
                    size = IconSize.X8
                ) }, "Building a Security-Aware Culture", "We emphasize creating a security-conscious workforce within your organization through targeted training and awareness programs."),
                CardInfo({ FaClipboardCheck(
                    size = IconSize.X8
                ) }, "Assessing Third-Party Risk", "We assess the security of third-party vendors and their potential impact on your security, reducing risks associated with external partnerships."),
                CardInfo({ FaScaleBalanced(
                    size = IconSize.X8
                ) }, "Ensuring Regulatory Compliance", "Our services include auditing and ensuring compliance with industry-specific regulations, providing peace of mind and regulatory adherence."),
                CardInfo({ FaUserSecret(
                    size = IconSize.X8
                ) }, "Utilizing the Latest Solutions", "We harness state-of-the-art cybersecurity tools and technologies to safeguard your systems and data, ensuring you stay ahead of emerging threats."),
            )
        @Composable
        override fun menuIcon() = FaShield(
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
        override val beneHeading: String
            get() = "Why Choose Our Business Innovations Consulting Services? The Advantages Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Strategic Growth", "Our consulting solutions are strategically designed to help businesses formulate innovative growth strategies that are aligned with their long-term objectives."),
                AddInfo("Operational Efficiency", "We specialize in optimizing business processes, making them more efficient, cost-effective, and conducive to innovation."),
                AddInfo("Market Adaptation", "In rapidly evolving markets, adaptability is key. Our services ensure that your business remains agile and responsive to market shifts."),
                AddInfo("Competitive Edge", "With our innovations consulting, you gain a competitive edge by staying ahead of the curve in terms of innovation and market trends.")
            )
        override val offeringsHead: String
            get() = "Our Business Innovations Consulting Services Include:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Innovation Assessment", "We conduct thorough assessments of your current innovation capabilities, identifying strengths and opportunities for improvement."),
                AddInfo("Strategic Planning", "Our experts work closely with your team to create innovative strategies tailored to your industry, market position, and organizational goals."),
                AddInfo("Process Optimization", "We streamline workflows and operations, eliminating bottlenecks and inefficiencies to enhance productivity."),
                AddInfo("Market Research", "Our research methodologies help you identify emerging market trends and untapped opportunities, informing your innovation initiatives.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaUsersRays(
                    size = IconSize.X8
                ) }, "Fostering an Innovative Work Environment", "We guide organizations in fostering an innovative work environment by encouraging creative thinking, risk-taking, and cross-functional collaboration among employees."),
                CardInfo({ FaMicrochip(
                    size = IconSize.X8
                ) }, "Leveraging Technology for Innovation", "In the digital age, technology is a driving force behind innovation. We help businesses leverage technology for innovation, guiding them through digital transformation initiatives."),
                CardInfo({ FaSitemap(
                    size = IconSize.X8
                ) }, "Navigating Organizational Change", "Our change management strategies ensure that organizational transitions during innovation implementations are smooth and well-managed, minimizing disruptions."),
                CardInfo({ FaBolt(
                    size = IconSize.X8
                ) }, "Sparking Creative Thinking", "We offer workshops and methodologies that spark creative thinking and idea generation among your teams, providing a fertile ground for innovation."),
                CardInfo({ FaLightbulb(
                    size = IconSize.X8
                ) },"Bringing Ideas to Life", "We assist in bringing innovative concepts to life through prototyping and testing, reducing risks associated with full-scale implementation."),
            )
        @Composable
        override fun menuIcon() = FaRightLeft(
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
        override val beneHeading: String
            get() = "Why Choose Our Risk Assessment Services? The Advantages Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Comprehensive Analysis", "Our team conducts in-depth assessments to identify risks comprehensively, leaving no stone unturned."),
                AddInfo("Tailored Solutions", "We understand that every business is unique. Our solutions are customized to address your specific risk landscape."),
                AddInfo("Threat Mitigation", "Beyond identifying risks, we provide strategies to mitigate these risks, ensuring a proactive approach to security."),
                AddInfo("Data Protection", "Your data is critical. We prioritize data protection in our risk assessment process.")
            )
        override val offeringsHead: String
            get() = "Our Risk Assessment Services Cover:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Vulnerability Assessment", "We identify vulnerabilities in your systems and operations, pinpointing areas that need attention."),
                AddInfo("Threat Analysis", "Our experts assess potential threats, whether they originate from internal or external sources."),
                AddInfo("Compliance Evaluation", "We evaluate your compliance with industry regulations and standards, ensuring legal adherence."),
                AddInfo("Risk Mitigation Strategies", "We provide actionable strategies to reduce or eliminate identified risks.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaIndustry(
                    size = IconSize.X8
                ) }, "Tailored to Your Industry", "Our risk assessments are tailored to your specific industry, taking into account industry-specific threats and regulations, ensuring relevance and accuracy."),
                CardInfo({ FaScaleBalanced(
                    size = IconSize.X8
                ) }, "Navigating Compliance Requirements", "We ensure that your risk management practices align with industry-specific regulations and compliance standards, helping you avoid legal complications."),
                CardInfo({ FaFileShield(
                    size = IconSize.X8
                ) }, "Securing Critical Data", "Cybersecurity is a core focus. We evaluate and enhance your cybersecurity measures to protect critical data from breaches and theft."),
                CardInfo({ FaCircleInfo(
                    size = IconSize.X8
                ) }, "How We Work", "Our risk assessment process involves meticulous data collection, thorough analysis, and detailed reporting, ensuring you receive a holistic view of your risk landscape."),
                CardInfo({ FaClipboardCheck(
                    size = IconSize.X8
                ) }, "Actionable Insights", "Our risk reports provide you with actionable insights, allowing you to make informed decisions and prioritize risk mitigation strategies effectively."),
            )
        @Composable
        override fun menuIcon() = FaHurricane(
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
        override val beneHeading: String
            get() = "Why Choose Our Technical Recruiting Services? The Advantages Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Access to Top Talent", "With our extensive network and industry expertise, we provide access to a pool of highly qualified tech professionals."),
                AddInfo("Streamlined Hiring", "We simplify the hiring process, saving you time and effort, so you can focus on your core business activities."),
                AddInfo("Industry Expertise", "Our team specializes in recruiting for specific tech roles and industries, ensuring that candidates possess the skills and knowledge required."),
                AddInfo("Quality Assurance", "We are committed to ensuring that candidates meet rigorous quality standards, ensuring that you receive the best talent for your organization.")
            )
        override val offeringsHead: String
            get() = "Our Technical Recruiting Services Include:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Job Analysis", "We begin by conducting a thorough analysis of your job requirements and organizational culture."),
                AddInfo("Candidate Sourcing", "Our strategies include proactive sourcing and candidate attraction to identify the best candidates in the market."),
                AddInfo("Screening and Assessment", "We assess candidates' skills, qualifications, and cultural fit to ensure they align with your needs."),
                AddInfo("Interview Coordination", "We coordinate interviews, provide candidate feedback, and facilitate the hiring process, streamlining your recruitment efforts.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaIndustry(
                    size = IconSize.X8
                ) }, "Recruiting for Your Industry", "Our technical recruiting services are adaptable to a wide range of industries, including IT, software development, engineering, and more. We tailor our approach to meet the unique demands of your industry."),
                CardInfo({ FaGlobe(
                    size = IconSize.X8
                ) },"Building a Network of Top Talent", "Our ongoing efforts include building and nurturing relationships with a vast network of top tech professionals. We maintain an active talent pool ready for placement."),
                CardInfo({ FaPeopleGroup(
                    size = IconSize.X8
                ) }, "Tailored to Your Needs", "We understand that each organization has unique recruitment needs. Our solutions are customized to address your specific requirements, ensuring a perfect fit for your team."),
                CardInfo({ FaCircleInfo(
                    size = IconSize.X8
                ) }, "How We Work", "Our recruitment process involves a collaborative approach, starting with a consultation to define your needs and continuing through candidate placement. We keep you informed and involved every step of the way."),
            )
        @Composable
        override fun menuIcon() = FaUserGroup(
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
        override val beneHeading: String
            get() = "Why Choose Our Brand Marketing Services? The Advantages Are Clear:"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Enhanced Brand Visibility", "Our strategies boost brand visibility, ensuring your target audience recognizes and remembers your brand."),
                AddInfo("Audience Engagement", "We create engaging campaigns and content that resonate with your audience, fostering strong connections."),
                AddInfo("Brand Loyalty", "Our approach encourages customer loyalty and trust, turning one-time buyers into brand advocates."),
                AddInfo("Risk Mitigation", "We conduct thorough security audits and develop strategies to safeguard your data and systems."),
                AddInfo("Market Positioning", "We position your brand as an industry leader, ensuring you stand out among competitors.")
            )
        override val offeringsHead: String
            get() = "Our Brand Marketing Services Include:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("Brand Strategy", "We develop tailored brand strategies that align with your unique goals and resonate with your audience."),
                AddInfo("Content Marketing", "Our content creation and distribution strategies establish your brand as an authority in your industry."),
                AddInfo("Social Media Management", "We expertly manage and optimize your social media platforms, fostering meaningful interactions."),
                AddInfo("Digital Advertising", "Our digital advertising expertise drives targeted campaigns that deliver results.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaIndustry(
                    size = IconSize.X8
                ) }, "Experience Across Industries", "With experience across diverse industries, our brand marketing solutions are adaptable and tailored to the specific needs of your industry."),
                CardInfo({ FaPeopleArrows(
                    size = IconSize.X8
                ) }, "Connecting with Your Audience", "We understand the importance of connecting with your unique target audience. Our strategies are customized to engage and resonate with your specific demographics."),
                CardInfo({ FaPhotoFilm(
                    size = IconSize.X8
                ) }, "Crafting Unique Brand Identities", "Our creative team excels at crafting distinctive and memorable brand identities that leave a lasting impression."),
                CardInfo({ FaClipboardCheck(
                    size = IconSize.X8
                ) },"Informed Decision-Making", "Data analytics and insights are at the core of our approach. We use data to inform our strategies, enabling data-driven decisions and continuous improvement.")
            )
        @Composable
        override fun menuIcon() = FaRankingStar(
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
        override val beneHeading: String
            get() = "Why Choose Our POS Consulting Services?"
        override val benefits: List<AddInfo>
            get() = listOf(
                AddInfo("Enhanced Efficiency", "Our consulting services identify and eliminate operational bottlenecks, streamlining your business processes for improved efficiency."),
                AddInfo("Improved Customer Experiences", "With a well-tailored Toast POS system, you can provide seamless and satisfying customer interactions, increasing loyalty."),
                AddInfo("Increased Profits", "Our data-driven insights enable you to make informed decisions, resulting in higher sales and profitability."),
                AddInfo("Toast Partnership", "PhoenixRedwolf's partnership with Toast, a renowned POS provider, ensures you have access to leading-edge technology and support.")
            )
        override val offeringsHead: String
            get() = "Our POS Consulting Services Include:"
        override val offerings: List<AddInfo>
            get() = listOf(
                AddInfo("System Assessment", "We conduct a comprehensive analysis of your existing POS system to identify strengths, weaknesses, and opportunities for improvement."),
                AddInfo("POS Implementation", "Our team specializes in implementing and optimizing Toast POS systems to maximize their benefits for your business."),
                AddInfo("Training and Support", "We provide tailored training programs and ongoing support to ensure your team can effectively utilize the POS system.")
            )
        override val cards: List<CardInfo>
            get() = listOf(
                CardInfo({ FaBreadSlice(
                    size = IconSize.X8
                ) }, "Leveraging Toast's Leading Technology", "PhoenixRedwolf is well-versed in the capabilities of Toast's advanced POS technology. Our expertise allows us to harness its full potential to benefit your business."),
                CardInfo({ FaBowlFood(
                    size = IconSize.X8
                ) },"Food Service Sector Expertise", "Our POS consulting services are customized to cater to the specific needs and challenges of the food service industry. We understand the nuances that make food service unique."),
                CardInfo({ FaSackDollar(
                    size = IconSize.X8
                ) },"Demonstrating Value", "Our services are designed to provide a clear return on investment. We conduct in-depth cost analyses to demonstrate how optimizing your POS system leads to reduced expenses and increased revenue."),
                CardInfo({ FaHandshakeAngle(
                    size = IconSize.X8
                ) },"Benefits of Our Partnership", "PhoenixRedwolf's partnership with Toast brings substantial benefits, including access to Toast's cutting-edge POS technology, specialized training, and dedicated support. This partnership ensures that you receive the best-in-class solutions to enhance your retail operations."),
            )
        @Composable
        override fun menuIcon() = FaCreditCard(
            modifier = Modifier.padding(right = 20.px),
            size = IconSize.LG
        )
    }
}
