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
    fun testConstructFromStringNotEmpty() {
        assertEquals(1, JsonArray("[{\"name\": \"Pete\"}]").length())
    }
}
