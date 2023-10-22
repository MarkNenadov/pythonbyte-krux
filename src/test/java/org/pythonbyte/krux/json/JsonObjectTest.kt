package org.pythonbyte.krux.json

import org.json.JSONObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class JsonObjectTest {
    @Test
    fun testGetStringArray() {
        val jsonObject = JsonObject( JSONObject( "{\"names\": [\"mark\", \"bob\"]}" ))

        val result = jsonObject.getStringArray("names")

        assertEquals(2, result.size)
        assertTrue( result.contains("mark") )
        assertTrue( result.contains("bob") )
    }
}