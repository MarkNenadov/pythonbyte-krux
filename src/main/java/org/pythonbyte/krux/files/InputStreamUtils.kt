package org.pythonbyte.krux.files

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

fun resourceToInputStream(fileName: String): InputStream {
    return Thread.currentThread().contextClassLoader.getResourceAsStream(fileName)
        ?: throw Exception("Can't load $fileName")
}

fun InputStream.getAsString(): String {
    return BufferedReader(InputStreamReader(this)).useLines { lines ->
        lines.joinToString("\n")
    }
}
