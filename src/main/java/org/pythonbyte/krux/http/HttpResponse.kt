package org.pythonbyte.krux.http

import okhttp3.Response
import okhttp3.ResponseBody
import org.json.JSONObject
import org.pythonbyte.krux.json.JsonArray
import org.pythonbyte.krux.json.JsonObject

class HttpResponse(
    private val response: Response,
) {
    fun code(): Int = response.code

    fun message(): String = response.message

    fun isOk(): Boolean = code() == 200

    fun getBytes(): ByteArray = getBody()!!.bytes()

    fun getResponse(): Response = response

    fun getJsonObject(): JsonObject {
        val responseBody = getBody()!!.string().trim()
        return JsonObject(JSONObject(responseBody))
    }

    fun getJsonArray(): List<JsonObject> {
        val responseBody = getBody()!!.string().trim()
        return JsonArray(responseBody).getAsList()
    }

    private fun getBody(): ResponseBody? = response.body
}
