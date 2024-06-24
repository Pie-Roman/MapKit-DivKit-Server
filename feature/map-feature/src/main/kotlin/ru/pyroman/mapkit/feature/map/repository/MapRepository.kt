package ru.pyroman.mapkit.feature.map.repository

import ru.pyroman.mapkit.common.view.View
import ru.pyroman.mapkit.feature.map.view.MapView

internal class MapRepository {
    fun getView(): View {
        return MapView()
    }
}