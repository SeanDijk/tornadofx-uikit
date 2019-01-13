package io.github.seandijk.tornadofxuikit.styles

import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.COLOR_PRIMARY
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukAccordion
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukBadge
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.TextAlignment
import tornadofx.*

class AccordionStyles: Stylesheet() {
    init {
        ukAccordion{
            backgroundColor = multi(Color.TRANSPARENT)

            titledPane {
                backgroundColor = multi(Color.TRANSPARENT)

                title {
                    backgroundColor = multi(Color.TRANSPARENT)

                    text{
                        fill = c("#222")
                        fontSize = 20.px
                    }

                    arrowButton {
                        alignment = Pos.CENTER_RIGHT
                        textAlignment = TextAlignment.RIGHT
                    }
                }
            }


//            fill = COLOR_PRIMARY
//            backgroundColor = multi(COLOR_PRIMARY)
//            padding = box(4.px, 8.px)
//            backgroundRadius = multi(box(30.px))
//            textFill = Color.WHITE
        }
    }
}