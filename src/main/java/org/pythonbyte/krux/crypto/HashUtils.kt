package org.pythonbyte.krux.crypto

import java.security.MessageDigest

class HashUtils {
    companion object {
        fun sha1(value: String) : String {
            return getSha1Digest(value).joinToString("") {
                String.format("%02x", it)
            }
        }

        private fun getSha1Digest(value: String): ByteArray {
            return MessageDigest.getInstance("SHA-1").digest()
        }
    }
}
