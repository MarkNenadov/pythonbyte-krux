package org.pythonbyte.krux.properties

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PropertyReaderTest {
    @Test
    fun testTest() {
        val propertyReader = PropertyReader("test.properties")
        assertEquals("mark", propertyReader.get("name"))
    }
}