package ru.pyroman.mapkit.feature.map.service

import org.springframework.stereotype.Service
import ru.pyroman.mapkit.common.view.View

@Service
interface MapService {

    fun getView(): View
}