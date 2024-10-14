package org.pythonbyte.krux.json

import org.json.JSONArray
import org.json.JSONException

class JsonArray(
    val wrappedJSONArray: JSONArray,
) {
    constructor(jsonString: String) : this(
        try {
            JSONArray(jsonString)
        } catch (e: JSONException) {
            JSONArray()
        },
    )

    fun length(): Int = wrappedJSONArray.length()

    fun getAsList(): List<JsonObject> =
        (0 until wrappedJSONArray.length()).map {
            JsonObject(wrappedJSONArray.getJSONObject(it))
        }
}
