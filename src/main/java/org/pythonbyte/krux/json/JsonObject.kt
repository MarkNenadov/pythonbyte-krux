package org.pythonbyte.krux.json

import org.json.JSONObject

class JsonObject(val wrappedJSONObject: JSONObject) {
    fun getString(key: String): String {
        if ( isNull( key ) ) {
            return "";
        }
        return wrappedJSONObject.getString(key)
    }

    fun getInt(key: String): Int {
        return wrappedJSONObject.getInt(key)
    }

    fun getArray(key: String): List<JsonObject> {
        return if (hasKey(key)) {
            wrappedJSONObject.getJSONArray(key).map { JsonObject(it as JSONObject) }
        } else {
            emptyList()
        }
    }

    fun getStringArray(key: String): List<String> {
        if ( hasKey(key)) {
            return wrappedJSONObject.getJSONArray(key).map { it.toString() }
        }

        return listOf()
    }


    fun isNull(key: String): Boolean {
        return wrappedJSONObject.isNull(key)
    }

    fun getObject(key: String): JsonObject {
        return JsonObject(wrappedJSONObject.getJSONObject(key))
    }

    fun hasKey(key: String): Boolean {
        return wrappedJSONObject.has(key)
    }

    override fun toString(): String {
        return wrappedJSONObject.toString()
    }

    fun getBoolean(key: String): Boolean {
        return wrappedJSONObject.getBoolean(key)
    }

    fun getKeys(): List<String> {
        return wrappedJSONObject.keys().asSequence().toList()
    }
}