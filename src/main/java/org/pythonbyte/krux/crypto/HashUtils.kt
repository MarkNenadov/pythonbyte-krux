package org.pythonbyxte.krux.crypto

import java.security.MessageDigest

object HashUtils {
    private const val SHA1_HASH_ALGORITHM = "SHA-1"
    private const val SHA256_HASH_ALGORITHM = "SHA-256"

    fun String.sha1(): String = this.hash(getDigest(SHA1_HASH_ALGORITHM))

    fun String.sha256(): String = this.hash(getDigest(SHA256_HASH_ALGORITHM))

    fun String.hash(messageDigest: MessageDigest): String = messageDigest.digest(this.toByteArray()).toHexString()

    fun String.hash(algorithm: String): String = getDigest(algorithm).digest(this.toByteArray()).toHexString()

    private fun getDigest(algorithm: String): MessageDigest = MessageDigest.getInstance(algorithm)

    private fun ByteArray.toHexString(): String {
        return joinToString("") { "%02x".format(it) }
    }
}
