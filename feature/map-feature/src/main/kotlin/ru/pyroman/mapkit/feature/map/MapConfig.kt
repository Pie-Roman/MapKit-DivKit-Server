package ru.pyroman.mapkit.feature.map

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.pyroman.mapkit.feature.map.controller.MapController
import ru.pyroman.mapkit.feature.map.repository.MapRepository
import ru.pyroman.mapkit.feature.map.service.MapService
import ru.pyroman.mapkit.feature.map.service.MapServiceImpl

@Configuration
class MapConfig {

    @Bean("mapRepository")
    internal fun provideMapRepository(): MapRepository {
        return MapRepository()
    }

    @Bean("mapService")
    internal fun provideMapService(): MapService {
        return MapServiceImpl(
            mapRepository = provideMapRepository(),
        )
    }

    @Bean("mapController")
    fun provideMapController(): MapController {
        return MapController(
            mapService = provideMapService(),
        )
    }
}