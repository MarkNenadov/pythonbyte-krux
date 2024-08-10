package org.pythonbyte.krux.json

import org.json.JSONObject
import java.math.BigDecimal

class JsonObject(
    val wrappedJSONObject: JSONObject,
) {
    constructor(jsonString: String) : this(JSONObject(jsonString))

    fun getString(key: String): String =
        if (isNull(key)) {
            ""
        } else {
            wrappedJSONObject.getString(key)
        }

    fun getInt(key: String): Int = wrappedJSONObject.getInt(key)

    fun getBigDecimal(key: String): BigDecimal = wrappedJSONObject.getBigDecimal(key)

    fun getArray(key: String): List<JsonObject> =
        if (hasKey(key)) {
            wrappedJSONObject.getJSONArray(key).map {
                JsonObject(it as JSONObject)
            }
        } else {
            emptyList()
        }

    fun getStringArray(key: String): List<String> {
        return if (hasKey(key)) {
            wrappedJSONObject.getJSONArray(key).map {
                it.toString()
            }
        } else {
            return emptyList()
        }
    }

    fun isNull(key: String): Boolean = wrappedJSONObject.isNull(key)

    fun getObject(key: String): JsonObject = JsonObject(wrappedJSONObject.getJSONObject(key))

    override fun toString(): String = wrappedJSONObject.toString()

    fun getBoolean(key: String): Boolean = wrappedJSONObject.getBoolean(key)

    // key operations

    fun hasKey(key: String): Boolean = wrappedJSONObject.has(key)

    fun getKeys(): List<String> = wrappedJSONObject.keys().asSequence().toList()

    fun randomKey(): String = getKeys().random()
}
