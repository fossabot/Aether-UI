package net.prismclient.aether.dependencies

import net.prismclient.aether.ui.animation.ease.impl.UIQuart
import net.prismclient.aether.ui.animation.impl.UIDefaultAnimation
import net.prismclient.aether.ui.animation.util.UIAnimationResult
import net.prismclient.aether.ui.unit.UIUnit
import net.prismclient.aether.ui.util.UIDependable
import net.prismclient.aether.ui.util.extensions.animation
import net.prismclient.aether.ui.util.extensions.asRGBA

/**
 * Example of animations as a [UIDependable]
 */
class AnimationStyles : UIDependable() {
    override fun load() {
        animation(UIDefaultAnimation("fadeIn")) {
            keyframe(UIQuart(250L), true) {
                background {
                    color = asRGBA(0f, 0f, 0f, 0.5f)
                    border {
                        borderColor = asRGBA(255, 255, 255, 0.5f)
                        borderWidth = 1f
                    }
                }
                animationResult = UIAnimationResult.Retain
                keep() // Same thing as above, and in the method params of the block function
            }
        }

        animation(UIDefaultAnimation("fadeOut")) {
            keyframe(UIQuart(250L), true) {
                background {
                    color = asRGBA(0f, 0f, 0f, 0.3f)
                    border {}
                }
            }
        }
    }
}