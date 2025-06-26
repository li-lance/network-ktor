package com.seraphim.core.network.ktor

import android.content.Context
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

object NetworkContextProvider : KoinComponent {
    val context: Context
        get() = get()
}