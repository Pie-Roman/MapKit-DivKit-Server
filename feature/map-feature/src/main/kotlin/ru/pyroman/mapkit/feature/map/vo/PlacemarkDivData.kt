package ru.pyroman.mapkit.feature.map.vo

import divkit.dsl.Div

internal class PlacemarkDivData(
    val id: String,
    val point: Point,
    val div: Div,
)

internal class Point(
    val latitude: Double,
    val longitude: Double,
)