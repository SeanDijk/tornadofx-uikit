package io.github.seandijk.tornadofxuikit.styles

import javafx.scene.text.FontWeight
import tornadofx.*


class TypographyStyles: Stylesheet() {
    init {
        label and UIKitStyles.heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }
    }
}