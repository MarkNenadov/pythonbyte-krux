package org.pythonbyte.krux.crypto

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

object HashUtils {
    private const val HASH_ALGORITHM = "SHA-1"

    fun String.sha1(): String {
        return try {
            getSha1Digest(this).toHexString()
        } catch (e: NoSuchAlgorithmException) {
            throw RuntimeException("Error creating SHA-1 Digest", e)
        }
    }

    private fun getSha1Digest(value: String): ByteArray {
        val messageDigest = MessageDigest.getInstance(HASH_ALGORITHM)
        return messageDigest.digest(value.toByteArray())
    }

    private fun ByteArray.toHexString(): String {
        return joinToString("") { "%02x".format(it) }
    }
}
