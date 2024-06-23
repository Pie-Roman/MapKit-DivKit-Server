package ru.pyroman.mapkit.common.view

import divkit.dsl.Divan

class ViewData private constructor(
    val divan: Divan,
) {

    object Factory {

        fun create(
            divan: Divan,
        ): ViewData {

            return ViewData(
                divan = divan,
            )
        }
    }
}