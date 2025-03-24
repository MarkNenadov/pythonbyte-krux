package org.pythonbyte.krux.properties

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PropertyReaderTest {
    @Test
    fun testWithExistingFile() {
        val propertyReader = PropertyReader("/test.properties")
        assertEquals("mark", propertyReader.get("name"))
    }

    @Test
    fun testWithNonExisitngFile() {
        assertThrows<PropertyReaderFileNotFoundException> {
            PropertyReader("/notexist.properties")
        }
    }
}
