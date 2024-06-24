package ru.pyroman.mapkit.feature.map.view

import divkit.dsl.Div
import divkit.dsl.scope.DivScope
import divkit.dsl.text
import ru.pyroman.mapkit.common.view.View
import ru.pyroman.mapkit.feature.map.MapConstants.MAP_LAYOUT_ID

class MapView : View() {

    override val layoutId = MAP_LAYOUT_ID
    override fun DivScope.layout(): Div {
        return mapView()
    }

    private fun DivScope.mapView(): Div {
        return text(
            text = "Hello from BDUI",
        )
    }
}