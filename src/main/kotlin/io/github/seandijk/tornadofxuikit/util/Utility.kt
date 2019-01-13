package io.github.seandijk.tornadofxuikit.util

import javafx.scene.paint.Color

//todo make extentionmethod
fun darkenColor(color: Color) = color.deriveColor(0.0, 1.2, 0.9, 1.0)
fun darkenColor(color: Color, times: Int): Color {
    val darkened = color.deriveColor(0.0, 1.2, 0.9, 1.0 )
    return if (times > 1){
        darkenColor(darkened, times-1)
    } else
        darkened
}

