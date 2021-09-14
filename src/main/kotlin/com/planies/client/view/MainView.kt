package com.planies.client.view

import tornadofx.*

class MainView : View("Hello TornadoFX") {
    val sidebarView: SidebarView by inject()

    override val root = borderpane {
        left = sidebarView.root
        center = label("Center")
    }
}
