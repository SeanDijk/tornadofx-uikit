package io.github.seandijk.tornadofxuikit.styles

import javafx.scene.paint.Color
import tornadofx.*

class TableStyles : Stylesheet() {

    init {
        tableView{
            borderColor += box(Color.TRANSPARENT)
        }
        tableRowCell{
            backgroundColor = multi(Color.WHITE)
            and(selected){
                backgroundColor = multi(UIKitStyles.COLOR_PRIMARY)
            }
        }
        tableCell{
            padding = box( 8.px, 16.px)
            borderWidth = multi(box(0.1.px, 0.px))
            borderColor += box(Color.GRAY)
        }
        columnHeader{
            backgroundColor = multi(Color.WHITE)
            label{
                textFill = Color.GRAY
            }
        }

        tabHeaderBackground{
            backgroundColor = multi(Color.WHITE)
        }
    }
}