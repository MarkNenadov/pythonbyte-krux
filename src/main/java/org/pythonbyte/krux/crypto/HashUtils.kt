package org.pythonbyxte.krux.crypto

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

object HashUtils {
    private const val SHA1_HASH_ALGORITHM = "SHA-1"
    private const val SHA256_HASH_ALGORITHM = "SHA-256"

    fun String.sha1(): String = getDigest(this, SHA1_HASH_ALGORITHM).toHexString()

    fun String.sha256(): String = getDigest(this, SHA256_HASH_ALGORITHM).toHexString()

    private fun getDigest(
        value: String,
        algorithm: String,
    ): ByteArray {
        return try {
            val messageDigest = MessageDigest.getInstance(algorithm)
            messageDigest.digest(value.toByteArray())
        } catch (e: NoSuchAlgorithmException) {
            throw RuntimeException("Error creating $algorithm Digest", e)
        }
    }

    private fun ByteArray.toHexString(): String {
        return joinToString("") { "%02x".format(it) }
    }
}
