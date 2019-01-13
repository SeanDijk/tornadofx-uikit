package io.github.seandijk.tornadofxuikit.styles

import javafx.scene.effect.BlurType
import javafx.scene.effect.DropShadow
import javafx.scene.paint.Color
import tornadofx.*

/**
 * All the classes get declared here so they can get added from one central point.
 * Implementations of the styles in done is thematic class added as import in the constructor.
 */
class UIKitStyles : Stylesheet(
        ButtonStyles::class,
        TableStyles::class,
        TabStyles::class,
        TypographyStyles::class,
        InputStyles::class,
        BadgeStyles::class,
        AccordionStyles::class,
        AlertStyles::class
) {
    companion object {
        //Components
        val ukCard by cssclass()
        val ukAccordion by cssclass()

        //Alerts
        val ukAlertDefault   by cssclass()
        val ukAlertPrimary   by cssclass()
        val ukAlertSucces    by cssclass()
        val ukAlertWarning   by cssclass()
        val ukAlertDanger    by cssclass()

        //Background
        val ukBackgroundDefault by cssclass()
        val ukBackgroundMuted by cssclass()
        val ukBackgroundPrimary by cssclass()
        val ukBackgroundSecondary by cssclass()

        //Text
        //-- Style modifiers
        val ukTextLead by cssclass()
        val ukTextMeta by cssclass()

        //-- Font size
        val ukTextSmall by cssclass()
        val ukTextLarge by cssclass()

        //-- Font Weight
        val ukTextBold by cssclass()

        //-- Text color
        val ukTextMuted     by cssclass()
        val ukTextEmphasis  by cssclass()
        val ukTextPrimary   by cssclass()
        val ukTextSuccess   by cssclass()
        val ukTextWarning   by cssclass()
        val ukTextDanger    by cssclass()

        val ukBadge by cssclass()

        //Buttons
        val ukButtonPrimary by cssclass()
        val ukButtonSecondary by cssclass()
        val ukButtonDanger by cssclass()
        val ukButtonPositive by cssclass()
        val ukButtonDefault by cssclass()

        //Input
        //--Fields
        val ukSearchField by cssclass()
        val ukTextField by cssclass()
        val ukTextArea by cssclass()
        val ukComboBox by cssclass()
        //--Other
        val ukRadioButton by cssclass()
        val ukCheckBox by cssclass()
        val ukSlider by cssclass()


        //
        val ukProgressBar by cssclass()


        //Fonts
        val montserratExtraBold = loadFont("/fonts/montserrat/Montserrat-Medium.ttf", 9)


        //Colors
        val COLOR_PRIMARY = Color.web("#1e87f0")!!
        val COLOR_PRIMARY_10pDarker = Color.web("#056ED7")!!
        val COLOR_PRIMARY_20pDarker = Color.web("#0054BD")!!
        val COLOR_SECONDARY = Color.web("#222")!!


        val COLOR_DANGER = c("#d50000")
        val COLOR_POSITIVE = c("#4caf50")
        
    }

    object Mixins{
        val rectangular = mixin {
            backgroundRadius = multi(box(Dimension(0.0, Dimension.LinearUnits.em)))
            borderRadius = multi(tornadofx.box(0.0.em))
        }

        val borderThin = mixin {
            borderWidth += box(1.px)
            borderColor += box(Color.web("e5e5e5"))
        }
    }


    init {
        ukCard{
            backgroundColor += Color.WHITE
            padding = box(32.px)
            effect = DropShadow().apply {
                blurType    =   BlurType.GAUSSIAN
                color       =   Color.GREY
                radius      =   20.0
                offsetX     =   5.0
                offsetY     =   5.0
            }
        }
        ukProgressBar{
            accentColor = COLOR_PRIMARY.darker().darker()

        }
    }
}