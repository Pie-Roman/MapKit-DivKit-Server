package ru.pyroman.mapkit.feature.map.view

import divkit.dsl.Div
import divkit.dsl.custom
import divkit.dsl.matchParentSize
import divkit.dsl.scope.DivScope
import ru.pyroman.mapkit.common.view.View
import ru.pyroman.mapkit.feature.map.MapConstants.MAP_LAYOUT_ID
import ru.pyroman.mapkit.feature.map.vo.PlacemarkDivData
import ru.pyroman.mapkit.feature.map.vo.Point

class MapView : View() {

    override val layoutId = MAP_LAYOUT_ID
    override fun DivScope.layout(): Div {
        return mapView(
            placemarks = listOf(
                PlacemarkDivData(
                    id = "1",
                    point = Point(
                        latitude = 55.751280,
                        longitude = 37.629720,
                    ),
                    div = renderPlacemark("1"),
                ),
                PlacemarkDivData(
                    id = "2",
                    point = Point(
                        latitude = 55.761280,
                        longitude = 37.629720,
                    ),
                    div = renderPlacemark("2"),
                ),
                PlacemarkDivData(
                    id = "3",
                    point = Point(
                        latitude = 55.741280,
                        longitude = 37.629720,
                    ),
                    div = renderPlacemark("3"),
                ),
                PlacemarkDivData(
                    id = "4",
                    point = Point(
                        latitude = 55.731280,
                        longitude = 37.629720,
                    ),
                    div = renderPlacemark("4"),
                )
            )
        )
    }

    private fun DivScope.mapView(
        placemarks: List<PlacemarkDivData>,
    ): Div {
        return custom(
            customType = "map",
            width = matchParentSize(),
            height = matchParentSize(),
            customProps = mapOf(
                "placemarks" to placemarks,
            ),
        )
    }
}