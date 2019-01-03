package io.github.seandijk.tornadofxuikit.styles

import javafx.geometry.Side
import javafx.scene.layout.BackgroundPosition
import javafx.scene.layout.BackgroundRepeat
import javafx.scene.layout.BackgroundSize
import javafx.scene.paint.Color
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.COLOR_PRIMARY
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukCheckBox
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukComboBox
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukRadioButton
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukSearchField
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukSlider
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextArea
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextField
import tornadofx.*
import java.net.URI

class InputStyles: Stylesheet() {
    init {
        val baseTextField = mixin {
            +UIKitStyles.Mixins.rectangular
            +UIKitStyles.Mixins.borderThin
            padding = box(12.px)

            faintFocusColor = Color.TRANSPARENT
            focusColor = Color.TRANSPARENT
            backgroundColor = multi(Color.WHITE)


            and(focused){
                borderColor = multi(box(COLOR_PRIMARY))
            }
        }

        ukSearchField {
            +baseTextField
            padding = box(12.px, 36.px, 12.px, 12.px)

            backgroundImage += URI("/baseline_search_black_36dp.png")
            backgroundPosition = multi(BackgroundPosition(
                    Side.RIGHT, 10.0, false,
                    Side.TOP, .5, true
            ))
            backgroundRepeat = multi(Pair(BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT))
            backgroundSize = MultiValue(arrayOf(BackgroundSize(BackgroundSize.AUTO, .55, false, true, false, false)))
            prefWidth = 200.px
            maxWidth = 200.px
        }

        ukTextField{
            +baseTextField
        }

        ukTextArea{
            +baseTextField
        }

        ukComboBox{
            +baseTextField
            padding = box(6.px)
        }
        ukCheckBox{
            +UIKitStyles.Mixins.rectangular

            box{
                +UIKitStyles.Mixins.borderThin
                backgroundColor+=Color.TRANSPARENT
            }


            and(selected){
                box{
                    borderColor+= box(COLOR_PRIMARY)
                    backgroundColor += COLOR_PRIMARY
                    mark{
                        backgroundColor += Color.WHITE
                    }
                }
            }

        }

        //Actually based on https://material.io/design/components/sliders.html because UiKit doesnt have this kind of sliders.
        ukSlider{
            accentColor = COLOR_PRIMARY.darker().darker()
        }







        ukRadioButton{
            //todo
            //faintFocusColor = Color.TRANSPARENT
            //focusColor = Color.GRAY
            radio{
                borderColor = multi(box(Color.LIGHTGRAY))
                borderRadius = multi(box(130.px))
                backgroundColor += Color.TRANSPARENT
                dot{
                }
            }

            and(selected){
                radio{
                    //padding = box(2.px)
                    backgroundColor += COLOR_PRIMARY
                    dot{
                        backgroundColor += Color.WHITE
                        //backgroundImage += URI("/baseline_pause_black_36dp.png")
                    }
                }
            }
        }
    }
}