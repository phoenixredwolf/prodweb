package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.widgets.ContactButton
import com.phoenixredwolf.prodweb.components.widgets.ScheduleConsult
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun Cyber() {
    val title = "Expert Cybersecurity Consulting Services | Protect Your Business | PhoenixRedwolf Digital Services"
    val description = "Safeguard your business with top-tier cybersecurity consulting services at PhoenixRedwolf Digital Services. Our experts provide tailored solutions to protect against cyber threats. Explore cybersecurity consulting now!"

    PageLayout(title, description) {
        Column(
            modifier = Modifier
                .margin(top = 150.px)
                .padding(bottom = 20.px)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        src = Res.Image.cyberlg,
                        modifier = ServiceImageStyle.toModifier()
                    )
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(90.percent),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        H1(
                            attrs = ServiceH1Style.toModifier()
                                .toAttrs(),
                            content = { Text("Cybersecurity Consulting") }
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(90.percent),
                        horizontalAlignment = Alignment.Start
                    ) {
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("PhoenixRedwolf's Cybersecurity Consulting Services provide tailored defense strategies against evolving cyber threats. Safeguard your business with our expert guidance and cutting-edge solutions.")
                        }
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("With PhoenixRedwolf's Cybersecurity Consulting, you gain a formidable partner dedicated to fortifying your digital defenses and keeping your business secure in an increasingly complex digital landscape.")
                        }
                        Row(
                            modifier = ServiceCBRowStyle.toModifier(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            ContactButton()
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                H3(
                    attrs = ServiceH3Style.toModifier().toAttrs(),
                    content = { Text("Protecting Your Business with Cybersecurity Consulting") }
                )
                P(
                    attrs = Modifier
                        .classNames("fs-4")
                        .textAlign(TextAlign.Justify)
                        .padding(bottom = 10.px)
                        .toAttrs(),
                    content = {
                        Text("At PhoenixRedwolf Digital Services, our Cybersecurity Consulting services are dedicated to shielding your business from the ever-evolving landscape of cyber threats. We understand that cybersecurity is paramount in today's digital age, and our experts are here to fortify your defenses, ensuring your valuable data and operations remain secure.")
                    }
                )
                Benefits()
                ServiceOfferings()
                ScheduleConsult()
                SimpleGrid(
                    modifier = Modifier.fillMaxWidth().margin(top = 25.px).alignContent(AlignContent.Center),
                    numColumns = numColumns(base = 1, md=2, lg =3)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = ServiceColumnStyle.toModifier(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            H5(
                                attrs = ServiceH5Style.toModifier().fillMaxWidth().toAttrs(),
                                content = {
                                    Text("Defending Against Cyber Threats")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our strategies employ cutting-edge technologies and methodologies to protect against a wide range of cyber threats, including malware, phishing, and ransomware.")
                            }

                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = ServiceColumnStyle.toModifier(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            H5(
                                attrs = ServiceH5Style.toModifier().fillMaxWidth().toAttrs(),
                                content = {
                                    Text("Meeting Industry Standards")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We ensure that your cybersecurity practices align with industry regulations and compliance standards, keeping you on the right side of the law and minimizing potential legal issues.")
                            }
                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = ServiceColumnStyle.toModifier(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            H5(
                                attrs = ServiceH5Style.toModifier().fillMaxWidth().toAttrs(),
                                content = {
                                    Text("Prepared for the Worst")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our comprehensive incident response plans equip you to handle security incidents with efficiency and effectiveness, minimizing their impact on your operations.")
                            }

                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = ServiceColumnStyle.toModifier(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            H5(
                                attrs = ServiceH5Style.toModifier().fillMaxWidth().toAttrs(),
                                content = {
                                    Text("Building a Security-Aware Culture")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We emphasize creating a security-conscious workforce within your organization through targeted training and awareness programs.")
                            }

                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = ServiceColumnStyle.toModifier(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            H5(
                                attrs = ServiceH5Style.toModifier().fillMaxWidth().toAttrs(),
                                content = {
                                    Text("Assessing Third-Party Risk")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We assess the security of third-party vendors and their potential impact on your security, reducing risks associated with external partnerships.")
                            }
                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = ServiceColumnStyle.toModifier(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            H5(
                                attrs = ServiceH5Style.toModifier().fillMaxWidth().toAttrs(),
                                content = {
                                    Text("Ensuring Regulatory Compliance")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our services include auditing and ensuring compliance with industry-specific regulations, providing peace of mind and regulatory adherence.")
                            }
                        }
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = ServiceColumnStyle.toModifier(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            H5(
                                attrs = ServiceH5Style.toModifier().fillMaxWidth().toAttrs(),
                                content = {
                                    Text("Utilizing the Latest Solutions")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We harness state-of-the-art cybersecurity tools and technologies to safeguard your systems and data, ensuring you stay ahead of emerging threats.")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun Benefits() {
    SimpleGrid(
        modifier = Modifier.fillMaxWidth(),
        numColumns = numColumns(base = 1, md=4)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            H3(
                attrs = ServiceH3Style.toModifier().toAttrs(),
                content = { Text("Benefits") }
            )
        }
        Row(
            modifier = ServiceBPStyle.toModifier(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    H5(
                        attrs = ServiceH5Style.toModifier().toAttrs(),
                        content = { Text("Why Choose Our Cybersecurity Consulting Services? The Advantages Are Clear:") }
                    )
                }
                Ul(
                    attrs = Modifier.textAlign(TextAlign.Start).classNames("fs-6").toAttrs()
                ) {
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Comprehensive Threat Assessment: ") }
                        )
                        Text("Our consultants conduct meticulous assessments to identify and understand potential threats.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Customized Solutions: ") }
                        )
                        Text("We don't believe in one-size-fits-all solutions; our strategies are tailored to address the specific vulnerabilities of each client.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Data Protection: ") }
                        )
                        Text("Your data is your most valuable asset; we prioritize its protection.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Incident Response: ") }
                        )
                        Text("Our rapid incident response plans are designed to mitigate the damage and minimize downtime in the event of a security breach.")
                    }
                }
            }
        }
    }
}

@Composable
private fun ServiceOfferings() {
    SimpleGrid(
        modifier = Modifier.fillMaxWidth(),
        numColumns = numColumns(base = 1, md=4)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            H3(
                attrs = ServiceH3Style.toModifier().width(Width.MinContent).toAttrs(),
                content = { Text("Services") }
            )
        }
        Row(
            modifier = ServiceBPStyle.toModifier(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    H5(
                        attrs = ServiceH5Style.toModifier().toAttrs(),
                        content = {
                            Text("Our Cybersecurity Consulting Services Cover:")
                        }
                    )
                }
                Ul(
                    attrs = Modifier
                        .fillMaxWidth()
                        .textAlign(TextAlign.Start).classNames("fs-6").toAttrs()
                ) {
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Security Audits: ") }
                        )
                        Text("We evaluate your existing security measures, identifying strengths and areas for improvement.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Risk Assessment: ") }
                        )
                        Text("Our risk assessments delve into your organization's unique threat landscape, pinpointing vulnerabilities and potential risks.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Security Policies: ") }
                        )
                        Text("We assist in crafting robust security policies and procedures, tailored to your industry and organization.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Training and Awareness: ") }
                        )
                        Text("Education is key; we provide training programs to empower your team with cybersecurity best practices.")
                    }
                }
            }
        }
    }

}