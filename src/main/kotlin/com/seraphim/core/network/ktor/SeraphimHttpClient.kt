package com.seraphim.core.network.ktor

import com.chuckerteam.chucker.api.ChuckerInterceptor
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.okhttp.OkHttp

fun createHttpClient(
    isDebugBuild: Boolean = true,
    config: HttpClientConfig<*>.() -> Unit
): HttpClient {
    return HttpClient(OkHttp) {
        engine {
            if (isDebugBuild) {
                addInterceptor(ChuckerInterceptor(NetworkContextProvider.context))
            }
        }
        config()
    }
}