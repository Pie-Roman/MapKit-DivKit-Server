package ru.pyroman.mapkit.feature.map.view

import divkit.dsl.Div
import divkit.dsl.color
import divkit.dsl.core.bind
import divkit.dsl.core.reference
import divkit.dsl.defer
import divkit.dsl.render
import divkit.dsl.scope.DivScope
import divkit.dsl.solidBackground
import divkit.dsl.template
import divkit.dsl.text

private val textRef = reference<String>("textRef")

private val placemarkTemplate = template(
    name = "placemarkTemplate",
) {
    text(
        background = listOf(solidBackground(color = color("#ffffff"))),
    ).defer(
        text = textRef,
    )
}

internal fun DivScope.renderPlacemark(
    text: String,
): Div {
    return render(
        placemarkTemplate,
        textRef bind "Placemark $text",
    )
}