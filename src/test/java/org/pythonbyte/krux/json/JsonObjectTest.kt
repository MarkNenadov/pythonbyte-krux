package org.pythonbyte.krux.json

import org.json.JSONObject
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JsonObjectTest {
    @Test
    fun testHasKey() {
        val jsonObject = JsonObject( JSONObject( "{\"name\":\"Elizabeth\"}" ))

        assertTrue(jsonObject.hasKey("name"))
        assertFalse(jsonObject.hasKey("age"))
    }

    @Test
    fun testGetString() {
        val jsonObject = JsonObject( JSONObject( "{\"name\":\"Elizabeth\"}" ))

        val result = jsonObject.getString("name")

        assertEquals("Elizabeth", result)
    }

    @Test
    fun testGetInt() {
        val jsonObject = JsonObject( JSONObject( "{\"age\":33}" ))

        val result = jsonObject.getInt("age")

        assertEquals(33, result)
    }

    @Test
    fun testGetStringArray() {
        val jsonObject = JsonObject( JSONObject( "{\"names\": [\"mark\", \"bob\"]}" ))

        val result = jsonObject.getStringArray("names")

        assertEquals(2, result.size)
        assertTrue( result.contains("mark") )
        assertTrue( result.contains("bob") )
    }
}