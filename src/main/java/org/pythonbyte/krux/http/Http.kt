package org.pythonbyte.krux.http

import com.squareup.okhttp.Headers
import com.squareup.okhttp.MediaType
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import com.squareup.okhttp.RequestBody
import org.json.JSONObject
import org.pythonbyte.krux.json.JsonObject

fun sendRequest(request: Request?): HttpResponse {
    return HttpResponse(OkHttpClient().newCall(request).execute())
}

fun buildRequest(
    url: String,
    headers: Headers,
    postBody: RequestBody,
): Request? {
    return Request.Builder().url(url).headers(headers).post(postBody).build()
}

fun buildGetRequest(
    url: String,
    headers: Headers,
): Request? {
    return Request.Builder().url(url).headers(headers).get().build()
}

fun createPostBody(bodyMap: Map<String, Any>): RequestBody {
    val jsonContent = JsonObject(JSONObject(bodyMap)).toString()
    val mediaType = MediaType.parse("application/json; charset=utf-8")

    return RequestBody.create(mediaType, jsonContent)
}
