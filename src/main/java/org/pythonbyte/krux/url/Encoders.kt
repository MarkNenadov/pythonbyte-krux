package org.pythonbyte.krux.url

import java.net.URLEncoder

fun String.utf8UrlValue(): String {
    return URLEncoder.encode(this, "UTF-8")
}

fun mapToUrlParameterString(parameterMap: Map<String, String>): String {
    return parameterMap.keys.joinToString(separator = "&") { parameterName ->
        require(parameterName.isNotEmpty()) {
            "Emtpy map key (parameter name) not supported in mapToUrlParameterString"
        }
        parameterName + "=" + parameterMap[parameterName]
    }
}
