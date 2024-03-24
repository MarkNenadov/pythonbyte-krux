package org.pythonbyxte.krux.crypto

import org.pythonbyxte.krux.crypto.HashUtils.sha1
import org.pythonbyxte.krux.crypto.HashUtils.toHexString
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

object HashUtils {
    private const val SHA1_HASH_ALGORITHM = "SHA-1"
    private const val SHA256_HASH_ALGORITHM = "SHA-256"

    fun String.sha1(): String = this.hash(getDigest(SHA1_HASH_ALGORITHM))

    fun String.sha256(): String = this.hash(getDigest(SHA256_HASH_ALGORITHM))

    fun String.hash(messageDigest: MessageDigest): String = messageDigest.digest(this.toByteArray()).toHexString()

    private fun getDigest(algorithm: String): MessageDigest {
        return try {
            MessageDigest.getInstance(algorithm)
        } catch (e: NoSuchAlgorithmException) {
            throw RuntimeException("Error creating $algorithm Digest", e)
        }
    }

    private fun ByteArray.toHexString(): String {
        return joinToString("") { "%02x".format(it) }
    }
}
