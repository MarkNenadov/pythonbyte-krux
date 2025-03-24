package org.pythonbyte.krux.json

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JsonArrayTest {
    @Test
    fun testConstructFromStringVariousFormsOfEmpty() {
        assertEquals(0, JsonArray("{}").length())
        assertEquals(0, JsonArray("[]").length())
    }

    @Test
    fun testGetAsListWithEmptyList() {
        assertEquals(0, JsonArray("{}").getAsList().size)
        assertEquals(0, JsonArray("[]").getAsList().size)
    }

    @Test
    fun testGetAsListWithPopulatedList() {
        val asList = JsonArray("[{'name':'george'},{'name':'mike'},{'name':'helen'}]").getAsList()
        assertEquals(3, asList.size)
        assertEquals("george", asList[0].getString("name"))
        assertEquals("mike", asList[1].getString("name"))
        assertEquals("helen", asList[2].getString("name"))
    }

    @Test
    fun testConstructFromStringNotEmpty() {
        assertEquals(1, JsonArray("[{\"name\": \"Pete\"}]").length())
    }
}
