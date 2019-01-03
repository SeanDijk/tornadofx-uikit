package io.github.seandijk.tornadofxuikit.styles

import javafx.scene.paint.Color
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukButtonDanger
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukButtonDefault
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukButtonPositive
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukButtonPrimary
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukButtonSecondary
import io.github.seandijk.tornadofxuikit.util.darkenColor
import tornadofx.*

class ButtonStyles:  Stylesheet() {
    init {
        val ukButtonBase = mixin {
            +UIKitStyles.Mixins.rectangular
            UIKitStyles.montserratExtraBold?.let { font = it ; fontFamily = it.family;}

            borderWidth += box(1.px)
            padding = box(10.px, 30.px)
//            //Make rectangular
//            backgroundRadius = multi(box(Dimension(0.0, Dimension.LinearUnits.em)))
//            borderRadius = multi(tornadofx.box(0.0.em))

        }
        class UkButtonFilled(color: Color, textColor: Color){
            val darker10p = darkenColor(color)
            val darker20p = darkenColor(darker10p)

            val myMixin = mixin {
                +ukButtonBase
                borderColor += box(Color.TRANSPARENT)
                backgroundColor = multi(color)
                color.darker()
                textFill = textColor

                and(Stylesheet.hover){
                    backgroundColor = multi(darker10p)
                }
                and(Stylesheet.pressed){
                    backgroundColor = multi(darker20p)
                }
            }
        }


        ukButtonDefault {
            + ukButtonBase
            borderColor += box(Color.web("e5e5e5"))
            backgroundColor = multi(Color.WHITE)
            textFill = Color.BLACK

            and(Stylesheet.hover){
                borderColor += box(Color.DARKGRAY)
            }
            and(Stylesheet.pressed){
                borderColor += box(Color.BLACK)
            }
        }

        ukButtonPrimary{
            + ukButtonBase
            borderColor += box(Color.TRANSPARENT)
            backgroundColor = multi(UIKitStyles.COLOR_PRIMARY)
            textFill = Color.WHITE

            and(Stylesheet.hover){
                backgroundColor = multi(UIKitStyles.COLOR_PRIMARY_10pDarker)
            }
            and(Stylesheet.pressed){
                backgroundColor = multi(UIKitStyles.COLOR_PRIMARY_20pDarker)
            }
        }


        ukButtonSecondary{
            +UkButtonFilled(UIKitStyles.COLOR_PRIMARY, Color.WHITE).myMixin
        }
        ukButtonDanger{
            +UkButtonFilled(UIKitStyles.COLOR_DANGER, Color.WHITE).myMixin
        }
        ukButtonPositive{
            +UkButtonFilled(UIKitStyles.COLOR_POSITIVE, Color.WHITE).myMixin
        }
    }
}