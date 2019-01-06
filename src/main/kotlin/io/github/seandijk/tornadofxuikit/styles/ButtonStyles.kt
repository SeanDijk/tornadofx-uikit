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
        ukButtonDefault {
            +Mixins.createButtonMixin(
                    buttonColor = Color.WHITE,
                    borderColor = Color.web("e5e5e5"),
                    borderHover = Color.DARKGRAY,
                    borderClick = Color.BLACK,
                    textColor = Color.BLACK)
        }

        ukButtonPrimary{
            +Mixins.createButtonMixin(
                    buttonColor = UIKitStyles.COLOR_PRIMARY,
                    buttonHover = darkenColor(UIKitStyles.COLOR_PRIMARY),
                    buttonClick = darkenColor(UIKitStyles.COLOR_PRIMARY, 2),
                    borderColor = Color.TRANSPARENT,
                    textColor = Color.WHITE
            )
        }

        ukButtonSecondary{
            +Mixins.createButtonMixin(
                    buttonColor = UIKitStyles.COLOR_PRIMARY,
                    buttonHover = UIKitStyles.COLOR_PRIMARY.darker(),
                    buttonClick = UIKitStyles.COLOR_PRIMARY.darker().darker(),
                    borderColor = Color.TRANSPARENT,
                    textColor = Color.WHITE
            )
        }
        ukButtonDanger{
            +Mixins.createButtonMixin(
                    buttonColor = UIKitStyles.COLOR_DANGER,
                    buttonHover = darkenColor(UIKitStyles.COLOR_DANGER),
                    buttonClick = darkenColor(UIKitStyles.COLOR_DANGER, 2),
                    borderColor = Color.TRANSPARENT,
                    textColor = Color.WHITE
            )
        }
        ukButtonPositive{
            +Mixins.createButtonMixin(
                    buttonColor = UIKitStyles.COLOR_POSITIVE,
                    buttonHover = darkenColor(UIKitStyles.COLOR_POSITIVE),
                    buttonClick = darkenColor(UIKitStyles.COLOR_POSITIVE, 2),
                    borderColor = Color.TRANSPARENT,
                    textColor = Color.WHITE
            )
        }
    }

    private object Mixins{

        fun createButtonMixin(buttonColor: Color,
                              buttonHover: Color = buttonColor,
                              buttonClick: Color = buttonColor,
                              borderColor: Color,
                              borderHover: Color = borderColor,
                              borderClick: Color = borderColor,
                              textColor: Color,
                              textHover: Color = textColor,
                              textClick: Color = textColor): CssSelectionBlock {
            return mixin {
                //Set shape and font
                +UIKitStyles.Mixins.rectangular
                UIKitStyles.montserratExtraBold?.let { font = it ; fontFamily = it.family;}

                borderWidth += box(1.px)
                padding = box(10.px, 30.px)

                //Set the default colors
                this.backgroundColor = multi(buttonColor)
                this.borderColor += box(borderColor)
                this.textFill = textColor

                //Hover colors
                and(Stylesheet.hover){
                    this.backgroundColor = multi(buttonHover)
                    this.borderColor += box(borderHover)
                    this.textFill = textHover
                }

                //Click colors
                and(Stylesheet.pressed){
                    this.backgroundColor = multi(buttonClick)
                    this.borderColor += box(borderClick)
                    this.textFill = textClick
                }
            }
        }
    }
}