package ru.pyroman.mapkit.feature.map.service

import ru.pyroman.mapkit.common.view.View
import ru.pyroman.mapkit.feature.map.repository.MapRepository

internal class MapServiceImpl(
    private val mapRepository: MapRepository,
) : MapService {

    override fun getView(): View {
        return mapRepository.getView()
    }
}