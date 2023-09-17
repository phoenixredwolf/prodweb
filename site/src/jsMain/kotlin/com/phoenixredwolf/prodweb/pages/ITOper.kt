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
fun ITOper() {
    val title = "Efficient IT Operations Management | Streamline Business Technology | PhoenixRedwolf Digital Services"
    val description = "Optimize your business technology with our IT Operations services at PhoenixRedwolf Digital Services. From infrastructure management to performance optimization, we streamline IT for your success."

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
                        src = Res.Image.itoperlg,
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
                            content = { Text("IT Operations") }
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
                            Text("Experience seamless business operations with PhoenixRedwolf's IT Operations expertise. We manage, monitor, and optimize your IT infrastructure for peak performance and reliability.")
                        }
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("With PhoenixRedwolf's IT Operations expertise, you can be confident that your business technology is in capable hands, allowing you to focus on your core operations while we optimize your IT environment for success.")
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
                    content = { Text("Enhancing Business Efficiency with IT Operations") }
                )
                P(
                    attrs = Modifier
                        .classNames("fs-4")
                        .textAlign(TextAlign.Justify)
                        .padding(bottom = 10.px)
                        .toAttrs(),
                    content = {
                        Text("PhoenixRedwolf Digital Services offers comprehensive IT Operations solutions designed to enhance your business's operational efficiency. Our seasoned professionals ensure that your IT infrastructure is managed, monitored, and optimized to perfection, providing the foundation for your business's success.")
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
                                    Text("Securing Your Operations")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our IT Operations services include robust security measures such as vulnerability assessments, patch management, and advanced threat detection to safeguard your systems and data.")
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
                                    Text("Staying Compliant")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We ensure that your IT operations align with industry regulations and compliance standards, mitigating risks and ensuring legal compliance.")
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
                                    Text("Adapt and Grow")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our solutions are designed to adapt and grow alongside your business, ensuring technology keeps pace with your evolving needs.")
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
                                    Text("Effective Vendor Partnerships")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We manage vendor relationships on your behalf, optimizing services and negotiating costs to benefit your business.")
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
                                    Text("Prepare for the Unexpected")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our disaster recovery planning ensures that your business remains operational even in the face of unexpected disruptions, protecting your continuity.")
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
                                    Text("Efficient Implementation")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We excel at project management, overseeing IT infrastructure upgrades and implementations to ensure efficient and effective execution.")
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
                                    Text("Empowering Your Team")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("To empower your team, we offer training and knowledge transfer services, equipping them with the skills and knowledge needed to manage IT operations efficiently.")
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
                        content = { Text("Why Choose Our IT Operations Services? The Advantages Are Clear:") }
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
                            content = { Text("Infrastructure Management: ") }
                        )
                        Text("Our experts excel in the management and maintenance of IT infrastructure, guaranteeing it functions at its peak.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Cost Efficiency: ") }
                        )
                        Text("We help you reduce operational costs without compromising on performance.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Reliability and Availability: ") }
                        )
                        Text("Count on us to maintain high system reliability and availability to minimize disruptions.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Scalability: ") }
                        )
                        Text("Our solutions are scalable, allowing your technology to grow with your business.")
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
                            Text("Our IT Operations Services Cover:")
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
                            content = { Text("Infrastructure Monitoring: ") }
                        )
                        Text("With 24/7 monitoring, we proactively identify and resolve issues before they affect your operations.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("System Maintenance: ") }
                        )
                        Text("We conduct regular maintenance to prevent downtime and ensure your systems operate flawlessly.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Backup and Disaster Recovery: ") }
                        )
                        Text("Our robust backup and disaster recovery plans protect your data and ensure business continuity.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Performance Optimization: ") }
                        )
                        Text("Count on us to fine-tune your systems for optimal performance.")
                    }
                }
            }
        }
    }

}