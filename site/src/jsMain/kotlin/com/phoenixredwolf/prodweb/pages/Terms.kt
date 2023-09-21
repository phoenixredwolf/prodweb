package com.phoenixredwolf.prodweb.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.prodweb.components.layouts.PageLayout
import com.phoenixredwolf.prodweb.theme.primaryDark
import com.phoenixredwolf.prodweb.theme.primaryLight
import com.phoenixredwolf.prodweb.theme.secondaryDark
import com.phoenixredwolf.prodweb.theme.secondaryLight
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun Terms() {
    val title = "Terms and Conditions | PhoenixRedwolf Digital Services - Legal Agreement"
    val description = "Read PhoenixRedwolf Digital Services' Terms and Conditions for our digital solutions. Understand our policies, usage guidelines, and legal agreement for our services."

    PageLayout(title,description) {
        Column(
            modifier = Modifier
                .margin(top = 150.px)
                .fillMaxWidth(90.percent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            H1(
                content = { Text("Terms and Conditions") }
            )
            P(
                content = { Text("Last updated: September 21, 2023") }
            )
            P(
                content = { Text("Please read these terms and conditions carefully before using Our Service.") }
            )
            Column(
                modifier = Modifier
                    .textAlign(TextAlign.Start)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Interpretation and Definitions") }
                )

                H3(
                    content = { Text("Interpretation") }
                )
                P(
                    content = { Text("The words of which the initial letter is capitalized have meanings defined under the following conditions. The following definitions shall have the same meaning regardless of whether they appear in singular or in plural.") }
                )

                // Definitions
                H3(
                    content = { Text("Definitions") }
                )
                P(
                    content = { Text("For the purposes of these Terms and Conditions:") }
                )
                Ul {
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Affiliate") }
                            )
                            Text(" means an entity that controls, is controlled by or is under common control with a party, where \"control\" means ownership of 50% or more of the shares, equity interest or other securities entitled to vote for election of directors or other managing authority.")
                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Country") }
                            )
                            Text(" refers to: United States")
                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Company") }
                            )
                            Text(" (referred to as either \"the Company\", \"We\", \"Us\" or \"Our\" in this Agreement) refers to PhoenixRedwolf Digital Services, L.L.C., West Deptford, NJ 08096.")
                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Device") }
                            )
                            Text(" means any device that can access the Service such as a computer, a cellphone or a digital tablet.")
                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Service") }
                            )
                            Text(" refers to the Website.")
                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Terms and Conditions") }
                            )
                            Text("  (also referred as \"Terms\") mean these Terms and Conditions that form the entire agreement between You and the Company regarding the use of the Service. This Terms and Conditions agreement has been created with the help of the ")
                            A(
                                attrs = TermsLinkStyle.toModifier()
                                    .attrsModifier {
                                        attr("href", "https://www.privacypolicies.com/terms-conditions-generator/")
                                    }
                                    .toAttrs(),
                                content = { Text("Terms and Conditions Generator") }
                            )
                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Third-party Social Media Service") }
                            )
                            Text(" means any services or content (including data, information, products or services) provided by a third-party that may be displayed, included or made available by the Service.")
                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("Website") }
                            )
                            Text(" refers to PhoenixRedwolf Digital Services, accessible from ")
                            A(
                                attrs = TermsLinkStyle.toModifier()
                                    .attrsModifier {
                                        attr("href", "https://www.phoenixredwolf.com")
                                    }
                                    .toAttrs(),
                                content = { Text("https://www.phoenixredwolf.com") }
                            )

                        }
                    }
                    Li {
                        P {
                            Span(
                                attrs = Modifier
                                    .fontWeight(FontWeight.Bold)
                                    .toAttrs(),
                                content = { Text("You") }
                            )
                            Text(" means the individual accessing or using the Service, or the company, or other legal entity on behalf of which such individual is accessing or using the Service, as applicable.")
                        }
                    }
                }

                // Acknowledgment
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Acknowledgment") }
                )
                P(
                    content = { Text("These are the Terms and Conditions governing the use of this Service and the agreement that operates between You and the Company. These Terms and Conditions set out the rights and obligations of all users regarding the use of the Service.") }
                )
                P(
                    content = { Text("Your access to and use of the Service is conditioned on Your acceptance of and compliance with these Terms and Conditions. These Terms and Conditions apply to all visitors, users and others who access or use the Service.") }
                )
                P(
                    content = { Text("By accessing or using the Service You agree to be bound by these Terms and Conditions. If You disagree with any part of these Terms and Conditions then You may not access the Service.") }
                )
                P(
                    content = { Text("You represent that you are over the age of 18. The Company does not permit those under 18 to use the Service.") }
                )
                P(
                    content = { Text("Your access to and use of the Service is also conditioned on Your acceptance of and compliance with the Privacy Policy of the Company. Our Privacy Policy describes Our policies and procedures on the collection, use and disclosure of Your personal information when You use the Application or the Website and tells You about Your privacy rights and how the law protects You. Please read Our Privacy Policy carefully before using Our Service.") }
                )

                // External links
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Links to Other Websites") }
                )
                P(
                    content = { Text("Our Service may contain links to third-party web sites or services that are not owned or controlled by the Company.") }
                )
                P(
                    content = { Text("The Company has no control over, and assumes no responsibility for, the content, privacy policies, or practices of any third party web sites or services. You further acknowledge and agree that the Company shall not be responsible or liable, directly or indirectly, for any damage or loss caused or alleged to be caused by or in connection with the use of or reliance on any such content, goods or services available on or through any such web sites or services.") }
                )
                P(
                    content = { Text("We strongly advise You to read the terms and conditions and privacy policies of any third-party web sites or services that You visit.") }
                )

                // Termination
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Termination") }
                )
                P(
                    content = { Text("We may terminate or suspend Your access immediately, without prior notice or liability, for any reason whatsoever, including without limitation if You breach these Terms and Conditions.") }
                )
                P(
                    content = { Text("Upon termination, Your right to use the Service will cease immediately.") }
                )

                // Limitation of Liability
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Limitation of Liability") }
                )
                P(
                    content = { Text("Notwithstanding any damages that You might incur, the entire liability of the Company and any of its suppliers under any provision of this Terms and Your exclusive remedy for all of the foregoing shall be limited to the amount actually paid by You through the Service or 100 USD if You haven't purchased anything through the Service.") }
                )
                P(
                    content = { Text("To the maximum extent permitted by applicable law, in no event shall the Company or its suppliers be liable for any special, incidental, indirect, or consequential damages whatsoever (including, but not limited to, damages for loss of profits, loss of data or other information, for business interruption, for personal injury, loss of privacy arising out of or in any way related to the use of or inability to use the Service, third-party software and/or third-party hardware used with the Service, or otherwise in connection with any provision of this Terms), even if the Company or any supplier has been advised of the possibility of such damages and even if the remedy fails of its essential purpose.") }
                )
                P(
                    content = { Text("Some states do not allow the exclusion of implied warranties or limitation of liability for incidental or consequential damages, which means that some of the above limitations may not apply. In these states, each party's liability will be limited to the greatest extent permitted by law.")}
                )

                // As Is Disclaimer
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("\"AS IS\" and \"AS AVAILABLE\" Disclaimer") }
                )
                P(
                    content = { Text("The Service is provided to You \"AS IS\" and \"AS AVAILABLE\" and with all faults and defects without warranty of any kind. To the maximum extent permitted under applicable law, the Company, on its own behalf and on behalf of its Affiliates and its and their respective licensors and service providers, expressly disclaims all warranties, whether express, implied, statutory or otherwise, with respect to the Service, including all implied warranties of merchantability, fitness for a particular purpose, title and non-infringement, and warranties that may arise out of course of dealing, course of performance, usage or trade practice. Without limitation to the foregoing, the Company provides no warranty or undertaking, and makes no representation of any kind that the Service will meet Your requirements, achieve any intended results, be compatible or work with any other software, applications, systems or services, operate without interruption, meet any performance or reliability standards or be error free or that any errors or defects can or will be corrected.") }
                )
                P(
                    content = { Text("Without limiting the foregoing, neither the Company nor any of the company's provider makes any representation or warranty of any kind, express or implied: (i) as to the operation or availability of the Service, or the information, content, and materials or products included thereon; (ii) that the Service will be uninterrupted or error-free; (iii) as to the accuracy, reliability, or currency of any information or content provided through the Service; or (iv) that the Service, its servers, the content, or e-mails sent from or on behalf of the Company are free of viruses, scripts, trojan horses, worms, malware, timebombs or other harmful components.") }
                )
                P(
                    content = { Text("Some jurisdictions do not allow the exclusion of certain types of warranties or limitations on applicable statutory rights of a consumer, so some or all of the above exclusions and limitations may not apply to You. But in such a case the exclusions and limitations set forth in this section shall be applied to the greatest extent enforceable under applicable law.") }
                )

                // Governing Law
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Governing Law") }
                )
                P(
                    content = { Text("The laws of the Country, excluding its conflicts of law rules, shall govern this Terms and Your use of the Service. Your use of the Application may also be subject to other local, state, national, or international laws.") }
                )

                // Dispute Resolution
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Disputes Resolution") }
                )
                P(
                    content = { Text("If You have any concern or dispute about the Service, You agree to first try to resolve the dispute informally by contacting the Company.") }
                )

                // European Union
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("For European Union (EU) Users") }
                )
                P(
                    content = { Text("If You are a European Union consumer, you will benefit from any mandatory provisions of the law of the country in which you are resident in.") }
                )

                // US Legal Compliance
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("United States Legal Compliance") }
                )
                P(
                    content = { Text("You represent and warrant that (i) You are not located in a country that is subject to the United States government embargo, or that has been designated by the United States government as a \"terrorist supporting\" country, and (ii) You are not listed on any United States government list of prohibited or restricted parties.") }
                )

                // Severability
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Severability and Waiver") }
                )
                H3(
                    content = { Text("Severability") }
                )
                P(
                    content = { Text("If any provision of these Terms is held to be unenforceable or invalid, such provision will be changed and interpreted to accomplish the objectives of such provision to the greatest extent possible under applicable law and the remaining provisions will continue in full force and effect.") }
                )
                H3(
                    content = { Text("Waiver") }
                )
                P(
                    content = { Text("Except as provided herein, the failure to exercise a right or to require performance of an obligation under these Terms shall not effect a party's ability to exercise such right or require such performance at any time thereafter nor shall the waiver of a breach constitute a waiver of any subsequent breach.") }
                )

                // Translation Interpretation
                H2(
                    content = { Text("Translation Interpretation") }
                )
                P(
                    content = { Text("These Terms and Conditions may have been translated if We have made them available to You on our Service. You agree that the original English text shall prevail in the case of a dispute.") }
                )

                // Changes
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Changes to These Terms and Conditions") }
                )
                P(
                    content = { Text("We reserve the right, at Our sole discretion, to modify or replace these Terms at any time. If a revision is material We will make reasonable efforts to provide at least 30 days' notice prior to any new terms taking effect. What constitutes a material change will be determined at Our sole discretion.") }
                )
                P(
                    content = { Text("By continuing to access or use Our Service after those revisions become effective, You agree to be bound by the revised terms. If You do not agree to the new terms, in whole or in part, please stop using the website and the Service.") }
                )

                // Contact
                H2(
                    attrs = TermsH2Style.toModifier().toAttrs(),
                    content = { Text("Contact Us") }
                )
                P(
                    content = { Text("If you have any questions about these Terms and Conditions, You can contact us:") }
                )
                Ul {
                    Li {
                        P {
                            Text("By email: ")
                            A(
                                attrs = TermsLinkStyle.toModifier()
                                    .attrsModifier {
                                        attr("href", "mailto:contact@phoenixredwolf.com")
                                    }
                                    .toAttrs(),
                                content = { Text("contact@phoenixredwolf.com") }
                            )
                        }
                    }
                    Li {
                        P {
                            Text("By visiting this page on our website: ")
                            A(
                                attrs = TermsLinkStyle.toModifier()
                                    .attrsModifier {
                                        attr("href", "https://www.phoenixredwolf.com/contact")
                                    }
                                    .toAttrs(),
                                content = { Text("https://www.phoenixredwolf.com/contact") }
                            )
                        }
                    }
                    Li {
                        P {
                            Text("By phone number: ")
                            A(
                                attrs = TermsLinkStyle.toModifier()
                                    .attrsModifier {
                                        attr("href", "tel:+18563470392")
                                    }
                                    .toAttrs(),
                                content = { Text("+1 (856) 347-0392") }
                            )
                        }
                    }
                }
            }
        }
    }
}

val TermsH2Style by ComponentStyle.base {
    Modifier
        .margin(top = 25.px)
}

val TermsLinkStyle by ComponentStyle {
    base {
        Modifier
            .textDecorationLine(TextDecorationLine.None)
            .color(if(colorMode==ColorMode.LIGHT) primaryLight else primaryDark)
            .fontWeight(FontWeight.SemiBold)
    }
    hover {
        Modifier
            .color(if(colorMode==ColorMode.LIGHT) secondaryLight else secondaryDark)
    }
}