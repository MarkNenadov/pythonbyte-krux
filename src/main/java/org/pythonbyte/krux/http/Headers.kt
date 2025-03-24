package org.pythonbyte.krux.http

import okhttp3.Headers

fun buildHeaders(headersMap: Map<String, String> = emptyMap()): Headers =
    Headers.Builder().apply {
        headersMap.forEach { (key, value) -> add(key, value) }
    }.build()
