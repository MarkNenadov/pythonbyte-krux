package org.pythonbyte.krux.files

import java.io.InputStream

fun resourceToInputStream(fileName: String): InputStream {
    return Thread.currentThread().contextClassLoader.getResourceAsStream(fileName)
        ?: throw Exception("Can't load $fileName")
}
