package org.pythonbyte.krux.properties

import java.lang.NullPointerException
import java.util.Properties


class PropertyReader(val propertiesFileName : String) {
    val properties = Properties()

    init {
        try {
            val propertiesFile = PropertyReader::class.java.getResourceAsStream(propertiesFileName)

            properties.load(propertiesFile)
        } catch( e : NullPointerException ) {
            throw PropertyReaderFileNotFoundException( propertiesFileName );
        }
    }

    fun get(propertyName: String): String {
        return properties.getProperty( propertyName )
    }
}