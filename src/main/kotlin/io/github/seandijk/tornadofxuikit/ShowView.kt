package io.github.seandijk.tornadofxuikit

import io.github.seandijk.tornadofxuikit.styles.UIKitStyles
import tornadofx.*


class MyApp: App(ShowView::class, UIKitStyles::class)
class ShowView : View("Showing all the css elements!") {

    private val paddingOuterElements = 20
    private val paddingInnerElements = 8.0

    override val root = vbox {
        label(title) { addClass(UIKitStyles.heading) }

        squeezebox {
            addClass(UIKitStyles.ukAccordion)
            fold("Text"){
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
                label("Buttons") { addClass(UIKitStyles.heading) }
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
                label("Inputs") { addClass(UIKitStyles.heading) }
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
