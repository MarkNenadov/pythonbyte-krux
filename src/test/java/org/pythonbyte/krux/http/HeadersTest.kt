package org.pythonbyte.krux.http
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class HeadersTest {
    @Test
    fun testBuildHeadersWhenEmptyHeaders() {
        with(buildHeaders()) {
            assertEquals(0, size)
        }
    }

    @Test
    fun testBuildHeadersWhenNotEmptyHeaders() {
        with(
            buildHeaders(
                mapOf(
                    "name" to "Mark",
                    "age" to "88",
                ),
            ),
        ) {
            assertEquals(2, size)
            assertTrue(names().contains("name"))
            assertTrue(names().contains("age"))
            assertEquals("Mark", get("name"))
            assertEquals("88", get("age"))
        }
    }
}
