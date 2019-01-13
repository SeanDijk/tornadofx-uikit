package io.github.seandijk.tornadofxuikit.styles

import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextBold
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextDanger
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextEmphasis
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextLarge
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextLead
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextMeta
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextMuted
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextPrimary
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextSmall
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextSuccess
import io.github.seandijk.tornadofxuikit.styles.UIKitStyles.Companion.ukTextWarning
import javafx.scene.text.FontWeight
import tornadofx.*


class TypographyStyles: Stylesheet() {
    init {

        ukTextLead{
            +Mixins.largeText
            +Mixins.emphasis
        }

        ukTextMeta{
            +Mixins.smallText
            +Mixins.muted
        }

        ukTextSmall{
            +Mixins.smallText
        }
        ukTextLarge{
            +Mixins.largeText
        }
        ukTextBold{
            fontWeight = FontWeight.BOLD
        }



        //Text color
        ukTextMuted {
            +Mixins.muted
        }
        ukTextEmphasis {
            +Mixins.emphasis
        }
        ukTextPrimary {
            textFill = c("#1e87f0")
        }
        ukTextSuccess {
            textFill = c("#32d296")
        }
        ukTextWarning {
            textFill = c("#faa05a")
        }
        ukTextDanger {
            textFill = c("#f0506e")
        }
    }

    private object Mixins{
        val largeText = mixin {
            fontSize = 24.px
            fontWeight = FontWeight.LIGHT
        }
        val smallText = mixin {
            fontSize = 14.px
            fontWeight = FontWeight.NORMAL
        }
        val emphasis = mixin {
            textFill = c("#222")
        }
        val muted = mixin {
            textFill = c("#999")
        }
    }
}
