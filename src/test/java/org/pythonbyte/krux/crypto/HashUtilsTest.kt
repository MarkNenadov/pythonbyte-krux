package org.pythonbyte.krux.crypto

import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.pythonbyte.krux.crypto.HashUtils.Companion.sha1

class HashUtilsTest {
    @Test
    fun testSha1() {
        val result = sha1("Mark")
        assertNotNull( result )
        assertNotEquals( "", result )
    }
}