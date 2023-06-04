package org.pythonbyte.krux.http

import com.squareup.okhttp.*
import org.json.JSONObject
import org.pythonbyte.krux.json.JsonObject

fun sendRequest(request: Request?): Response {
    return OkHttpClient().newCall( request ).execute()
}
 fun buildRequest(url: String, headers: Headers, postBody: RequestBody): Request? {
    return Request.Builder().url( url ).headers( headers ).post( postBody ).build();
}

 fun createPostBody( bodyMap: Map<String, Any> ) : RequestBody {
    val jsonContent = JsonObject( JSONObject( bodyMap ) ).toString()

    return RequestBody.create( MediaType.parse( "application/json; charset=utf-8"), jsonContent)
}

