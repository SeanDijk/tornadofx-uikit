package io.github.seandijk.tornadofxuikit.styles

import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukAlertDanger
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukAlertDefault
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukAlertPrimary
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukAlertSucces
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukAlertWarning
import javafx.scene.paint.Color
import tornadofx.*

class AlertStyles: Stylesheet() {
    init {
        ukAlertDefault{}
        ukAlertPrimary{}
        ukAlertSucces{}
        ukAlertWarning{}
        ukAlertDanger{}
    }
}