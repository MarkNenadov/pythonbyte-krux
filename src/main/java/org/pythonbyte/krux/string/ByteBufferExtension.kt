package org.pythonbyte.krux.string

import java.nio.ByteBuffer

fun ByteBuffer.asString(): ByteBuffer {
    val bytes = ByteArray(this.remaining())
    return this.get(bytes)
}
