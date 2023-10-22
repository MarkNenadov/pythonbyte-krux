package org.pythonbyte.krux.mapping

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GpsCoordinatesTest {
    @Test
    fun test() {
        assertEquals( 41.9554.toFloat(), GpsCoordinates( "41.9553986,-82.5139999" ).longitude )
        assertEquals( -82.514.toFloat(), GpsCoordinates( "41.9553986,-82.5139999" ).latitude )
    }
}