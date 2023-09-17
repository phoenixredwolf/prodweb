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
fun Webdev() {
    val title = "Professional Web Development Services | Custom Websites | PhoenixRedwolf Digital Services"
    val description = "Elevate your online presence with PhoenixRedwolf Digital Services. Our professional web development services craft custom websites that captivate your audience. Explore our web development solutions today!"

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
                        src = Res.Image.webdevlg,
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
                            content = { Text("Web Development Services") }
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
                            Text("Establish your online presence and brand with a responsive web application that represents your brand and conveys your unique value.")
                        }
                        P(
                            attrs = ServicePHeadingStyle.toModifier()
                                .classNames("fs-4")
                                .toAttrs()
                        ) {
                            Text("We create unforgettable user experiences on all devices and will ensure your application is SEO compliant and optimized for Google search. From logos and icons to customer portals, we can handle all aspects of your web development needs.")
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
                    content = { Text("Elevate Your Online Presence with Expert Web Development") }
                )
                P(
                    attrs = Modifier
                        .classNames("fs-4")
                        .textAlign(TextAlign.Justify)
                        .padding(bottom = 10.px)
                        .toAttrs(),
                    content = {
                        Text("Welcome to PhoenixRedwolf Digital Services, where we craft digital experiences that drive success. Our Web Development Services are designed to help businesses thrive in the online world. Explore how our expertise can transform your online presence.")
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
                                    Text("Designs as Unique as Your Brand")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We specialize in creating custom website designs that capture the essence of your brand. Our designs are tailored to your unique needs and goals.")
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
                                    Text("Unlock the Power of Online Sales")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Experience e-commerce solutions that drive sales and conversions. We'll help you set up online stores, integrate payment gateways, and manage product catalogs.")
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
                                    Text("Effortless Content Updates")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Keep your website content fresh and up-to-date with user-friendly CMS platforms like WordPress, Drupal, or Joomla.")
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
                                    Text("Seamless Across All Devices")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We prioritize responsive web design, ensuring that your website functions flawlessly on all devices, from smartphones to desktops.")
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
                                    Text("Boost Your Online Visibility")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our web development incorporates SEO best practices to improve search engine rankings and drive organic traffic to your site.")
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
                                    Text("Putting Users First")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We focus on creating intuitive interfaces and seamless navigation to enhance the overall user experience and keep visitors engaged.")
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
                                    Text("Lightning-Fast Loading")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our performance optimization strategies ensure that your website loads quickly, providing a smooth user experience.")
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
                                    Text("Protecting Your Digital Assets")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("We prioritize security, implementing measures such as SSL certificates and data encryption to safeguard your website and user data.")
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
                                    Text("Flawless Functionality")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our rigorous testing processes ensure that your website functions flawlessly and is free of bugs before launch.")
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
                                    Text("Your Vision, Our Expertise")
                                }
                            )
                            P(
                                attrs = Modifier
                                    .classNames("fs-5")
                                    .textAlign(TextAlign.Justify)
                                    .toAttrs()
                            ) {
                                Text("Our rigorous testing processes ensure that your website functions flawlessly and is free of bugs before launch.")
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
                        content = { Text("Why Choose Our Web Development Services? The Benefits Are Remarkable:") }
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
                            content = { Text("Enhanced User Experience: ") }
                        )
                        Text("Our designs prioritize user-friendly interfaces for increased engagement.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Improved Brand Visibility: ") }
                        )
                        Text("Stand out in the digital landscape and attract a wider audience.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Increased Engagement: ") }
                        )
                        Text("Engage your visitors with compelling website features and content.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Higher Conversion Rates: ") }
                        )
                        Text("Optimize your site for conversions with our data-driven approach.")
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
                        content = { Text("Our Web Development Services Include:") }
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
                            content = { Text("Custom Website Design: ") }
                        )
                        Text("Unique, tailor-made designs to reflect your brand identity.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("E-commerce Development: ") }
                        )
                        Text("Powerful online stores with seamless payment solutions.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Content Management Systems (CMS): ") }
                        )
                        Text("User-friendly platforms for easy content updates.")
                    }
                    Li {
                        Span(
                            attrs = Modifier
                                .fontWeight(FontWeight.SemiBold)
                                .toAttrs(),
                            content = { Text("Web Application Development: ") }
                        )
                        Text("Innovative web apps to streamline business processes.")
                    }
                }
            }
        }
    }
}