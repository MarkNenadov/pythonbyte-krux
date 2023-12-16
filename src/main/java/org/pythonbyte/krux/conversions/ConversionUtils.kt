package org.pythonbyte.krux.conversions

import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStreamReader
import java.nio.ByteBuffer
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream
import kotlin.io.encoding.Base64

fun ByteBuffer.asString(): String {
    val bytes = ByteArray(this.remaining())
    this.get(bytes)
    return String(bytes, Charsets.UTF_8)
}

fun String.gzip(): String {
    val byteArrayOutputStream = ByteArrayOutputStream()

    GZIPOutputStream(byteArrayOutputStream).use {
        it.write(this.toByteArray(Charsets.UTF_8))
    }

    return byteArrayOutputStream.toByteArray().toString(Charsets.ISO_8859_1)
}

fun String.gunzip(): String {
    val compressedData = this.toByteArray(Charsets.ISO_8859_1)
    val inputStream = ByteArrayInputStream(compressedData)
    val reader = BufferedReader(InputStreamReader(GZIPInputStream(inputStream), Charsets.UTF_8))

    val result = StringBuilder()
    var line: String?

    reader.use {
        while (reader.readLine().also { line = it } != null) {
            result.append(line)
        }
    }

    return result.toString()
}

@kotlin.io.encoding.ExperimentalEncodingApi
fun String.base64(): String {
    val byteArray = this.toByteArray()
    return Base64.encode(byteArray)
}
