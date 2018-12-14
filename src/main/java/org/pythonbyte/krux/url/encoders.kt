package org.pythonbyte.krux.url

import java.net.URLEncoder

fun utf8Url( value: String ): String? {
    return URLEncoder.encode( value, "UTF-8")
}