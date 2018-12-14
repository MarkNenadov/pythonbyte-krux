package org.pythonbyte.krux.url

import java.net.URLEncoder

fun utf8Url(value: String): String? {
    return URLEncoder.encode(value, "UTF-8")
}

fun mapToUrlParameterString(parameterMap: AbstractMap<String, String>) : String {
    return parameterMap.keys.map { parameterName -> parameterName + "=" + parameterMap.get(parameterName)}.joinToString( separator = "&" )
}