package org.pythonbyte.krux.mapping

class GpsCoordinates(longitudeLatitude: String?) {
    var longitude : Float
    var latitude : Float

    init {
        val cleanedValue = cleanSpaces(longitudeLatitude!!)
        if ( cleanedValue.contains(",") ) {
            val splitValues = cleanedValue.split(",")

            if ( splitValues.size != 1 ) {
                longitude = splitValues[0].toFloat()
                latitude = splitValues[1].toFloat()
            } else {
                throw GpsCoordinateFormattingException( "Value [$longitudeLatitude] doesn't represent valid GPS coordinates. too many commas." )
            }
        } else {
            throw GpsCoordinateFormattingException( "Value [$longitudeLatitude] doesn't represent valid GPS coordinates. ',' is missing" )
        }
    }

    override fun toString() : String {
        return "$longitude,$latitude"
    }

    private fun cleanSpaces(value: String): String {
        return value.replace( " ", "")
    }
}