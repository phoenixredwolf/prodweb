package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.components.widgets.ContactButton
import com.phoenixredwolf.prodweb.theme.*
import com.phoenixredwolf.prodweb.utility.Constants
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
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun Network() {
    val title = "Wired & Wireless Network Services | Reliable Network Solutions | PhoenixRedwolf Digital Services"
    val description = "Transform your connectivity with PhoenixRedwolf Digital Services. Explore our wired and wireless network solutions for reliable and efficient business operations. Elevate your network infrastructure today!"

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
                        src = Res.Image.networklg,
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
                            content = { Text("Wired & Wireless Network Services") }
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
                            Text("Does your company need there wireless network optimized? Maybe it's time to update your routers and firewalls.")
                        }
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("Whether going completely wireless, upgrading your wired services, or just needing your server closets organized, our specialists will take care of every aspect of your networks.")
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
                    content = { Text("Empower Your Business with Reliable Network Services") }
                )
                P(
                    attrs = Modifier
                        .classNames("fs-4")
                        .textAlign(TextAlign.Justify)
                        .padding(bottom = 10.px)
                        .toAttrs(),
                    content = {
                        Text("Welcome to PhoenixRedwolf Digital Services, where seamless connectivity is our specialty. Our Wired & Wireless Network Services are designed to keep your business running smoothly, whether you're in the office, at home, or on the go. Discover the power of robust and secure network solutions.")
                    }
                )
                Benefits()
                ServiceOfferings()
                H3(
                    attrs = ServiceH3Style.toModifier().toAttrs(),
                    content = {
                        Link(
                            modifier = ContactLinkStyle.toModifier(),
                            path = Constants.CONTACT,
                            text = "Schedule a call"
                        )
                        Br()
                        Text("For A Quote Today!!!")
                    }
                )
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
                                    Text("The Backbone of Reliable Connectivity")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We specialize in designing and implementing wired network solutions that provide unparalleled reliability and stability. Whether you're in the office or at a remote location, count on our wired networks to keep you connected.")
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
                                    Text("Seamless Wi-Fi Solutions")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Experience efficient wireless connectivity with our Wi-Fi solutions. From access point installation to network optimization, we ensure your wireless network performs flawlessly.")
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
                                    Text("Grow Your Connectivity with Confidence")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our network solutions are designed to scale with your business. As you expand, we'll adjust your network infrastructure to meet your evolving connectivity needs.")
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
                                    Text("Protecting Your Network and Data")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We take network security seriously. Our comprehensive measures, including firewall protection, intrusion detection, and encryption, ensure your data remains secure.")
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
                                    Text("Real-Time Oversight")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our network monitoring services provide real-time insights into your network's performance. We proactively identify and resolve issues, minimizing downtime.")
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
                                    Text("Tailored Network Solutions")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Every business is unique. Our network solutions are customized to match your specific requirements, providing a personalized network infrastructure that suits your needs.")
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
                                    Text("Reliable Assistance Anytime, Anywhere")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We're here to support you around the clock. Whether you have questions, need assistance, or face network issues, our 24/7 support team is just a call away.")
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
                                    Text("Your Connectivity Partner")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our customer support team is dedicated to ensuring your network experience is seamless. We're not just a service provider; we're your trusted partner in connectivity.")
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
                        content = { Text("Why Choose Our Network Services? The Benefits Are Clear:") }
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
                            content = { Text("Improved Reliability: ") }
                        )
                        Text("Say goodbye to network downtime and interruptions.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Scalability: ") }
                        )
                        Text("Grow your network resources as your business expands.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Enhanced Security: ") }
                        )
                        Text("Protect your data with advanced firewall and encryption measures.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Productivity Boost: ") }
                        )
                        Text("Enjoy efficient operations with a reliable network infrastructure.")
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
                            Text("Our Network Services Portfolio:")
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
                            content = { Text("Wired Network Design: ") }
                        )
                        Text("Expert design and implementation of stable wired networks.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Wireless Network Setup: ") }
                        )
                        Text("Seamless Wi-Fi solutions and access point installations.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Network Security: ") }
                        )
                        Text("Robust security measures, including firewall and intrusion detection.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Network Monitoring: ") }
                        )
                        Text("Real-time insights and proactive issue resolution.")
                    }
                }
            }
        }
    }

}