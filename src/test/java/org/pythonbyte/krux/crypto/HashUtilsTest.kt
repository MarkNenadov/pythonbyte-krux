package org.pythonbyte.krux.crypto

import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.pythonbyte.krux.crypto.HashUtils.hash
import org.pythonbyte.krux.crypto.HashUtils.sha1
import org.pythonbyte.krux.crypto.HashUtils.sha256
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class HashUtilsTest {
    @Test
    fun `sha1 happy flow`() {
        val result = "Mark".sha1()
        assertNotNull(result)
        assertNotEquals("", result)
    }

    @Test
    fun `sha2 happy flow`() {
        val result = "Mark".sha256()
        assertNotNull(result)
        assertNotEquals("", result)
    }

    @Test
    fun `hash with message digest happy flow`() {
        val result = "Mark".hash(MessageDigest.getInstance("SHA-256"))
        assertNotNull(result)
        assertNotEquals("", result)
    }

    @Test
    fun `hash with string algorithm happy flow`() {
        val result = "Mark".hash("SHA-256")
        assertNotNull(result)
        assertNotEquals("", result)
    }

    @Test
    fun `hash with string algorithm bad digest flow`() {
        assertThrows(NoSuchAlgorithmException::class.java) {
            "Mark".hash("BLAH-256")
        }
    }
}
