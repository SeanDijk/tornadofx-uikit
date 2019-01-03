package io.github.seandijk.tornadofxuikit.styles

import javafx.scene.paint.Color
import tornadofx.*

class TabStyles: Stylesheet() {
    init {
        tab{
            //Make sure the size and padding is fine.
            minHeight = 150.px
            maxHeight = 150.px
            padding = box(8.px, 16.px)

            //Set the background color and border at the bottom
            backgroundColor = multi(Color.TRANSPARENT)
            borderColor = multi(box(Color.LIGHTGRAY))
            borderWidth= multi(box(0.px, 0.px, 1.px, 0.px))

            and(selected){
                //Make border color the primary color and increase its thickness. Also make the label black.
                borderColor += box(UIKitStyles.COLOR_PRIMARY)
                borderWidth= multi(box(0.px, 0.px, 3.px, 0.px))
                tabLabel{ textFill = Color.BLACK }
            }
            //Make sure the selected tab text stays black even when hovered
            and(selected and hover) {
                tabLabel{
                    textFill = Color.BLACK
                }
            }

            //Make the unselected hovered item text color a little darker
            and(hover){
                tabLabel{
                    textFill = Color.DIMGRAY
                }
            }
            tabLabel{
                UIKitStyles.montserratExtraBold?.let { font = it ; fontFamily = it.family}
                textFill = Color.DARKGRAY
            }

            //Removes the blue lines
            focusColor = Color.TRANSPARENT
            faintFocusColor = Color.TRANSPARENT
        }
    }
}