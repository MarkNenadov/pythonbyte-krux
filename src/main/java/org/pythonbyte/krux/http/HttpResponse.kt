package org.pythonbyte.krux.http

import com.squareup.okhttp.Response
import com.squareup.okhttp.ResponseBody
import org.json.JSONObject
import org.pythonbyte.krux.json.JsonObject

class HttpResponse(private val response: Response) {
    fun isOk(): Boolean = response.code() == 200

    fun getBytes(): ByteArray = getBody().bytes()

    fun getResponse(): Response = response

    fun getJsonObject(): JsonObject {
        val responseBody = getBody().string().trim()
        return JsonObject(JSONObject(responseBody))
    }

    private fun getBody(): ResponseBody = response.body()
}
