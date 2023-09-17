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
fun ITConsult() {
    val title = "Expert IT Consulting Services | Strategic Technology Solutions | PhoenixRedwolf Digital Services"
    val description = "Empower your business with top-tier IT consulting services at PhoenixRedwolf Digital Services. Our experts deliver strategic technology solutions tailored to your needs. Explore IT consulting now!"

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
                        src = Res.Image.itconsultlg,
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
                            content = { Text("IT Consulting") }
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
                            Text("PhoenixRedwolf's IT Consulting empowers businesses through strategic technology planning, cost optimization, and efficient IT solutions. Unlock your full potential with tailored guidance from our experts.")
                        }
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("With PhoenixRedwolf's IT Consulting, you gain a trusted partner dedicated to transforming your technology challenges into strategic advantages.")
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
                    content = { Text("Empowering Your Business with IT Consulting") }
                )
                P(
                    attrs = Modifier
                        .classNames("fs-4")
                        .textAlign(TextAlign.Justify)
                        .padding(bottom = 10.px)
                        .toAttrs(),
                    content = {
                        Text("At PhoenixRedwolf Digital Services, we believe that technology should be a strategic asset, not a hindrance. Our IT Consulting services are designed to empower your business by aligning technology with your organizational goals. Whether you're a startup seeking efficient solutions or an established company aiming to stay ahead, our experts are here to guide you.")
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
                                    Text("Enhancing Communication:")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Elevate your communication with advanced features such as call forwarding, voicemail-to-email, call conferencing, and interactive voice response (IVR) systems.")
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
                                    Text("Seamless Business Integration")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("VoIP isn't just about calls; it's about enhancing your entire workflow. Our VoIP systems seamlessly integrate with your other business applications, including Customer Relationship Management (CRM) tools, email platforms, and more.")
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
                                    Text("Stay Connected on the Go")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Embrace the freedom of mobility. Our VoIP solutions allow your team to stay connected and productive, whether they're in the office or on the move.")
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
                                    Text("Protecting Your Communication")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Security is paramount. Rest assured, our VoIP services employ robust encryption and authentication measures to safeguard your sensitive conversations.")
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
                                    Text("Your Success Is Our Priority")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We're not just here to provide VoIP services; we're here to ensure you get the most out of them. Our dedicated support team is ready to assist you, and we offer comprehensive training to help your team effectively utilize your VoIP systems.")
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
                        content = { Text("Why Choose Our VoIP Services? The Advantages Are Unmistakable:") }
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
                            content = { Text("Superior Call Quality: ") }
                        )
                        Text("Experience crystal-clear voice calls with exceptional audio quality.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Cost Savings: ") }
                        )
                        Text("Reduce your phone bills significantly compared to traditional landlines.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Scalability: ") }
                        )
                        Text("Grow your communication system seamlessly as your business expands.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Remote Work: ") }
                        )
                        Text("Enable your team to stay connected from anywhere, supporting modern work arrangements.")
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
                        content = { Text("Our VoIP Services Encompass:") }
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
                            content = { Text("Hosted VoIP: ") }
                        )
                        Text("Harness the power of cloud-based phone systems with our hosted VoIP solutions.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("VoIP Phones: ") }
                        )
                        Text("Choose from our range of VoIP phones, including desk phones and software-based softphones.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Call Management: ") }
                        )
                        Text("Take control of your communication with features like call routing, auto-attendants, and call recording.")
                    }
                }
            }
        }
    }
}