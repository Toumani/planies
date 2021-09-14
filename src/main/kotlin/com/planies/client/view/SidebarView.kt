package com.planies.client.view

import tornadofx.*


class SidebarView : View() {
    override val root = hbox {
        text("Planies")
        listmenu(theme = "blue") {
            item(text = "Accueil") {
                activeItem = this
                whenSelected {  }
            }
            item(text = "Projets")
            item(text = "Calendrier")
            item(text = "Transactions")
            item(text = "Quitter")
        }
    }
}