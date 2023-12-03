import java.io.ByteArrayOutputStream
import java.util.zip.GZIPOutputStream

fun gzip(content: String): String {
    val byteArrayOutputStream = ByteArrayOutputStream()

    GZIPOutputStream(byteArrayOutputStream).bufferedWriter(Charsets.UTF_8).use {
        it.write(content)
    }

    return String(byteArrayOutputStream.toByteArray())
}
