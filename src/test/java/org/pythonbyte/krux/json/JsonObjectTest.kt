package org.pythonbyte.krux.json

import org.json.JSONObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class JsonObjectTest {
    @Test
    fun testHasKey() {
        with(JsonObject(JSONObject("{\"name\":\"Elizabeth\"}"))) {
            assertTrue(hasKey("name"))
            assertFalse(hasKey("age"))
        }
    }

    @Test
    fun testRandomKey() {
        with(JsonObject(JSONObject("{\"name\":\"Elizabeth\", \"age\": 4, \"place\": \"Detroit\"}"))) {
            assertTrue(listOf("name", "age", "place").contains(randomKey()))
        }
    }

    @Test
    fun testGetStrings() {
        val jsonObject = JsonObject(JSONObject("{\"name\":\"Elizabeth\", \"age\": 4, \"place\": \"Detroit\"}"))

        with(jsonObject.getStrings("name", "place")) {
            assertTrue(contains("Elizabeth"))
            assertTrue(contains("Detroit"))
        }
    }

    @Test
    fun testGetStringWhenAbsent() {
        with(JsonObject(JSONObject("{\"name\":\"Elizabeth\"}"))) {
            assertEquals("", getString("place"))
        }
    }

    @Test
    fun testGetStringWhenExists() {
        val jsonObject = JsonObject(JSONObject("{\"name\":\"Elizabeth\"}"))

        assertEquals("Elizabeth", jsonObject.getString("name"))
    }

    @Test
    fun testGetBoolean() {
        val jsonObject = JsonObject(JSONObject("{\"isActive\":false}"))

        assertFalse(jsonObject.getBoolean("isActive"))
    }

    @Test
    fun testGetInt() {
        val jsonObject = JsonObject(JSONObject("{\"age\":33}"))

        val result = jsonObject.getInt("age")

        assertEquals(33, result)
    }

    @Test
    fun testGetBigDecimal() {
        val jsonObject = JsonObject(JSONObject("{\"id\":12439484359745847}"))

        val result = jsonObject.getBigDecimal("id")

        assertEquals(BigDecimal(12439484359745847), result)
    }

    @Test
    fun testGetStringArrayWhenExists() {
        val jsonObject = JsonObject(JSONObject("{\"names\": [\"mark\", \"bob\"]}"))

        with(jsonObject.getStringArray("names")) {
            assertEquals(2, size)
            assertTrue(contains("mark"))
            assertTrue(contains("bob"))
        }
    }

    @Test
    fun testGetStringArrayWhenAbsent() {
        val jsonObject = JsonObject(JSONObject("{\"names\": [\"mark\", \"bob\"]}"))

        assertEquals(0, jsonObject.getStringArray("doesntexist").size)
    }

    @Test
    fun testGetArrayWhenExists() {
        val jsonObject = JsonObject(JSONObject("{'people': [{'name':'george'},{'name':'mike'},{'name':'helen'}]}"))

        with(jsonObject.getArray("people")) {
            assertEquals(3, size)
            assertEquals("george", this[0].getString("name"))
            assertEquals("mike", this[1].getString("name"))
            assertEquals("helen", this[2].getString("name"))
        }
    }

    @Test
    fun testGetArrayWhenAbsent() {
        val jsonObject = JsonObject(JSONObject("{'people': [{'name':'george'},{'name':'mike'},{'name':'helen'}]}"))

        assertEquals(0, jsonObject.getArray("doesntexist").size)
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
