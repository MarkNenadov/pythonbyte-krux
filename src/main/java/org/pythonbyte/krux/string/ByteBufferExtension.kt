package org.pythonbyte.krux.string

import java.nio.ByteBuffer

fun ByteBuffer.asString(): String {
    val bytes = ByteArray(this.remaining())
    this.get(bytes)
    return String(bytes, Charsets.UTF_8)
}
