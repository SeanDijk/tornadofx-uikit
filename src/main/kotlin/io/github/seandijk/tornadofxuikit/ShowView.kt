package io.github.seandijk.tornadofxuikit

import io.github.seandijk.tornadofxuikit.styles.UIKitStyles
import javafx.stage.Stage
import tornadofx.*


class MyApp: App(ShowView::class, UIKitStyles::class){

    init {
        reloadStylesheetsOnFocus()
        reloadViewsOnFocus()
    }

    override fun start(stage: Stage) {
        super.start(stage)
        stage.width = 800.0
        stage.height = 1000.0
    }
}
class ShowView : View("Showing all the css elements!") {

    private val paddingOuterElements = 20
    private val paddingInnerElements = 8.0

    override val root = vbox {
        squeezebox {
            addClass(UIKitStyles.ukAccordion)
            fold("Text"){
                squeezebox {
                    paddingLeft = 16

                    addClass(UIKitStyles.ukAccordion)

                    fold("Style modifiers") {
                        label("Lead") { addClass(UIKitStyles.ukTextLead) }
                        label("Meta") { addClass(UIKitStyles.ukTextMeta) }
                    }

                    fold("Font size") {
                        label("Small") { addClass(UIKitStyles.ukTextSmall) }
                        label("Large") { addClass(UIKitStyles.ukTextLarge) }
                    }
                    fold("Font weight"){
                        label("Bold") { addClass(UIKitStyles.ukTextBold) }
                    }
                    fold("Font color"){
                        label("Muted")      { addClass(UIKitStyles.ukTextMuted) }
                        label("Emphasis")   { addClass(UIKitStyles.ukTextEmphasis) }
                        label("Primary")    { addClass(UIKitStyles.ukTextPrimary) }
                        label("Success")    { addClass(UIKitStyles.ukTextSuccess) }
                        label("Warning")    { addClass(UIKitStyles.ukTextWarning) }
                        label("Danger")     { addClass(UIKitStyles.ukTextDanger) }
                    }
                }
            }
            fold("Badge") {
                flowpane{
                    paddingAll = paddingOuterElements
                    hgap = paddingInnerElements
                    vgap = paddingInnerElements
                    label("1") { addClass(UIKitStyles.ukBadge) }
                    label("10") { addClass(UIKitStyles.ukBadge) }
                    label("100") { addClass(UIKitStyles.ukBadge) }
                }
            }


            fold("Buttons"){
                flowpane {
                    paddingAll = paddingOuterElements
                    hgap = paddingInnerElements
                    vgap = paddingInnerElements

                    button("PRIMARY")   { addClass(UIKitStyles.ukButtonPrimary) }
                    button("SECONDARY") { addClass(UIKitStyles.ukButtonSecondary) }
                    button("DANGER")    { addClass(UIKitStyles.ukButtonDanger) }
                    button("POSITIVE")  { addClass(UIKitStyles.ukButtonPositive) }
                    button("DEFAULT")   { addClass(UIKitStyles.ukButtonDefault) }
                }
            }

            fold("Inputs") {
                vbox {
                    paddingAll = paddingOuterElements
                    spacing = paddingInnerElements
                    textfield { addClass(UIKitStyles.ukTextField) }
                    textfield { addClass(UIKitStyles.ukSearchField) }
                    textarea { addClass(UIKitStyles.ukTextArea) }


                    combobox<String> {
                        items = listOf("Hello", "World", "!").observable()
                        addClass(UIKitStyles.ukComboBox) }

                    checkbox("Check me out!") { addClass(UIKitStyles.ukCheckBox) }

                    slider { addClass(UIKitStyles.ukSlider) }

                    togglegroup {
                        radiobutton("First radio button") { addClass(UIKitStyles.ukRadioButton) }
                        radiobutton("Second") { addClass(UIKitStyles.ukRadioButton) }
                        radiobutton("Hello third!") { addClass(UIKitStyles.ukRadioButton) }
                    }
                }
            }

        }





    }
}
