package org.pythonbyte.krux.http

import com.squareup.okhttp.Response
import org.json.JSONObject
import org.pythonbyte.krux.json.JsonObject

class HttpResponse(private val response: Response) {
    fun isOk(): Boolean = response.code() == 200

    fun getBytes(): ByteArray = response.body().bytes()

    fun getResponse(): Response = response

    fun getJsonObject(): JsonObject {
        val responseBody = response.body().string().trim()
        return JsonObject(JSONObject(responseBody))
    }
}
