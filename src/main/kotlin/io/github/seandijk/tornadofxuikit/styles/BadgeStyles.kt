package io.github.seandijk.tornadofxuikit.styles

import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.COLOR_PRIMARY
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukBadge
import javafx.scene.paint.Color
import tornadofx.*

class BadgeStyles: Stylesheet() {
    init {
        ukBadge{
            fill = COLOR_PRIMARY
            backgroundColor = multi(COLOR_PRIMARY)
            padding = box(4.px, 8.px)
            backgroundRadius = multi(box(30.px))
            textFill = Color.WHITE
        }
    }
}