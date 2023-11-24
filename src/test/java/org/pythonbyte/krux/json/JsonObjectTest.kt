package org.pythonbyte.krux.json

import org.json.JSONObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class JsonObjectTest {
    @Test
    fun testHasKey() {
        val jsonObject = JsonObject(JSONObject("{\"name\":\"Elizabeth\"}"))

        assertTrue(jsonObject.hasKey("name"))
        assertFalse(jsonObject.hasKey("age"))
    }

    @Test
    fun testGetString() {
        val jsonObject = JsonObject(JSONObject("{\"name\":\"Elizabeth\"}"))

        val result = jsonObject.getString("name")

        assertEquals("Elizabeth", result)
    }

    @Test
    fun testGetInt() {
        val jsonObject = JsonObject(JSONObject("{\"age\":33}"))

        val result = jsonObject.getInt("age")

        assertEquals(33, result)
    }

    @Test
    fun testGetStringArray() {
        val jsonObject = JsonObject(JSONObject("{\"names\": [\"mark\", \"bob\"]}"))

        val result = jsonObject.getStringArray("names")

        assertEquals(2, result.size)
        assertTrue(result.contains("mark"))
        assertTrue(result.contains("bob"))
    }

    @Test
    fun testGetKeys() {
        val jsonObject = JsonObject(JSONObject("{\"age\":33, \"weight\":155}"))

        val result = jsonObject.getKeys()

        assertEquals(2, result.size)
        assertTrue(result.contains("age"))
        assertTrue(result.contains("weight"))
    }
}
