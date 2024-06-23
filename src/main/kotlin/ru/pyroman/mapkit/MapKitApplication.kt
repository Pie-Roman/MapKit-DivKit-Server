package ru.pyroman.mapkit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MapKitApplication

fun main(args: Array<String>) {
    runApplication<MapKitApplication>(*args)
}