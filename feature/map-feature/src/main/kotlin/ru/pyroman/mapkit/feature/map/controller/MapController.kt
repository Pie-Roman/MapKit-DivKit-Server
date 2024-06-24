package ru.pyroman.mapkit.feature.map.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.pyroman.mapkit.common.view.ViewData
import ru.pyroman.mapkit.feature.map.service.MapService

@RestController
class MapController(
    private val mapService: MapService,
) {

    @GetMapping("/map")
    fun getViewData(): ViewData {
        return mapService.getView().getData()
    }
}