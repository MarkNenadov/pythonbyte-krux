package org.pythonbyte.krux.http

import okhttp3.*
import org.pythonbyte.krux.json.JsonObject

fun sendRequest(request: Request?): HttpResponse = HttpResponse(OkHttpClient().newCall(request).execute())

fun buildRequest(
    url: String,
    headers: Headers,
    postBody: RequestBody,
): Request? = buildUrl(url).headers(headers).post(postBody).build()

fun buildGetRequest(
    url: String,
    headers: Headers,
): Request? = buildUrl(url).headers(headers).get().build()

private fun buildUrl(url: String): Request.Builder = Request.Builder().url(url)

fun createPostBody(bodyMap: Map<String, Any>): RequestBody {
    val jsonContent = JsonObject(bodyMap).toString()
    val mediaType = MediaType.parse("application/json; charset=utf-8")

    return RequestBody.create(mediaType, jsonContent)
}
