package org.pythonbyte.krux.url

import java.net.URLEncoder

fun utf8UrlValue(value: String): String {
    return URLEncoder.encode(value, "UTF-8")
}

fun mapToUrlParameterString(parameterMap: Map<String, String>) : String {
    return parameterMap.keys.joinToString(separator = "&") { parameterName ->
        parameterName + "=" + parameterMap[parameterName]
    }
}