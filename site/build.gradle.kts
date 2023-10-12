
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import kotlinx.html.script
import org.gradle.internal.impldep.org.eclipse.jgit.transport.ReceiveCommand.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
}

group = "com.phoenixredwolf.prodweb"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            head.set(
                buildList {
                    addAll(head.get())
                    add {
                        link {
                            rel = "stylesheet"
                            href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
                        }
                        link {
                            href =
                                "https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css"
                            rel = "stylesheet"
                        }
                        script {
                            src = "https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"
                        }
                        script(type = "text/javascript") {
                            consumer.onTagContent(
                                """
                                (function(c,l,a,r,i,t,y){
                                    c[a]=c[a]||function(){(c[a].q=c[a].q||[]).push(arguments)};
                                    t=l.createElement(r);t.async=1;t.src="https://www.clarity.ms/tag/"+i;
                                    y=l.getElementsByTagName(r)[0];y.parentNode.insertBefore(t,y);
                                })(window, document, "clarity", "script", "ix4cp345v4")
                                """.trimIndent()
                            )
                        }
                        link {
                            rel = "stylesheet"
                            href = "https://fonts.googleapis.com/icon?family=Material+Icons"
                        }
//                        script {
//                            attributes["id"] = "mcjs"
//                            consumer.onTagContent(
//                                """
//                                !function(c,h,i,m,p)
//                                {m=c.createElement(h),p=c.getElementsByTagName(h)
//                                [0],m.async=1,m.src=i,p.parentNode.insertBefore(m,p)}
//                                (document,"script","https://chimpstatic.com/mcjs-connected/js/users/971f2ea437cd3a0a9a2b642c7/a15c01237599c5867b6b7a37d.js");
//                                """.trimIndent()
//                            )
//                        }
                    }
                }
            )
        }
    }
}

kotlin {
    configAsKobwebApplication("prodweb", includeServer = true)

    @Suppress("UNUSED_VARIABLE") // Suppress spurious warnings about sourceset variables not being used
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation(libs.kobwebx.markdown)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(libs.kobweb.api)
            }
        }
    }
}
