package net.prismclient.aether

import net.prismclient.aether.dependencies.AnimationStyles
import net.prismclient.aether.dependencies.ComponentStyles
import net.prismclient.aether.dependencies.IconStyles
import net.prismclient.aether.dependencies.TextStyles
import net.prismclient.aether.ui.component.type.layout.grid.UIGridLayout
import net.prismclient.aether.ui.screen.UIScreen
import net.prismclient.aether.ui.style.util.UIFontFamily
import net.prismclient.aether.ui.util.extensions.px

class ExampleScreen : UIScreen() {
    override fun initialize() {
        UIFontFamily("Poppins", "/fonts/", "regular", "black", "bold", "light", "thin")

        build {
            dependsOn(::TextStyles)
            dependsOn(::IconStyles)
            dependsOn(::ComponentStyles)
            dependsOn(::AnimationStyles)

            component(
                    UIGridLayout("container")
            ) {
                rows = mutableListOf(px(50), px(190), px(50))
                columns = mutableListOf(px(50), px(190), px(50))

                applyStyle("btn") {
                    for (i in 1 .. 50) {
                        button("button: $i")
                            .hover("fadeIn", "fadeOut")
                    }
                }
            }
        }
    }
}