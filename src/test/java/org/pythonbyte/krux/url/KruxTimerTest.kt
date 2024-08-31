package org.pythonbyte.krux.url

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.pythonbyte.krux.timer.KruxTimer

class KruxTimerTest {
    @Test
    fun `no time`() {
        val timer = KruxTimer()
        assertEquals(0, timer.result)
    }

    @Test
    fun `some time`() {
        val timer = KruxTimer()
        timer.start()
        val number = 0..1000000
        for (x in number) {
            val y = x * 1000
        }
        timer.stop()
        assertTrue(timer.result > 0)
        assertTrue(timer.result < 20)
    }
}
