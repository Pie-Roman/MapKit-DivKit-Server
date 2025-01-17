package ru.pyroman.mapkit.common.view

import divkit.dsl.Div
import divkit.dsl.Trigger
import divkit.dsl.Variable
import divkit.dsl.data
import divkit.dsl.divan
import divkit.dsl.scope.DivScope
import divkit.dsl.singleRoot

abstract class View {

    abstract val layoutId: String

    abstract fun DivScope.layout(): Div

    context(DivScope)
    open val variableTriggers: List<Trigger>
        get() = emptyList()

    context(DivScope)
    open val variables: List<Variable>
        get() = emptyList()

    fun getData(): ViewData {
        val divan = divan {
            data(
                logId = layoutId,
                states = singleRoot(
                    div = layout(),
                ),
                variableTriggers = variableTriggers,
                variables = variables,
            )
        }

        return ViewData.Factory.create(
            divan = divan,
        )
    }
}