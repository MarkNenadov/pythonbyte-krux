package org.pythonbyte.krux.properties

import java.lang.NullPointerException
import java.util.Properties

class PropertyReader(val propertiesFilePath : String) {
    val properties = Properties()

    init {
        try {
            val propertiesFile = PropertyReader::class.java.getResourceAsStream(propertiesFilePath)

            properties.load(propertiesFile)
        } catch( e : NullPointerException ) {
            throw PropertyReaderFileNotFoundException( propertiesFilePath );
        }
    }

    fun get(propertyName: String): String {
        return properties.getProperty( propertyName )
    }
}