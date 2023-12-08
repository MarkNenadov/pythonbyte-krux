package org.pythonbyte.krux.json

import org.json.JSONObject
import java.math.BigDecimal

class JsonObject(val wrappedJSONObject: JSONObject) {
    constructor(jsonString: String) : this(JSONObject(jsonString))

    fun getString(key: String): String {
        if (isNull(key)) {
            return ""
        }
        return wrappedJSONObject.getString(key)
    }

    fun getInt(key: String): Int = wrappedJSONObject.getInt(key)

    fun getBigDecimal(key: String): BigDecimal = wrappedJSONObject.getBigDecimal(key)

    fun getArray(key: String): List<JsonObject> {
        return if (hasKey(key)) {
            wrappedJSONObject.getJSONArray(key).map {
                JsonObject(it as JSONObject)
            }
        } else {
            emptyList()
        }
    }

    fun getStringArray(key: String): List<String> {
        if (hasKey(key)) {
            return wrappedJSONObject.getJSONArray(key).map {
                it.toString()
            }
        }

        return listOf()
    }

    fun isNull(key: String): Boolean = wrappedJSONObject.isNull(key)

    fun getObject(key: String): JsonObject = JsonObject(wrappedJSONObject.getJSONObject(key))

    fun hasKey(key: String): Boolean = wrappedJSONObject.has(key)

    override fun toString(): String = wrappedJSONObject.toString()

    fun getBoolean(key: String): Boolean = wrappedJSONObject.getBoolean(key)

    fun getKeys(): List<String> = wrappedJSONObject.keys().asSequence().toList()
}
