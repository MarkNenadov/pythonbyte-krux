import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer
import java.util.zip.GZIPOutputStream
import kotlin.io.encoding.Base64

fun ByteBuffer.asString(): String {
    val bytes = ByteArray(this.remaining())
    this.get(bytes)
    return String(bytes, Charsets.UTF_8)
}

fun String.gzip(): String {
    val byteArrayOutputStream = ByteArrayOutputStream()

    GZIPOutputStream(byteArrayOutputStream).bufferedWriter(Charsets.UTF_8).use {
        it.write(this)
    }

    return String(byteArrayOutputStream.toByteArray())
}

@kotlin.io.encoding.ExperimentalEncodingApi
fun String.base64(): String {
    val byteArray = this.toByteArray()
    return Base64.encode(byteArray)
}
