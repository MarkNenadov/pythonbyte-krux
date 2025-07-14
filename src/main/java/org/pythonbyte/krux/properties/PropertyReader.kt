package org.pythonbyte.krux.properties

import java.lang.NullPointerException
import java.util.Properties

class PropertyReader(propertiesFileName: String) {
    private val properties = Properties()

    init {
        require(propertiesFileName.isNotEmpty()) {
            "Unable to initialize property reader with empty property file name"
        }
        try {
            val propertiesFile = PropertyReader::class.java.getResourceAsStream(propertiesFileName)

            properties.load(propertiesFile)
        } catch (e: NullPointerException) {
            throw PropertyReaderFileNotFoundException(propertiesFileName)
        }
    }

    fun get(propertyName: String): String {
        require(propertyName.isNotEmpty()) {
            "Unable to get empty property name"
        }
        return properties.getProperty(propertyName)
    }
}
