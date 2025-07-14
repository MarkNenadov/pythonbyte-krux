package org.pythonbyte.krux.files

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

fun resourceToInputStream(fileName: String): InputStream {
    require(fileName.isNotEmpty()) {
        "Can't obtain input stream for resource with empty file name."
    }
    return Thread.currentThread().contextClassLoader.getResourceAsStream(fileName)
        ?: throw Exception("Can't load $fileName")
}

fun InputStream.getAsString(): String {
    return BufferedReader(InputStreamReader(this)).useLines { lines ->
        lines.joinToString("\n")
    }
}

fun BufferedReader.readSplit(splitValue: String): List<String> {
    return readLine().split(splitValue)
}

fun BufferedReader.readSplits(splitValue: String): List<List<String>> {
    return readLines().map { it.split(splitValue) }
}
