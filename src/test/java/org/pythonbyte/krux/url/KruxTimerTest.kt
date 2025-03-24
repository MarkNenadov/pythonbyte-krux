package org.pythonbyte.krux.url

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.pythonbyte.krux.timer.KruxTimer

class KruxTimerTest {
    @Test
    fun `no time`() {
        with(KruxTimer()) {
            assertEquals(0, result)
        }
    }

    @Test
    fun `some time`() {
        with(KruxTimer()) {
            start()
            val number = 0..1000000
            for (x in number) {
                val y = x * 1000
            }
            stop()
            assertTrue(result > 0)
            assertTrue(result < 20)
        }
    }
}
