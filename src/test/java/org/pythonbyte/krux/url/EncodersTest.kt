package org.pythonbyte.krux.url

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EncodersTest {
    @Test
    fun testUtf8UrlValue() {
        assertEquals("Joe+Smith", "Joe Smith".utf8UrlValue())
        assertEquals("Joe%3DSmith", "Joe=Smith".utf8UrlValue())
    }

    @Test
    @SuppressWarnings("unused")
    fun testMapToUrlParameterStringWhenEmpty() {
        val fruitMap = mapOf<String, String>()
        assertEquals("", mapToUrlParameterString(fruitMap))
    }

    @Test
    @SuppressWarnings("unused")
    fun testMapToUrlParameterStringWithSingleEntry() {
        val fruitMap = mapOf("apple" to "yum")

        assertEquals("apple=yum", mapToUrlParameterString(fruitMap))
    }

    @Test
    @SuppressWarnings("unused")
    fun testMapToUrlParameterStringWithMultipleEntries() {
        val fruitMap =
            mapOf(
                "apple" to "yum",
                "orange" to "ok",
                "clementine" to "wow",
            )

        assertEquals("apple=yum&orange=ok&clementine=wow", mapToUrlParameterString(fruitMap))
    }
}
