package org.pythonbyte.krux.properties

class PropertyReaderFileNotFoundException(propertiesFilePath: String) : Exception("Properties file [$propertiesFilePath] not found in resources.")
