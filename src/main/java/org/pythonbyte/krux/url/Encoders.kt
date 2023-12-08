package org.pythonbyte.krux.url

import java.net.URLEncoder

fun String.utf8UrlValue(): String {
    return URLEncoder.encode(this, "UTF-8")
}

fun mapToUrlParameterString(parameterMap: Map<String, String>): String {
    return parameterMap.keys.joinToString(separator = "&") { parameterName ->
        parameterName + "=" + parameterMap[parameterName]
    }
}
