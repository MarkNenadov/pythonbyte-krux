package org.pythonbyte.krux.crypto

import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.pythonbyxte.krux.crypto.HashUtils.sha1
import org.pythonbyxte.krux.crypto.HashUtils.sha256

class HashUtilsTest {
    @Test
    fun testSha1() {
        val result = "Mark".sha1()
        assertNotNull(result)
        assertNotEquals("", result)
    }

    @Test
    fun testSha256() {
        val result = "Mark".sha256()
        assertNotNull(result)
        assertNotEquals("", result)
    }
}
