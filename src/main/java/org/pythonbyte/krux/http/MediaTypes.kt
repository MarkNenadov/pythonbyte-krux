package org.pythonbyte.krux.http

import okhttp3.MediaType.Companion.toMediaTypeOrNull

object MediaTypes {
    val UTF_JSON = "application/json; charset=utf-8".toMediaTypeOrNull()
}
