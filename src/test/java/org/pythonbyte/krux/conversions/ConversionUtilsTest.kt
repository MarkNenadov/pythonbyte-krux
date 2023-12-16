package org.pythonbyte.krux.conversions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.io.encoding.ExperimentalEncodingApi

class ConversionUtilsTest {
    @OptIn(ExperimentalEncodingApi::class)
    @Test
    fun testGzipAndBase64() {
        val expectedBase64 = "H++/vQgAAAAAAADvv73vv71NLO+/vQYAT11G77+9BAAAAA=="
        assertEquals(
            expectedBase64,
            "Mark".gzip().base64(),
        )
    }

    @OptIn(ExperimentalEncodingApi::class)
    @Test
    fun testGzipAndGunzip() {
        val value = "My name is Ed. I am a turtle."
        val expectedGzippedBase64Value =
            "H8KLCAAAAAAAAMO/w7PCrVTDiEvDjE1Vw4gsVnBNw5FTw7BUSMOMVUhUKCktKsOJScOVAwBLw47DuDgdAAAA"

        assertEquals(
            expectedGzippedBase64Value,
            value.gzip().base64(),
        )
        assertEquals(value, value.gzip().gunzip())
    }
}
