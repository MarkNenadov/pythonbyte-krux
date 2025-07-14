package org.pythonbyte.krux.conversions

import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStreamReader
import java.nio.ByteBuffer
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream
import kotlin.io.encoding.Base64

fun ByteBuffer.asString(): String = Charsets.UTF_8.decode(this).toString()

fun String.gzip(): String {
    require(isNotEmpty()) {
        "Pointless to gzip an empty string"
    }
    return ByteArrayOutputStream().use { byteArrayOutputStream ->
        GZIPOutputStream(byteArrayOutputStream).use {
            it.write(this.toByteArray(Charsets.UTF_8))
        }

        byteArrayOutputStream.toByteArray().toString(Charsets.ISO_8859_1)
    }
}

fun String.gunzip(): String {
    require(isNotEmpty()) {
        "Pointless to gzip an empty string"
    }

    val inputStream = ByteArrayInputStream(this.toByteArray(Charsets.ISO_8859_1))

    val result = StringBuilder()
    var line: String?

    val reader = BufferedReader(InputStreamReader(GZIPInputStream(inputStream), Charsets.UTF_8))
    reader.use {
        while (reader.readLine().also { line = it } != null) {
            result.append(line)
        }
    }

    return result.toString()
}

@kotlin.io.encoding.ExperimentalEncodingApi
fun String.base64(): String {
    require(isNotEmpty()) {
        "Pointless to base64 an empty string"
    }

    return Base64.encode(this.toByteArray())
}
